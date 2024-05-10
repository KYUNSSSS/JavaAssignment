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
public class LimitedProduct extends Product{
    private String[] tier;

    public LimitedProduct() {
    }

    public LimitedProduct(String[] tier, String[] productName, String[] prodDescription, int[] productQty, int[] qtyRemaining, int[] requiredPoint) {
        super(productName, prodDescription, qtyRemaining, requiredPoint);
        this.tier = tier;
    }

    public String getTier(int i) {
        return tier[i];
    }

    public void setTier(String[] tier) {
        this.tier = tier;
    }
    
    public static LimitedProduct iniLiProd(){
        String[] liTier = {"Silver","Gold","Platinum"};
        String[] liProdNames = {"Vacuum Cleaner","Cooking Pan","Knife Set"};
        String[] liProdDesc = {"VacuumCleanerDesc","CookingPanDesc","KnifeSetDesc"};
        int[] liQtyRemain = {10,13,20};
        int[] liRequiredPts = {500,600,700};  
 
        LimitedProduct liP = new LimitedProduct();
                
        liP.setTier(liTier);
        liP.setProductName(liProdNames);
        liP.setProdDescription(liProdDesc);
        liP.setQtyRemaining(liQtyRemain);
        liP.setRequiredPoint(liRequiredPts);
       
        return liP;
    }


    public void redeemProduct(LimitedProduct liP, String tier, Customer[] customer){
        Scanner scanner = new Scanner(System.in);
        String[] liProdNames = liP.getProductName();
        int[] liQtyRemain = liP.getQtyRemaining();
        int[] liRequiredPts = liP.getRequiredPoint();

        if(tier == "Silver"){
            System.out.println("1." + liProdNames[0] + "\tQuantity remaining:" + liQtyRemain[0] + "\tRequired points:" + liRequiredPts[0]);  
        } else if (tier == "Gold") {
            System.out.println("1." + liProdNames[1] + "\tQuantity remaining:" + liQtyRemain[1] + "\tRequired points:" + liRequiredPts[1]);
        } else if (tier == "Platinum") {
            System.out.println("1." + liProdNames[2] + "\tQuantity remaining:" + liQtyRemain[2] + "\tRequired points:" + liRequiredPts[2]);
        } 
        System.out.print("Choose product to redeem(One at a time):");
        int opt2 = scanner.nextInt();
        switch (opt2) {
            case 1:
                if(tier =="Silver"){
                    opt2 = 1;
                } else if (tier == "Gold"){
                    opt2 = 2;
                } else {
                    opt2 = 3;
                }
                this.liRedeemProgress(liQtyRemain,liRequiredPts,opt2,customer);
                break;
        
            default:
                break;
        }
    }
                 
        // for(int i=0; i<liProdNames.length;i++){
        //     System.out.println((i+1) + "." + liProdNames[i] + "\tQuantity remaining:" + liQtyRemain[i]);
        // }
        //     System.out.print("Choose product to redeem(One at a time):");
        //     int opt2 = scanner.nextInt();
        //     switch(opt2){
        //         case 1:
        //             this.liRedeemProgress(liQtyRemain,liRequiredPts,opt2);
        //             break;
        //         case 2:
        //             this.liRedeemProgress(liQtyRemain,liRequiredPts,opt2);
        //             break;
        //         case 3:
        //             this.liRedeemProgress(liQtyRemain,liRequiredPts,opt2);
        //             break;
        //         default:
        //             System.out.print("Cancelled redemption");
        //             break;
        //     }

    public void liRedeemProgress(int[] prodQty,int[] requiredPts, int i,Customer[] customer){
        int fPoint = (int)customer[main.currentUser].getTotalPurchaseAmount() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            customer[main.currentUser].setTotalPurchaseAmount(fPoint);
            main.updateCustomerFile(customer);
            prodQty[i-1]-=1;
            this.setQtyRemaining(prodQty);
            System.out.println("Balance Point: " + fPoint);
            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
        }   
    }

}
