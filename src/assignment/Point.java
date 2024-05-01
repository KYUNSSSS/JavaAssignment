package assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Point {
    private int point;
    private LocalDate ftPurchaseDate;
    private LocalDate expiryDate;
    private Customer customer;

    public Point(Customer customer) {
        this.customer = customer;
        double totalAmount = customer.getTotalPurchaseAmount(); 
        this.point = (int) Math.round(totalAmount);
        
        if (totalAmount > 0) {
            this.ftPurchaseDate = LocalDate.now();
            this.expiryDate = ftPurchaseDate.plusDays(365); 
        } else {
            this.ftPurchaseDate = null; 
            this.expiryDate = null; 
        }
    }

    public Point(int point, LocalDate expiryDate, Customer customer) {
        this.expiryDate = expiryDate;
        this.point = point;
        this.customer = customer;
    }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void checkAmount() {
        double amount = customer.getTotalPurchaseAmount();
        if (amount > 0) {
            ftPurchaseDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate = ftPurchaseDate.format(formatter);
            System.out.println("First Time Purchase Date: " + formattedDate);
        } else if (amount==0) {
            this.ftPurchaseDate = null;
            System.out.println("You do not have any purchase records.");
        }else{
            System.out.println("Error! The amount should not less than 0.");
        }
    }

    public void checkExpiryDate() {
        if (ftPurchaseDate == null){
        System.out.println("Please make a payment first.\n");
        }else if(LocalDate.now().isAfter(expiryDate)) {
            System.out.println("Points have expired.\nPoints Now: 0");
            point = 0;
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            System.out.println("Total Points: " + point);
            System.out.println("Points will expire on: " + expiryDate.format(formatter) + "\n");
        }
    }
}
