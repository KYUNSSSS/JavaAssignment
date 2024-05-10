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
public class Redemption {
    private RedemptionProduct redemptionProduct;
    private Voucher voucher;
    private LimitedProduct limitedProduct;
    private int quantity;
    
    public Redemption() {
    }

    public Redemption(RedemptionProduct redemptionProduct, Voucher voucher, LimitedProduct limitedProduct, int quantity) {
        this.redemptionProduct = redemptionProduct;
        this.voucher = voucher;
        this.limitedProduct = limitedProduct;
        this.quantity = quantity;
    }

    public RedemptionProduct getRedemptionProduct() {
        return redemptionProduct;
    }

    public void setRedemptionProduct(RedemptionProduct redemptionProduct) {
        this.redemptionProduct = redemptionProduct;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public LimitedProduct getLimitedProduct() {
        return limitedProduct;
    }

    public void setLimitedProduct(LimitedProduct limitedProduct) {
        this.limitedProduct = limitedProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
       
    public static void redemption(RedemptionProduct rdp){
        Scanner scanner = new Scanner(System.in);
        Menu.redeemMenu();
        int opt = scanner.nextInt();

        String[] reProdNames = rdp.getProductName();
        int[] reQtyRemain = rdp.getQtyRemaining();
        int[] reRequiredPts = rdp.getRequiredPoint();
        switch(opt){
            case 1:
                rdp.redeemProduct(rdp);
                break;
            case 2:
                rdp.redeemProduct(rdp);
                break;                
            case 3:
                rdp.redeemProduct(rdp);
                break;
            default:
                System.out.print("Cancelled redemption");
        }
    }
    
//    public static RedemptionProduct iniReProd(String[] Name,String[] Desc, int[] Qty, int[] Pts){
//        RedemptionProduct reP = new RedemptionProduct();
//        
//        reP.setProductName(Name);
//        reP.setProdDescription(Desc);
//        reP.setQtyRemaining(Qty);
//        reP.setRequiredPoint(Pts);
//        return reP;
//    }
    
//    public static LimitedProduct iniLiProd(String[] Tier, String[] Name,String[] Desc, int[] Qty, int[] Pts){
//        LimitedProduct liP = new LimitedProduct();
//                
//        liP.setTier(Tier);
//        liP.setProductName(Name);
//        liP.setProdDescription(Desc);
//        liP.setQtyRemaining(Qty);
//        liP.setRequiredPoint(Pts);
//       
//        return liP;
//    }
    
//    public static Voucher iniVc(String[] Name,String[] Desc, int[] Qty, int[] Pts){
//        Voucher voucher = new Voucher();
//        
//        voucher.setVcName(Name);
//        voucher.setVcDescription(Desc);
//        voucher.setVcRemaining(Qty);
//        voucher.setRequiredPoint(Pts);
//        
//        return voucher;
//    }    
    
//    public void redeemProduct(String[] name, int[] qty,int[] points){
//        Scanner scanner = new Scanner(System.in);
//        for(int i=0; i<(name.length);i++){
//                    System.out.println((i+1) + "." + name[i] + "\tQuantity remaining:" + qty[i]);
//                }
//                System.out.print("Choose product to redeem(One at a time):");
//                int opt2 = scanner.nextInt();
//                switch(opt2){
//                    case 1:
//                        this.reRedeemProgress(qty,points,opt2);
//                        break;
//                    case 2:
//                        this.reRedeemProgress(qty,points,opt2);
//                        break;
//                    case 3:
//                        this.reRedeemProgress(qty,points,opt2);
//                        break;
//                    default:
//                        System.out.print("Cancelled redemption");
//                        break;
//                }
//    }
    
//    public void reRedeemProgress(int[] prodQty,int[] requiredPts, int i){
//        Point pts = new Point();
//        int fPoint = pts.getPoint() - requiredPts[i-1];
//        if(fPoint < 0){
//            System.out.println("Balance point insufficient.");
//        }else{
//            pts.setPoint(fPoint);
//            prodQty[i-1]-=1;
//            RedemptionProduct.setQtyRemaining(prodQty);
//            System.out.println("Balance Point: " + fPoint);
//            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
//        }   
//    }
    
//    public void liRedeemProgress(int[] prodQty,int[] requiredPts, int i){
//        Point pts = new Point();
//        int fPoint = pts.getPoint() - requiredPts[i-1];
//        if(fPoint < 0){
//            System.out.println("Balance point insufficient.");
//        }else{
//            pts.setPoint(fPoint);
//            prodQty[i-1]-=1;
//            LimitedProduct.setQtyRemaining(prodQty);
//            System.out.println("Balance Point: " + fPoint);
//            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
//        }   
//    }
    
//    public static void vcRedeemProgress(int[] vcQty,int[] requiredPts, int i){
//        Point pts = new Point();
//        int fPoint = pts.getPoint() - requiredPts[i-1];
//        if(fPoint < 0){
//            System.out.println("Balance point insufficient.");
//        }else{
//            pts.setPoint(fPoint);
//            vcQty[i-1]-=1;
//            Voucher.setVcRemaining(vcQty);
//            System.out.println("Balance Point: " + fPoint);
//            System.out.println("Product Remaining Quantity: " + vcQty[i-1]);
//        }   
//    }
}



