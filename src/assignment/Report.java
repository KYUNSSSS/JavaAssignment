/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author xuan
 */
public class Report {
    private int voucherRedeemed;
    private int productRedeemed;
    private int tier0Num;
    private int tier1Num;
    private int tier2Num;
    private int tier3Num;
    private String reportTitle;

    public Report() {
    }

    public Report(int voucherRedeemed, int productRedeemed, int tier1Num, int tier2Num, int tier3Num,
            String reportTitle) {
        this.voucherRedeemed = voucherRedeemed;
        this.productRedeemed = productRedeemed;
        this.tier1Num = tier1Num;
        this.tier2Num = tier2Num;
        this.tier3Num = tier3Num;
        this.reportTitle = reportTitle;
    }

    public int getVoucherRedeemed() {
        return voucherRedeemed;
    }

    public void setVoucherRedeemed(int voucherRedeemed) {
        this.voucherRedeemed = voucherRedeemed;
    }

    public int getProductRedeemed() {
        return productRedeemed;
    }

    public void setProductRedeemed(int productRedeemed) {
        this.productRedeemed = productRedeemed;
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

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
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

    public void updateStockInventory() {
        Scanner input = new Scanner(System.in);
        Menu.stockMenu();
        int stock = input.nextInt();
        System.out.print("Enter number to increase: ");
        int addStock = input.nextInt();
        
        for (int i = 1; i < 10; i++) {
            if (stock <= 3) {
               
            } else if (stock <= 6) {

            }
        }
        
    }

    public void displayTierReport() {

        System.out.println("Customer Tier Report");

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

    public void displayRedemptionReport(Object o) {
        
        if (o instanceof RedemptionProduct) {
            setReportTitle("Normal Redemption Product Report");
        } else if (o instanceof LimitedProduct) {
            setReportTitle("Limited Redemption Product Report");
        } else if (o instanceof Voucher) {
            setReportTitle("Voucher Redemption Report");
        }
        System.out.println(reportTitle);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("  No.  |          Product         |  Quantity Remaining  |  Total Redeemed  ");
        System.out.println("----------------------------------------------------------------------------");
        if (o instanceof RedemptionProduct redemptionProduct) {
            for (int i = 0; i < redemptionProduct.getProductName().length; i++) {
                System.out.printf("  %-3d  |   %-23s|  %-18d  |  %-18d\n" , (i+1), redemptionProduct.getProductName(i), redemptionProduct.getQtyRemaining(i), 1);
            }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println();
        } else if (o instanceof LimitedProduct limitedProduct) {
            for (int i = 0; i < limitedProduct.getProductName().length; i++) {
                System.out.printf("  %-3d  |   %-23s|  %-18d  |  %-18d\n" , (i+1), limitedProduct.getProductName(i), limitedProduct.getQtyRemaining(i), 1);
            }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println();
        } else if (o instanceof Voucher voucher) {
            for (int i = 0; i < voucher.getVcName().length; i++) {
                System.out.printf("  %-3d  |   %-23s|  %-18d  |  %-18d\n" , (i+1), voucher.getVcName(i), voucher.getVcRemaining(i), 1);
            }
            System.out.println("----------------------------------------------------------------------------");
            System.out.println();
        }
    }

    public void displayPointReport(Customer[] customer) {
        
        int totalPtEarned = 0, totalPtRedeemed = 0;
        System.out.println("Customer Points Report");

        System.out.println("------------------------------------------------------------------");
        System.out.println("            Name            |  Points Earned  |  Points Redeemed  ");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < Customer.getUserRegistered(); i++){
            int ptRedeem = customer[i].getPointAccumulate() - (int)customer[i].getTotalPurchaseAmount();
            System.out.printf("  %-26s|  %-15d|  %-17d \n" , customer[i].getName(), customer[i].getPointAccumulate(), ptRedeem);
            totalPtEarned += customer[i].getPointAccumulate();
            totalPtRedeemed += ptRedeem;
        }
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%26s  |  %-15d|  %-17d \n" ,"Total", totalPtEarned, totalPtRedeemed);
        System.out.println("------------------------------------------------------------------\n");
    }

}
