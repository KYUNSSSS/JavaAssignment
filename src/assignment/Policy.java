/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.Scanner;

public class Policy {

    public static void displayFAQandTerms() {
        System.out.println("\n***************************************************************");
        System.out.println("*                       BEEWARD POLICY                        *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                       1. FAQ                                *");
        System.out.println("*                       2. Terms and Conditions               *");
        System.out.println("*                       3. Back                               *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");
      
       
        Scanner scanner = new Scanner(System.in);
        int choice = enterChoice();
        
        switch (choice) {
            case 1:
                displayMainMenuFaQ();
                break;
            case 2:
                displayMainMenuTnC();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
                displayFAQandTerms();
        }
    }
    
    public static void displayMainMenuFaQ() {
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
                displayFAQandTerms();
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
                displayMainMenuFaQ();
        }
    }
    
    public static void displayMainMenuTnC() {
         Menu.displayPolicyMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayPointEarnMenuTnC();
                continueReadingPolicy();
                break;
            case 2:
                displayRedemptionMenuTnC();
                continueReadingPolicy();
                break;
            case 3:
                displayMembershipTierMenuTnC();
                continueReadingPolicy();
                break;
            case 4:
                displayFAQandTerms();
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
                displayMainMenuFaQ();
        }
    }

    public static void displayPointEarnMenu() {
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
                Menu.backAction();
            default:
                System.out.println("Invalid choice. Please select again.");
                displayPointEarnMenu();
        }
    }

    public static void displayPointEarnByPurchase() {
        System.out.println("\n********** Frequently Asked Questions (FAQ): **********");
        System.out.println("Guidelines for earning points by purchase: ");
        System.out.println("1. How do I earn points by purchasing?");
        System.out.println("   - You can earn points by making purchases at our store.");
        System.out.println("   - The more you spend, the more points you'll accumulate.");
        System.out.println("2. How are points calculated for purchases?");
        System.out.println("   - Points are typically calculated based on the total amount spent on purchases.");
        System.out.println("   - You can earn one point for every Ringgit spent.");
        System.out.println("3. Are points earned immediately after a purchase?");
        System.out.println("   - Yes, points are typically credited to your account immediately after a qualifying purchase is made.");
        System.out.println("   - However, there may be rare instances where points are credited after a short processing period.");
        System.out.println("4. Do all purchases qualify for earning points?");
        System.out.println("   - Yes, all purchases qualify for earning points.");
        System.out.println("5. How long is the duration for the point expiry??");
        System.out.println("   - The duration of point expiry is 1 year.");
        System.out.println("   - It is based on the customer's first-time purchase date plus 1 year.");
    }

    public static void displayPointEarnByReferral() {
        System.out.println("\n********** Frequently Asked Questions (FAQ): **********");
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

    public static void displayPointEarnByPlayingGames(){
        System.out.println("\n********** Frequently Asked Questions (FAQ): **********");
        System.out.println("Guidelines for earning points by playing games...");
        System.out.println("1. How are points awarded for playing games");
        System.out.println("   - Points are typically awarded based on your performance in the games.");
        System.out.println("The higher your performance, the more points you're likely to earn.");
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
    
     public static void displayRedemptionMenu() {
        System.out.println("\n********** Frequently Asked Questions (FAQ): **********");
        System.out.println("Guidelines for Redemption...");
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
     
    public static void displayMembershipTierMenu() {
        System.out.println("\n********** Frequently Asked Questions (FAQ): **********");
        System.out.println("\nMembership Tier Guidelines:");
        System.out.println("1. How is my spending calculated for membership tiers");
        System.out.println("    - How is my spending calculated for membership tiers?");
        System.out.println("2. Can I move up or down between membership tiers?");
        System.out.println("   - Yes, your membership tier can change based on your spending.");
        System.out.println("   - If your spending increases, you may move up to a higher tier, and vice versa");
        System.out.println("3. Are there any additional benefits for higher-tier members?");
        System.out.println("   - Yes, higher-tier members often receive redemption rewards without any restrictions.");
    }
    
    public static void displayPointEarnMenuTnC(){
        System.out.println("\n********** Term and Condition (TNC): **********");
        System.out.println("1. Point Earn");
        System.out.println("    1.1 Point Accumulation: Points are accumulated based on eligible purchases,");
        System.out.println("        referral code usage, and game participation, subject to the terms outlined below.");
        System.out.println("    1.2 Purchase Points: Customers earn points for every Ringgit spent on eligible purchases.");
        System.out.println("        The conversion rate is 1 point per Ringgit, rounded down to the nearest integer.");
        System.out.println("        For example, RM1.50 spent earns 1 point.");
        System.out.println("    1.3 Referral Code Points: Customers can earn additional points by using referral codes.");
        System.out.println("        Each successful referral code usage earns a predetermined number of points.");
        System.out.println("    1.4 Game Points: Points can be earned by participating in math calculation games.");
        System.out.println("        Each game session allows three attempts, and points are awarded based on the game's outcome.");
        System.out.println("    1.5 Daily Limit: There may be a daily limit on the number of points that can be");
        System.out.println("        earned through game participation or referral code usage.");
        System.out.println("    1.6 Point Validity: Points have a validity period of one year from the date of earning.");
        System.out.println("        If not redeemed within this period, points will expire and become invalid.");
    }

    public static void displayRedemptionMenuTnC() {
        System.out.println("\n********** Term and Condition (TNC): **********");
        System.out.println("2. Redemption");
        System.out.println("    2.1 Eligible Rewards: Customers can redeem points for various rewards, including normal products,");
        System.out.println("        limited edition items, and vouchers, subject to availability and eligibility.");
        System.out.println("    2.2 Redemption Restrictions: No tier customers can redeem all rewards except for limited edition items.");
        System.out.println("        Higher-tier members enjoy unrestricted access to all available rewards.");
        System.out.println("    2.3 Point Redemption: Points can be redeemed for rewards through the company's official platform or designated");
        System.out.println("        redemption channels. Each reward has a corresponding point value required for redemption.");
        System.out.println("    2.4 Reward Availability: Limited edition items may have restricted availability and are offered on a first-come,");
        System.out.println("         first-served basis. The company does not guarantee the availability of any specific reward.");
        System.out.println("    2.5 Reward Fulfillment: The company will make best efforts to fulfill redeemed rewards promptly.");
        System.out.println("        However, delays may occur due to stock availability, shipping constraints, or other unforeseen circumstances.");
        System.out.println("    2.6 Reward Exchanges and Returns: Redeemed rewards are non-transferable and non-refundable. Once a reward has");
        System.out.println("        been redeemed, it cannot be exchanged or returned unless it is found to be defective or damaged upon receipt.");
        System.out.println("    2.7 Reward Exchanges and Returns: Redeemed rewards are non-transferable and non-refundable. Once a reward has");
        System.out.println("         been redeemed, it cannot be exchanged or returned unless it is found to be defective or damaged upon receipt.");
        System.out.println("    2.8 Customer Agreement: By participating in the redemption program, customers agree to abide by these terms");
        System.out.println("        and conditions and any additional rules or guidelines set forth by the company.");
    }
    

    public static void displayMembershipTierMenuTnC() {
        System.out.println("\n********** Term and Condition (TNC): **********");
        System.out.println("3. Membership Tier");
        System.out.println("    3.1 Membership tiers are based on total spending:");
        System.out.println("        3.1.1 No Tier: Below RM100 spent");
        System.out.println("        3.1.2 Silver Tier: RM100 to RM1000 spent");
        System.out.println("        3.1.3 Gold Tier: RM1000 to RM10000 spent");
        System.out.println("        3.1.4 Platinum Tier: Above RM10000 spent");
        System.out.println("    3.2 Tier Benefits: Each membership tier offers a");
        System.out.println("        range of benefits and privileges tailored to the spending level of the member. ");
        System.out.println("    3.3 Tier Upgrades: Customers can move up to higher tiers by reaching the spending threshold required ");
        System.out.println("        for the next tier within the specified period. Once a customer qualifies for a higher tier.");
        System.out.println("        They will automatically receive the corresponding benefits and privileges.");
        System.out.println("    3.4 Tier Renewal: Membership tiers are typically renewed annually based on the customer's spending");
        System.out.println("        during the previous membership period. Customers must maintain the required spending threshold to");
        System.out.println("        retain their current tier status for the next membership period.");
        System.out.println("    3.5 Tier Review: The company reserves the right to review and adjust membership tiers, spending thresholds,");
        System.out.println("         and associated benefits periodically to ensure fairness and alignment with business objectives.");
        System.out.println("    3.6 Tier Disputes: In the event of disputes regarding tier eligibility or benefits, the company's");
        System.out.println("        decision shall be final and binding. Customers may be required to provide proof of spending or other");
        System.out.println("        relevant documentation to resolve disputes.");
        System.out.println("    3.7 Tier Termination: The company reserves the right to terminate or suspend a customer's membership tier");
        System.out.println("        and associated benefits in cases of fraud, abuse, or violation of the membership terms and conditions.");
        System.out.println("    3.9 Membership Agreement: By participating in the membership program and accepting the associated benefits,");
        System.out.println("        customers agree to abide by these terms and conditions and any additional rules.");
    }
    
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
    
    public static void continueReadingPolicy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDo you want to continue reading other policies? (Y/N): ");
        char choice = scanner.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            displayMainMenuFaQ();
        } else if (choice == 'N' || choice == 'n') {
            System.out.println("Stop reaading policy.");
        } else {
            System.out.println("Invalid choice. Please enter Y or N.");
            continueReadingPolicy(); 
        }
    }

    
}

