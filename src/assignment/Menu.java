/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
//hi
import static assignment.main.customer;
import java.time.LocalDate;
//hehe
//hihi
/**
 *
 * @author Hp
 */
public class Menu {
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public static void splashScreen(){
        System.out.println(YELLOW+"""
                             ____  ______ ________          __     _____  _____  
                            |  _ \\|  ____|  ____\\ \\        / /\\   |  __ \\|  __ \\ 
                            | |_) | |__  | |__   \\ \\  /\\  / /  \\  | |__) | |  | |
                            |  _ <|  __| |  __|   \\ \\/  \\/ / /\\ \\ |  _  /| |  | |
                            | |_) | |____| |____   \\  /\\  / ____ \\| | \\ \\| |__| |
                            |____/|______|______|   \\/  \\/_/    \\_\\_|  \\_\\_____/                                                                                
                                                                                 """+RESET);
        
    }
    public static void mainMenu(){
        System.out.println("\n***************************************************************");
        System.out.println("*                   Welcome to Customer Menu                  *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                   1. Register New Account                   *");
        System.out.println("*                   2. Login To Existing Account              *");
        System.out.println("*                   3. Exit                                   *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
    }
    public static void userMenu(){
        System.out.println("***************************************************************");
        System.out.println("*                     Customer Main Menu                      *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                     1. Update Details                       *");
        System.out.println("*                     2. Add New Transaction Amount           *");
        System.out.println("*                     3. Check Point Expiry                   *");
        System.out.println("*                     4. Redeem Product                       *");
        System.out.println("*                     5. Profile                              *");
        System.out.println("*                     6. Referral Code                        *");
        System.out.println("*                     7. Play Game                            *");
        System.out.println("*                     8. Frequenctly Asked Questions          *");
        System.out.println("*                     9. Terms and Conditions                 *");
        System.out.println("*                     10. Back                                *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
  
    }
    public static void backAction(){
        System.out.println("\n===========GOING BACK==========\n");
    }
    
    public static void redeemMenu(){
        System.out.print("Redeem Option\n1. All Tier Product\n2. Limited Tier Product\n3. Voucher\n4. Exit\n");
    }
    
    public static void reportMenu(){
        System.out.println("\n***************************************************************");
        System.out.println("*                       Type of Report                        *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                    1. Customer Tier Report                  *");
        System.out.println("*                    2. Redemption Report                     *");
        System.out.println("*                    3. Points Report                         *");
        System.out.println("*                    4. Exit                                  *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
    }
    
    public static void prodReportMenu(){
        System.out.print("Product Report Option\n1. Normal Redemption Product\n2. Limited Redemption Product\n3. Voucher\n4. Back\n");
    }


    public static void adminOrCustMenu(){
        System.out.println("***************************************************************");
        System.out.println("*                       Continue As                           *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                       1. Customer                           *");
        System.out.println("*                       2. Admin User                         *");
        System.out.println("*                       3. Exit                               *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
       
    }
    
    public static void displayPolicyMenu(){
        System.out.println("\n***************************************************************");
        System.out.println("*                      Welcome to Policy Menu                 *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                       1. Point Earn                         *");
        System.out.println("*                       2. Redemption                         *");
        System.out.println("*                       3. Membership Tier                    *");
        System.out.println("*                       4. Back                               *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
    }
    public static void customerUpdateMenu(){
        System.out.println("\n***************************************************************");
        System.out.println("*                       What to Update?                       *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                       1.                          *");
        System.out.println("*                       2. Redemption                         *");
        System.out.println("*                       3. Membership Tier                    *");
        System.out.println("*                       4. Back                               *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
    }

}
