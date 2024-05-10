/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

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

    public Report(int voucherRedeemed, int productRedeemed, int tier1Num, int tier2Num, int tier3Num, String reportTitle) {
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
        for (int i = 0; i < Customer.getUserRegistered(); i++){
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
    
    public void displayReport() {
        
        System.out.println(reportTitle);
        
        System.out.println("--------------------------------------");
        System.out.println("   Tier    |   Number of Customers    ");
        System.out.println("--------------------------------------");
        System.out.println("  No Tier  |   " + tier0Num + "       ");
        System.out.println("  Silver   |   " + tier1Num + "       ");
        System.out.println("   Gold    |   " + tier2Num + "       ");
        System.out.println(" Platinum  |   " + tier3Num + "       ");
        System.out.println("--------------------------------------");
        System.out.println(" Total Number of Customers : " + (tier0Num + tier1Num + tier2Num + tier3Num) );
    }
    
}
