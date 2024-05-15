/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.Scanner;

public abstract class Policy {

    // public void displayFAQandTerms() {
    //     System.out.println("\n***************************************************************");
    //     System.out.println("*                       BEEWARD POLICY                        *");
    //     System.out.println("***************************************************************");
    //     System.out.println("*                                                             *");
    //     System.out.println("*                       1. FAQ                                *");
    //     System.out.println("*                       2. Terms and Conditions               *");
    //     System.out.println("*                       3. Back                               *");
    //     System.out.println("*                                                             *");
    //     System.out.println("***************************************************************");

    //     Scanner scanner = new Scanner(System.in);
    //     int choice = enterChoice();

    //     switch (choice) {
    //         case 1:
    //             this.displayMainMenu();
    //             break;
    //         case 2:
    //             this.displayMainMenu();
    //             break;
    //         case 3:
    //             break;
    //         default:
    //             System.out.println("Invalid choice. Please select again.");
    //             displayFAQandTerms();
    //     }
    // }

    public abstract void displayMainMenu();

    public static int enterChoice() {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean validInput = false;
        do {
            try {
                System.out.print("\nEnter your choice: ");
                num = scan.nextInt();
                validInput = true;
            } catch (Exception ex) {
                System.out.println("Please enter numbers displayed only.");
                scan.nextLine();
            }
        } while (!validInput);
        return num;
    }

}
