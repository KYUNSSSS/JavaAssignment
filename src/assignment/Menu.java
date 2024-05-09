/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
//hi
import static assignment.main.customer;
import java.time.LocalDate;

/**
 *
 * @author Hp
 */
public class Menu {
    public static void splashScreen(){
        System.out.println("WELCOME TO BEEWARD!");
        
    }
    public static void mainMenu(){
        System.out.print("1.Register New Account\n2.LOGIN TO EXISTING ACCOUNT\n3.Exit\nEnter Your Choice: ");
    }
    public static void userMenu(){
        System.out.print("1.Update Details\n2.Add New Transaction Amount\n3.Check Point Expiry\n4.Redeem Product\n5.Profile\n6.Back\nEnter choice: ");
    }
    public static void backAction(){
        System.out.println("\n===========GOING BACK==========\n");
    }
    public static void addHardcodeCust(){
         customer[0] = new Customer("TAN AH KOW",21,"ahkow@gmail.com",122,150.00,LocalDate.of(2024,1,5));
    }
    
    public static void redeemMenu(){
        System.out.print("Redeem Option\n1. Product\n2. Limited Tier Product\n3. Voucher\n4. Exit\nChoose Redeem Option : ");
    }

}
