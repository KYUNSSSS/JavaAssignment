/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Asus
 */
public class Voucher {
    private String[] vcName;
    private String[] vcDescription;
    private static int[] vcRemaining;
    private int[] requiredPoint;

    public Voucher() {
    }

    public Voucher(String[] vcName, String[] vcDescription, int[] vcRemaining, int[] requiredPoint) {
        this.vcName = vcName;
        this.vcDescription = vcDescription;
        this.vcRemaining = vcRemaining;
        this.requiredPoint = requiredPoint;
    }

    public String getVcName(int i) {
        return vcName[i];
    }

    public void setVcName(String[] vcName) {
        this.vcName = vcName;
    }

    public String getVcDescription(int i) {
        return vcDescription[i];
    }

    public void setVcDescription(String[] vcDescription) {
        this.vcDescription = vcDescription;
    }

    public int getVcRemaining(int i) {
        return vcRemaining[i];
    }

    public static void setVcRemaining(int[] vcRemaining) {
        Voucher.vcRemaining = vcRemaining;
    }

    public int getRequiredPoint(int i) {
        return requiredPoint[i];
    }

    public void setRequiredPoint(int[] requiredPoint) {
        this.requiredPoint = requiredPoint;
    }
    
    public static Voucher iniVoucher(){
        String[] vcNames = {"RM5 Discount Voucher","RM10 Discount Voucher","RM20 Discount Voucher"};
        String[] vcDesc = {"Deduct RM5 on Next Purchase","Deduct RM10 on Next Purchase","Deduct RM20 on Next Purchase"};
        int[] vcQtyRemain = {10,10,10};
        int[] vcRequiredPts = {490,950,1900};

        Voucher voucher = new Voucher();
        
        voucher.setVcName(vcNames);
        voucher.setVcDescription(vcDesc);
        voucher.setVcRemaining(vcQtyRemain);
        voucher.setRequiredPoint(vcRequiredPts);
        
        return voucher;
    } 
    
}