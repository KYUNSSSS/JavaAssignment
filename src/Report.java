/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xuan
 */
public class Report {
    public int voucherRedeemed;
    public int productRedeemed;
    public int tier1Num;
    public int tier2Num;
    public int tier3Num;
    public String reportTitle;

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
    
    public String displayReport() {
        return """
               ANALYSIS REPORT
               
               Total Voucher Redeemed: """ + voucherRedeemed +
                "\nTotal Product Redeemed: " + productRedeemed +
                "\nNumber of Silver Tier Customer: " + tier1Num +
                "\nNumber of Gold Tier Customer: " + tier2Num +
                "\nNumber of Platinum Tier Customer: " + tier3Num;
    }
}
