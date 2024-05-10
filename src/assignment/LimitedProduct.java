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
        int[] liRequiredPts = {500,600,600};  
 
        LimitedProduct liP = new LimitedProduct();
                
        liP.setTier(liTier);
        liP.setProductName(liProdNames);
        liP.setProdDescription(liProdDesc);
        liP.setQtyRemaining(liQtyRemain);
        liP.setRequiredPoint(liRequiredPts);
       
        return liP;
    }
    
    public void liRedeem(LimitedProduct liP){
        Scanner scanner = new Scanner(System.in);
        
        String[] liProdNames = liP.getProductName();
        int[] liQtyRemain = liP.getQtyRemaining();
        int[] liRequiredPts = liP.getRequiredPoint();

        System.out.println("1." + liProdNames[0] + "\tQuantity remaining:" + liQtyRemain[0] + "\tRequired points:" + liRequiredPts[0]);
            System.out.println("Choose product to redeem(One at a time):");
            int opt2 = scanner.nextInt();
            switch(opt2){
                case 1:
                    this.liRedeemProgress(liQtyRemain,liRequiredPts,opt2);
                    break;
                default:
                    System.out.print("Cancelled redemption");
                    break;
            }
    }

    public void redeemProduct(LimitedProduct liP){
        Point point = new Point();
        String tier = point.checkTier();

        if(tier == "Silver"){
            this.liRedeem(liP);
        } else if (tier == "Gold") {
            this.liRedeem(liP);
        } else if (tier == "Platinum") {
            this.liRedeem(liP);
        } else {
            System.out.println("Tier Level too low to redeem Tier Limited Item.");
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

    public void liRedeemProgress(int[] prodQty,int[] requiredPts, int i){
        Point pts = new Point();
        int fPoint = pts.getPoint() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            pts.setPoint(fPoint);
            prodQty[i-1]-=1;
            this.setQtyRemaining(prodQty);
            System.out.println("Balance Point: " + fPoint);
            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
        }   
    }

}
