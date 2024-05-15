package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author xuan
 */
public class Report {

    private int tier0Num;
    private int tier1Num;
    private int tier2Num;
    private int tier3Num;

    public Report() {
    }

    public Report(int tier0Num, int tier1Num, int tier2Num, int tier3Num) {
        this.tier0Num = tier0Num;
        this.tier1Num = tier1Num;
        this.tier2Num = tier2Num;
        this.tier3Num = tier3Num;
    }

    public int getTier0Num() {
        return tier0Num;
    }

    public void setTier0Num(int tier0Num) {
        this.tier0Num = tier0Num;
    }

    public int getTier1Num() {
        return tier1Num;
    }

    public void setTier1Num(int tier1Num) {
        this.tier1Num = tier1Num;
    }

    public int getTier2Num() {
        return tier2Num;
    }

    public void setTier2Num(int tier2Num) {
        this.tier2Num = tier2Num;
    }

    public int getTier3Num() {
        return tier3Num;
    }

    public void setTier3Num(int tier3Num) {
        this.tier3Num = tier3Num;
    }

    public void calculateTierCust(Customer[] customer) {
        for (int i = 0; i < Customer.getUserRegistered(); i++) {
            String tier = customer[i].getTier();

            switch (tier) {
                case "Silver":
                    tier1Num++;
                    break;
                case "Gold":
                    tier2Num++;
                    break;
                case "Platinum":
                    tier3Num++;
                    break;
                default:
                    tier0Num++;
                    break;
            }
        }
    }

    public void updateStockInventory(Product[] product) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter Product No.: ");
                int stock = input.nextInt();

                if (stock < 1 || stock > product.length) {
                    System.out.println("Invalid Product No. entered.\n");
                    continue;
                }

                System.out.print("Enter number to increase: ");
                int addStock = input.nextInt();

                if (addStock <= 0) {
                    System.out.println("Invalid quantity entered. Please enter a positive number.\n");
                    continue;
                }

                int index = stock - 1; 
                int newQty = product[index].getProdQty() + addStock;
                product[index].setProdQty(newQty);
                product[index].updateProductFile(product);
                System.out.println("Stock quantity updated successfully.");
                break; 
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter a valid integer.\n");
                input.next(); 
            }
        }
    }

    public void displayTierReport() {

        System.out.println("\n        Customer Tier Report");

        System.out.println("--------------------------------------");
        System.out.println("   Tier    |   Number of Customers    ");
        System.out.println("--------------------------------------");
        System.out.println("  No Tier  |   " + tier0Num + "       ");
        System.out.println("  Silver   |   " + tier1Num + "       ");
        System.out.println("   Gold    |   " + tier2Num + "       ");
        System.out.println(" Platinum  |   " + tier3Num + "       ");
        System.out.println("--------------------------------------");
        System.out.println("Total Number of Customers : " + (tier0Num + tier1Num + tier2Num + tier3Num));
    }

    public void displayRedemptionReport(Product[] product) {

        boolean firstATier = true, firstLimited = true, firstVc = true;
        int aTTL = 0, lTTL = 0, vcTTL = 0;

        System.out.println("\n                        Product Redemption Report");

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("  No.  |          Product         |  Quantity Remaining  |  Total Redeemed  ");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < product.length; i++) {
            if (product[i] instanceof AllTierProduct) {
                if (firstATier) {
                    System.out.println("All Tier Product");
                    System.out.println("============================================================================");
                    firstATier = false;
                }
                aTTL += product[i].getQtyRedeemed();
            } else if (product[i] instanceof LimitedProduct) {
                if (firstLimited) {
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.printf("%55s  |  %-15d\n", "Total All Tier Product Redeemed", aTTL);
                    System.out.println("\nLimited Product");
                    System.out.println("============================================================================");
                    firstLimited = false;
                }
                lTTL += product[i].getQtyRedeemed();
            } else if (product[i] instanceof Voucher) {
                if (firstVc) {
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.printf("%55s  |  %-15d\n", "Total Limited Product Redeemed", lTTL);
                    System.out.println("\nVoucher");
                    System.out.println("============================================================================");
                    firstVc = false;
                }
                vcTTL += product[i].getQtyRedeemed();
            }
            System.out.printf("  %-3d  |   %-23s|  %-18d  |  %-18d\n", (i + 1), product[i].getProductName(),
                    product[i].getProdQty(), product[i].getQtyRedeemed());
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%55s  |  %-15d\n", "Total Voucher Redeemed", vcTTL);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
    }

    public void displayPointReport(Customer[] customer) {

        int totalPtEarned = 0, totalPtRedeemed = 0;
        System.out.println("\n                   Customer Points Report");

        System.out.println("------------------------------------------------------------------");
        System.out.println("            Name            |  Points Earned  |  Points Redeemed  ");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < Customer.getUserRegistered(); i++) {
            int ptRedeem = customer[i].getPointAccumulate() - (int) customer[i].getTotalPurchaseAmount();
            System.out.printf("  %-26s|  %-15d|  %-17d \n", customer[i].getName(), customer[i].getPointAccumulate(),
                    ptRedeem);
            totalPtEarned += customer[i].getPointAccumulate();
            totalPtRedeemed += ptRedeem;
        }
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%26s  |  %-15d|  %-17d \n", "Total", totalPtEarned, totalPtRedeemed);
        System.out.println("------------------------------------------------------------------\n");
    }

}
