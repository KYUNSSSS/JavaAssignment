/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Faq extends Policy{
    
    public void displayPointEarnMenu() {
        System.out.println("\n***************************************************************");
        System.out.println("*                   Point Earn Guidelines                     *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                  1. Earn Points by Purchase                 *");
        System.out.println("*                  2. Earn Points by Referral Code            *");
        System.out.println("*                  3. Earn Points by Playing Game             *");
        System.out.println("*                  4. Back                                    *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayPointEarnByPurchase();
                break;
            case 2:
                displayPointEarnByReferral();
                break;
            case 3:
                displayPointEarnByPlayingGames();
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
                displayPointEarnMenu();
        }
    }

    public void displayMainMenu() {
        Menu.displayPolicyMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayPointEarnMenu();
                continueReadingPolicy();
                break;
            case 2:
                displayRedemptionMenu();
                continueReadingPolicy();
                break;
            case 3:
                displayMembershipTierMenu();
                continueReadingPolicy();
                break;
            case 4:
                
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
                this.displayMainMenu();
        }
    }

    public void displayPointEarnByPurchase() {
        System.out.println("\n**************************************** Frequently Asked Questions (FAQ): ***************************************");
        System.out.println("Guidelines for earning points by purchase: ");
        System.out.println("1. How do I earn points by purchasing?");
        System.out.println("   - You can earn points by making purchases at our store.");
        System.out.println("   - The more you spend, the more points you'll accumulate.");
        System.out.println("2. How are points calculated for purchases?");
        System.out.println("   - Points are typically calculated based on the total amount spent on purchases.");
        System.out.println("   -  You can earn one point for every Ringgit spent.");
        System.out.println("3. Are points earned immediately after a purchase?");
        System.out.println("   - Yes, points are typically credited to your account immediately after a qualifying purchase is made.");
        System.out.println("   - However, there may be rare instances where points are credited after a short processing period.");
        System.out.println("4. Do all purchases qualify for earning points?");
        System.out.println("   - Yes, all purchases qualify for earning points.");
        System.out.println("5. How long is the duration for the point expiry??");
        System.out.println("   - The duration of point expiry is 1 year.");
        System.out.println("   - It is based on the customer's first-time purchase date plus 1 year.");
    }

    public void displayPointEarnByReferral() {
        System.out.println("\n**************************************** Frequently Asked Questions (FAQ): ***************************************");
        System.out.println("Guidelines for earning points by referral code...");
        System.out.println("1. How do I obtain a referral code?");
        System.out.println("   - The referral code can only be received by sharing with friends or family.");
        System.out.println("2. Is there a limit to the number of times I can use my referral code?");
        System.out.println("   - No, there's typically no limit to how many times you can use your referral code.");
        System.out.println("3. How many points can I earn by using a referral code?");
        System.out.println("   - There are 50 points for each referral code.");
        System.out.println("4. How long is the duration for the point expiry??");
        System.out.println("   - The duration of point expiry is 1 year.");
        System.out.println("   - It is based on the customer's first-time purchase date plus 1 year");
    }

    public void displayPointEarnByPlayingGames(){
        System.out.println("\n**************************************** Frequently Asked Questions (FAQ): ***************************************");
        System.out.println("Guidelines for earning points by playing games...");
        System.out.println("1. How are points awarded for playing games");
        System.out.println("   - Points are typically awarded based on your performance in the games.");
        System.out.println("   - The higher your performance, the more points you're likely to earn.");
        System.out.println("2. How many points can I earn by playing games?");
        System.out.println("   - The number of points you can earn varies depending on your performance in the games.");
        System.out.println("   - Generally, you'll earn 50 points for each successful completion of a game level or challenge.");
        System.out.println("3. Are there any restrictions on playing games to earn points?");
        System.out.println("   - Each user is limited to three attempts per game, with a total of five games available for play upon each login.");
        System.out.println("4. How do I access the games to earn points?");
        System.out.println("   - You can access the games by logging into your account.");
        System.out.println("   - Once logged in, navigate to the 'Play Game' section.");
        System.out.println("5. How long is the duration for the point expiry??");
        System.out.println("   - The duration of point expiry is 1 year.");
        System.out.println("   - It is based on the customer's first-time purchase date plus 1 year");
    }
    
     public void displayRedemptionMenu() {
        System.out.println("\n*********************************** Frequently Asked Questions (FAQ): **********************************");
        System.out.println("Guidelines for Redeemption...");
        System.out.println("1. What types of rewards are included?");
        System.out.println("   - There are three types of reward, including normal product, limited product and voucher.");
        System.out.println("2. How many rewards can be redeemed in total?");
        System.out.println("   - There are no restrictions for users to redeem rewards.");
        System.out.println("   - Redemption is based on the user's points.");
        System.out.println("3. What rewards can I redeem with my points?");
        System.out.println("   - All the rewards can be redeem with the points.");
        System.out.println("4. Can customers without a tier redeem rewards?");
        System.out.println("   - Yes, customer with no tier is allow to redeem all the rewards, except limited product.");
    }
     
    public void displayMembershipTierMenu() {
        System.out.println("\n****************************** Frequently Asked Questions (FAQ): *****************************");
        System.out.println("\nMembership Tier Guidelines:");
        System.out.println("1. How is my spending calculated for membership tiers");
        System.out.println("   - How is my spending calculated for membership tiers?");
        System.out.println("2. Can I move up or down between membership tiers?");
        System.out.println("   - Yes, your membership tier can change based on your spending.");
        System.out.println("   - If your spending increases, you may move up to a higher tier, and vice versa.");
        System.out.println("3. Are there any additional benefits for higher-tier members?");
        System.out.println("   - Yes, higher-tier members often receive redemption rewards without any restrictions.");
    }   

    public void continueReadingPolicy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to continue reading other policies (Y/N)? ");
        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N")) {
            System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            System.out.print("Do you want to continue reading other policies (Y/N)? ");
            input = scanner.nextLine();
        }
        if (input.equalsIgnoreCase("Y")) {
            displayMainMenu();
        } else {
            System.out.println("Stop Reading Policy");
        }
    }
    
}
