/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Voucher {
    private String[] vcName;
    private String[] vcDescription;
    private int[] vcRemaining;
    private int[] requiredPoint;

    public Voucher() {
    }

    public Voucher(String[] vcName, String[] vcDescription, int[] vcRemaining, int[] requiredPoint) {
        this.vcName = vcName;
        this.vcDescription = vcDescription;
        this.vcRemaining = vcRemaining;
        this.requiredPoint = requiredPoint;
    }

    public String[] getVcName() {
        return vcName;
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

    public int[] getVcRemaining() {
        return vcRemaining;
    }

    public int getVcRemaining(int i) {
        return vcRemaining[i];
    }

    public void setVcRemaining(int[] vcRemaining) {
        this.vcRemaining = vcRemaining;
    }

    public int[] getRequiredPoint() {
        return requiredPoint;
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
    
    public void redeemProduct(Voucher voucher,Customer[] customer){
        Scanner scanner = new Scanner(System.in);
        String[] vcNames = voucher.getVcName();
        int[] vcRemain = voucher.getVcRemaining();
        int[] vcRequiredPts = voucher.getRequiredPoint();

        for(int i=0; i<vcNames.length;i++){
            System.out.println((i+1) + "." + vcNames[i] + "\tQuantity remaining:" + vcRemain[i] + "\tRequired point:" + vcRequiredPts[i]);
        }
            System.out.print("Choose product to redeem(One at a time):");
            int opt2 = scanner.nextInt();
            switch(opt2){
                case 1:
                    this.vcRedeemProgress(vcRemain,vcRequiredPts,opt2,customer);
                    break;
                case 2:
                    this.vcRedeemProgress(vcRemain,vcRequiredPts,opt2,customer);
                    break;
                case 3:
                    this.vcRedeemProgress(vcRemain,vcRequiredPts,opt2,customer);
                    break;
                default:
                    System.out.print("Cancelled redemption");
                    break;
            }
    }

    public void vcRedeemProgress(int[] vcQty,int[] requiredPts, int i, Customer[] customer){
    
        int fPoint = (int)customer[main.currentUser].getTotalPurchaseAmount() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            customer[main.currentUser].setTotalPurchaseAmount(fPoint);
            main.updateCustomerFile(customer);
            vcQty[i-1]-=1;
            this.setVcRemaining(vcQty);
            System.out.println("Balance Point: " + fPoint);
            System.out.println("Product Remaining Quantity: " + vcQty[i-1]);
        }   
    }

}