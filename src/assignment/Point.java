package assignment;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Point {
    private int point;
    private LocalDate ftPurchaseDate;
    private LocalDate expiryDate;

    public Point() {
    }
       
    public Point(Customer[] customer) {
        double totalAmount = customer[main.currentUser].getTotalPurchaseAmount();
        this.point = (int) Math.round(totalAmount);

        if (totalAmount > 0) {
            this.ftPurchaseDate = customer[main.currentUser].getPointDate();
            if (ftPurchaseDate != null) {
                this.expiryDate = ftPurchaseDate.plusDays(366);
            } else {
                this.expiryDate = null;
            }
        } else {
            this.ftPurchaseDate = null;
            this.expiryDate = null;
        }
    }

//    public Point(int point, LocalDate expiryDate, Customer[] customer) {
//        this.expiryDate = expiryDate;
//        this.point = point;
//        this.customer = customer;
//    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

  

    public void checkAmount(Customer []customer) {
        double amount = customer[main.currentUser].getTotalPurchaseAmount();
        if (amount > 0) {
            if (ftPurchaseDate != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedDate = ftPurchaseDate.format(formatter);
                System.out.println("First Time Purchase Date: " + formattedDate);
            } else {
                System.out.println("Error: First time purchase date is null.");
            }
        } else if (amount == 0) {
            this.ftPurchaseDate = null;
            System.out.println("You do not have any purchase records.");
        } else {
            System.out.println("Error! The amount should not be less than 0.");
        }
    }

    public void checkExpiryDate(Customer[] customer) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        boolean validDate = false;
        boolean validRange = false;
        LocalDate currentDate = null;

        while (!validDate) {
            System.out.print("Enter Current Purchase Date (DD-MM-YYYY): ");
            String currentDateStr = scanner.nextLine();

            try {
                currentDate = LocalDate.parse(currentDateStr, formatter);
                validDate = true;
            } catch (Exception e) {
                System.out.println("Error: Invalid date format. Please enter date in DD-MM-YYYY format.");
            }
        }

        if (ftPurchaseDate != null && currentDate.isBefore(ftPurchaseDate)) {
            System.out.println("Error: Current purchase date cannot be before the first time purchase date.");
        }else {
            validRange = true;
        }

        if (validRange) {
            if (ftPurchaseDate == null) {
                System.out.println("Please make a payment first.\n");
            }else if (expiryDate != null && currentDate.isAfter(expiryDate)) {
                System.out.println("Points have expired on " + expiryDate.format(formatter) + "\nTotal Points: 0\n");
                point = 0;
                customer[main.currentUser].setTotalPurchaseAmount(0);
                ftPurchaseDate = expiryDate;
                updatePointDate(customer);
            }else {
                System.out.println("Total Points: " + point);
                System.out.println("Points will expire on: " + expiryDate.format(formatter) + "\n");
            }
        }
    }

    public void updatePointDate(Customer []customer) {
        if (ftPurchaseDate != null && ftPurchaseDate.equals(expiryDate)) {
            customer[main.currentUser].setPointDate(ftPurchaseDate);
        }
    }

}
