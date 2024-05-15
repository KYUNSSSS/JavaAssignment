package assignment;

import java.util.Scanner;

public class TnC extends Policy {

    public void displayMainMenu() {
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
                // displayFAQandTerms();
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
                displayMainMenu();
        }
    }

    public void displayPointEarnMenuTnC(){
        System.out.println("\n************************************ Term and Condition (TNC): ***********************************");
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

    public void displayRedemptionMenuTnC() {
        System.out.println("\n******************************************** Term and Condition (TNC): *******************************************");
        System.out.println("2. Redeemption");
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
    

    public void displayMembershipTierMenuTnC() {
       System.out.println("\n******************************************* Term and Condition (TNC): ******************************************");
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