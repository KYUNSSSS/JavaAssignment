package assignment;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
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
       static int currentUser=0;
       static boolean result;
//       static double point;
       //System allow n number users to register(in this case 10)
       static Customer[]customer = new Customer[100];
       
    
    public static void main(String[] args) {
        
            
            
            
        String[] reProdNames = {"Pillow","Headphone","Backpack"};
        String[] reProdDesc = {"Harvey Norman","CookingPanDesc","BackpackDesc"};
        int[] reQtyRemain= {10,12,15};
        int[] reRequiredPts = {50,300,500};

        String[] liTier = {"Silver","Gold","Platinum"};
        String[] liProdNames = {"Vacuum Cleaner","Cooking Pan","Knife Set"};
        String[] liProdDesc = {"VacuumCleanerDesc","CookingPanDesc","KnifeSetDesc"};
        int[] liQtyRemain = {10,13,20};
        int[] liRequiredPts = {500,600,600};   

        String[] vcNames = {"RM5 Discount Voucher","RM10 Discount Voucher","RM20 Discount Voucher"};
        String[] vcDesc = {"Deduct RM5 on Next Purchase","Deduct RM10 on Next Purchase","Deduct RM20 on Next Purchase"};
        int[] vcQtyRemain = {10,10,10};
        int[] vcRequiredPts = {490,950,1900};
        
        Loyalty loyalty = new Loyalty();
       // Point pts = new Point(customer[currentUser]);
        Redemption rdp = new Redemption();
        Report report = new Report();

         readCustomersFile();
//         for (int x=0;x<customer.length;x++){
//             System.out.println(customer[x].getPhoneNum());
//         }
       Scanner input = new Scanner(System.in);
       Menu.splashScreen();
      
      do{
        readCustomersFile();
        Menu.mainMenu();
        choice = input.nextInt();
           switch (choice) {
               case 1:
                   customer[Customer.getUserRegistered()] = new Customer();
                   customer[Customer.getUserRegistered()].enterDetail();
                   System.out.println(Customer.getUserRegistered());
                   Menu.backAction();
                   break;
               case 2:                
                   do{
                    System.out.print("Enter Phone Number (0 to back): ");
                    phonenum = input.nextInt();   
                    if(phonenum ==0){
                       
                        break;
                        
                    }
                    for(int i= 0;i<customer.length;i++){
                        if(customer[i].getPhoneNum()==phonenum){
                              System.out.println("User Found!");
                              result=true;
                              currentUser=i;
                              do{
                    System.out.println("Welcome back,"+customer[currentUser].getName());
                    Menu.userMenu();
                    choice = input.nextInt();
                    switch(choice){
                        case 1:
                            customer[currentUser].updateDetail();
                           Menu.backAction();
                            break;
                        case 2:
                            customer[currentUser].updateAmount();
                             Menu.backAction();
                            break;
                        case 3:
                            Point pointInstance = new Point(customer[currentUser]);
                            pointInstance.checkAmount();
                            pointInstance.checkExpiryDate();
                            Menu.backAction();
                            break;
                        case 4:
                            
                            Scanner scanner = new Scanner(System.in);
                            Menu.redeemMenu();
                            int opt = scanner.nextInt();

                            switch(opt){
                                case 1:
                                    rdp.redeemProduct(reProdNames,reQtyRemain,reRequiredPts);
                                    break;
                                case 2:
                                    rdp.redeemProduct(liProdNames,liQtyRemain,liRequiredPts);
                                    break;                
                                case 3:
                                    rdp.redeemProduct(vcNames,vcQtyRemain,vcRequiredPts);
                                    break;
                                default:
                                    System.out.print("Cancelled redemption");
                            }
                        case 5:
                            double amount = customer[currentUser].getTotalPurchaseAmount();
                            loyalty.updateTier(amount, customer[currentUser]);
                            System.out.println(customer[currentUser].displayProfile());
                            //System.out.println("Points      : " + pts.getPoint());
                            //ReferralCode referralCustomer = new ReferralCode(); 
                            //referralCustomer.displayReferralCode(customer, currentUser);
                            System.out.println(loyalty.displayTier());
                            System.out.println();
                            report.calculateTierCust(customer);
                            System.out.println(report.displayReport());
                            break;
                        case 6:
                            
                            Menu.backAction();
                            break;
                        default:
                            Menu.backAction();                         
                    }
                   }while(choice!=6 && result==true);
                              choice=0;
                              break;
                             }
                   }
                   if(result==false){
                                System.out.println("User not found,Please Try Again.");
                                }
                    
                   
                   }while(result==false);
                   
                   break;
               case 3:
                   System.out.println("Thank you for using our system!");
                        break;
               default:
                   break;
           }
      }while(choice !=3 );    
        updateCustomerFile(customer);
        updateReferralCode();
    }
    public static boolean chkPhoneNumber(int hpnum){
        File custfile = new File("customerfile.txt");
            try {
               
            //FileWriter writer = new FileWriter(custfile,true);
            Scanner read = new Scanner(custfile);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] values = line.split(",");
                if (values.length > 0) {
                    if(hpnum == Integer.parseInt(values[4])){
                       result=true;
                        break; 
                    }else{
                        result=false;
                    }
                     
                }
            }
            
            
            } catch (IOException e) {
              System.out.println("An error occurred.");
            }
        
    
        return result;
   }
    public static void readCustomersFile() {
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

    public static void file(){
        File custfile = new File("customerfile.txt");
            try {
               
            FileWriter writer = new FileWriter(custfile,true);
            Scanner read = new Scanner(custfile);
            read.useDelimiter(",");

            } catch (IOException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }
        
    }
    public static void updateCustomerFile(Customer[]customer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("customerfile.txt"));
            for (int i = 0; i < customer.length; i++) {
                if (customer[i] != null) {
                    String customerData = i+","+customer[i].getName()+ "," + customer[i].getAge() + ","+customer[i].getEmail()+","+customer[i].getPhoneNum()+","+customer[i].getTotalPurchaseAmount();
                    writer.write(customerData);
                    writer.newLine();
                }
            }
            writer.close();
            System.out.println("Customer file updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating customer file.");
            e.printStackTrace();
        }
    }
    public static void updateReferralCode() {
        // Create an instance of ReferralCode
        ReferralCode referralCodeGenerator = new ReferralCode();
       
        // Pass the current customer object to the addReferralCodeToFile method
        referralCodeGenerator.addReferralCodeToFile();
       }
}
