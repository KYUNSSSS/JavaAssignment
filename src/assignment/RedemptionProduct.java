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
public class RedemptionProduct extends Product{

    public RedemptionProduct() {
    }

    public RedemptionProduct(String[] productName, String[] productDescription, int[] qtyRemaining, int[] requiredPoint) {
        super(productName, productDescription, qtyRemaining, requiredPoint);
    }
    
    public static RedemptionProduct iniReProd(){
        String[] reProdNames = {"Pillow","Headphone","Backpack"};
        String[] reProdDesc = {"Harvey Norman","CookingPanDesc","BackpackDesc"};
        int[] reQtyRemain= {10,12,15};
        int[] reRequiredPts = {50,300,500};
    
        RedemptionProduct reP = new RedemptionProduct();
        
        reP.setProductName(reProdNames);
        reP.setProdDescription(reProdDesc);
        reP.setQtyRemaining(reQtyRemain);
        reP.setRequiredPoint(reRequiredPts);
        return reP;
    }
    
        public void redeemProduct(RedemptionProduct rdp){
        Scanner scanner = new Scanner(System.in);
        String[] reProdNames = rdp.getProductName();
        int[] reQtyRemain = rdp.getQtyRemaining();
        int[] reRequiredPts = rdp.getRequiredPoint();

        for(int i=0; i<reProdNames.length;i++){
            System.out.println((i+1) + "." + reProdNames[i] + "\tQuantity remaining:" + reQtyRemain[i] + "\tRequired points:" + reRequiredPts[i]);
        }
            System.out.print("Choose product to redeem(One at a time):");
            int opt2 = scanner.nextInt();
            switch(opt2){
                case 1:
                    this.reRedeemProgress(reQtyRemain,reRequiredPts,opt2);
                    break;
                case 2:
                    this.reRedeemProgress(reQtyRemain,reRequiredPts,opt2);
                    break;
                case 3:
                    this.reRedeemProgress(reQtyRemain,reRequiredPts,opt2);
                    break;
                default:
                    System.out.print("Cancelled redemption");
                    break;
            }
        }
        
        public void reRedeemProgress(int[] prodQty,int[] requiredPts, int i){
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
