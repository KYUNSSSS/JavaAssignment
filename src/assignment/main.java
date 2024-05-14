package assignment;

import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class main {

    static int phonenum;
    static int choice;
    static int selection;
    static int currentUser = 0;
    static boolean result;
    // static double point;
    // System allow n number users to register(in this case 100)
    static Customer[] customer = new Customer[100];

    public static void main(String[] args) {

        Loyalty loyalty = new Loyalty();
        Redemption redemption = new Redemption();
        // Point pts = new Point(customer[currentUser]);
    Product[] product={
        new AllTierProduct("Pillow","Harvey Norman",10,0,50),
        new AllTierProduct("Headphone","Harvey Norman",12,0,50),
        new AllTierProduct("Backpack","Harvey Norman",15,0,50),
        new LimitedProduct("Silver","Vacuum Cleaner","VCDesc",10,0,150),
        new LimitedProduct("Gold","Cooking Pan","CPDesc",12,0,150),
        new LimitedProduct("Platinum","Knife Set","KSDesc",14,0,150),
        new Voucher("RM 5 Discount Voucher","Deduct RM5 on Next Purchase",15,0,50),
        new Voucher("RM 10 Discount Voucher","Deduct RM10 on Next Purchase",15,0,90),
        new Voucher("RM 20 Discount Voucher","Deduct RM20 on Next Purchase",15,0,150),
    };
        Report report = new Report();
        Product products = new Product();

        // for (int x=0;x<customer.length;x++){
        // System.out.println(customer[x].getPhoneNum());
        // }
        Scanner input = new Scanner(System.in);
        Menu.splashScreen();

        do {
            readCustomersFile();
            Menu.adminOrCustMenu();
            selection = enterChoice();
            products.readProductFile(product);
            products.updateProductFile(product);;

            switch (selection) {
                case 1:
                    readCustomersFile();
//                    product.readProductFile();
                    
                    

                    do {
                        Menu.mainMenu();
                        choice = enterChoice();

                        switch (choice) {
                            case 1:
                                customer[Customer.getUserRegistered()] = new Customer();
                                customer[Customer.getUserRegistered()].enterDetail();
                                pressEnterToContinue();
                                Menu.backAction();
                                break;
                            case 2:

                                do {
                                    phonenum = Customer.checkPhoneNumber();
                                    if (phonenum == 0)
                                        break;
                                    for (int i = 0; i < customer.length; i++) {
                                        if (customer[i] != null) {
                                            if (customer[i].getPhoneNum() == phonenum) {
                                                System.out.println("User Found!\n");
                                                result = true;
                                                currentUser = i;

                                                do {
                                                    System.out
                                                            .println("Welcome back," + customer[currentUser].getName()
                                                            +"\nPoint Balance: "
                                                            + (int) customer[currentUser].getTotalPurchaseAmount()
                                                            + "\n");
                                                    Menu.userMenu();
                                                    choice = enterChoice();
                                                    switch (choice) {
                                                        case 1:
                                                            customer[currentUser].updateDetail();
                                                            pressEnterToContinue();
                                                            Menu.backAction();

                                                            break;
                                                        case 2:
                                                            customer[currentUser].updateAmount();
                                                            updateCustomerFile(customer);
                                                            pressEnterToContinue();
                                                            Menu.backAction();

                                                            break;
                                                        case 3:
                                                            Point pointInstance = new Point(customer);
                                                            pointInstance.checkAmount(customer);
                                                            pointInstance.checkExpiryDate(customer);
                                                            Menu.backAction();

                                                            break;
                                                        case 4:
                                                            loyalty.updateTier(customer);
                                                            redemption.redeemProduct(product, customer,
                                                                    customer[currentUser].getTier());
                                                            break;
                                                        case 5:
                                                            loyalty.updateTier(customer);
                                                            System.out.println(customer[currentUser].displayProfile());
                                                            System.out.println(loyalty.displayTier());
                                                            System.out.println();
                                                            pressEnterToContinue();
                                                            Menu.backAction();

                                                            break;
                                                        case 6:
                                                            customer[currentUser].updateReferralCode();
                                                            updateCustomerFile(customer);
                                                            Menu.backAction();
                                                            break;
                                                        case 7:
                                                            PointEarn pointEarn = new PointEarn(customer);
                                                            pointEarn.playGame(customer);
                                                            Menu.backAction();
                                                            break;
                                                        case 8:
                                                            Policy.displayFAQandTerms();
                                                            Menu.backAction();
                                                            break;
                                                        default:
                                                            Menu.backAction();
                                                    }
                                                    // updateCustomerFile(customer);
                                                } while (choice != 9 && result == true);

                                                break;
                                            }
                                        }
                                    }
                                    if (result == false) {
                                        System.out.println("User not found,Please Try Again.");
                                    }

                                } while (result == false);
                                choice = 0;

                                break;
                            case 3:

                                break;
                            default:
                                break;
                        }

                        updateCustomerFile(customer);
//                        aTierProd.updateProductFile();
                    } while (choice != 3);
                    break;
                case 2:
                    System.out.print("Enter Username: ");
                    String username = input.next();
                    System.out.print("Enter Password: ");
                    String apw = input.next();
                    File adminfile = new File("adminfile.txt");
                    try {
                        Scanner a = new Scanner(adminfile);
                        while (a.hasNextLine()) {
                            String line = a.nextLine();
                            String[] values = line.split(",");

                            String chkUsername = values[1];
                            String chkApw = values[2];

                            if (username.equals(chkUsername)) {
                                if (apw.equals(chkApw)) {
                                    int reportChoice;

                                    do {
                                        Menu.reportMenu();
                                        System.out.print("Select Report to view: ");
                                        reportChoice = input.nextInt();

                                        switch (reportChoice) {
                                            case 1:
                                                // Customer Tier
                                                report.setReportTitle("Customer Tier Report");
                                                loyalty.updateTier(customer);
                                                report.calculateTierCust(customer);
                                                report.displayTierReport();
                                                break;
                                            case 2:
                                                // Redemption

                                                // Menu.prodReportMenu();
                                                report.displayRedemptionReport(product);
//                                                report.displayRedemptionReport(aTierProd);
//                                                report.displayRedemptionReport(liProd);
//                                                report.displayRedemptionReport(voucher);
                                                // maybe can add some alert like the particular stock number is less
                                                // than 10
                                                System.out.print("Do you want to increase stock inventory? (Y/N) : ");
                                                String increase = input.next();
                                                if ((increase.toUpperCase()).equals("Y")) {
//                                                    Menu.stockMenu();
                                                    System.out.print("Enter Product No.: ");
                                                    int stock = input.nextInt();
                                                    System.out.print("Enter number to increase: ");
                                                    int addStock = input.nextInt();
                                                    report.updateStockInventory(stock, addStock, product);
                                                }
                                                break;
                                            case 3:
                                                // Points
                                                // For each customer, take total point earned and redeemed, earn =
                                                // accumPoint; redeem = earn - balance
                                                report.displayPointReport(customer);
                                                break;
                                            case 4:
                                                // Back
                                                System.out.print("Back");
                                                break;
                                            default:
                                                break;
                                        }
                                    } while (reportChoice == 1 || reportChoice == 2 || reportChoice == 3);
                                }
                            }
                        }
                        a.close();
                    } catch (IOException e) {
                        System.out.println("An error occurred while reading customer data.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using our system!");
                    break;
                default:
                    break;
            }
        } while (selection != 3);
        updateCustomerFile(customer);
    }

    public static void readCustomersFile() {
        currentUser = 0;
        for (int i = 0; i < customer.length; i++) {
            customer[i] = null;
        }
        File custFile = new File("customerfile.txt");
        try {
            Scanner scanner = new Scanner(custFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");

                Customer newCustomer = new Customer();
                
                newCustomer.setName(values[1]); // Example, modify according to your class structure
                newCustomer.setAge(Integer.parseInt(values[2]));
                newCustomer.setEmail(values[3]);
                newCustomer.setPhoneNum(Integer.parseInt(values[4]));
                newCustomer.setTotalPurchaseAmount(Double.parseDouble(values[5]));
                String dateString = values[6]; // Assuming values[6] contains the date string
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate pointDate = LocalDate.parse(dateString, formatter);
                newCustomer.setPointDate(pointDate);
                newCustomer.setPointAccumulate(Integer.parseInt(values[7]));

                // Add the new customer to the customer array
                customer[currentUser++] = newCustomer;

                // Break if the customer array is filled
                if (currentUser >= customer.length) {

                    break;
                }
            }
            scanner.close();
           
        } catch (IOException e) {
            System.out.println("An error occurred while reading customer data.");
            e.printStackTrace();
        }
    }

    public static void updateCustomerFile(Customer[] customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("customerfile.txt"));
            for (int i = 0; i < customer.length; i++) {
                if (customer[i] != null) {
                    String customerData = i + "," + customer[i].getName() + "," + customer[i].getAge() + ","
                            + customer[i].getEmail() + "," + customer[i].getPhoneNum() + ","
                            + customer[i].getTotalPurchaseAmount() + "," + customer[i].getPointDate().toString() + ","
                            + customer[i].getPointAccumulate();
                    writer.write(customerData);
                    writer.newLine();
                }
            }
            writer.close();
            // System.out.println("Customer file updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating customer file.");
            e.printStackTrace();
        }
    }   

    public static void pressEnterToContinue() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPress Enter key to continue...");
        try {
            System.in.read();
            scan.nextLine();
        } catch (Exception e) {
        }
    }

    public static int enterChoice() {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean a = true;
        do {
            try {
                System.out.print("\nEnter Choice: ");
                num = scan.nextInt();
                a = true;
            } catch (Exception ex) {
                System.out.println("Please enter numbers displayed only.");
                a = false;
                scan.nextLine();
            }

        } while (a == false);

        return num;

    }

}
