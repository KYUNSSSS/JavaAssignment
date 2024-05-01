/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

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
    
    public static void reRedeemProgress(int[] prodQty,int[] requiredPts, int i){
        int fPoint = Point.getPoint() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            int iniPoint = fPoint;
            prodQty[i-1]-=1;
            RedemptionProduct.setQtyRemaining(prodQty);
            System.out.println("Balance Point: " + iniPoint);
            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
        }   
    }
    
    public static void liRedeemProgress(int[] prodQty,int[] requiredPts, int i){
        int fPoint = Point.getPoint() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            int iniPoint = fPoint;
            prodQty[i-1]-=1;
            LimitedProduct.setQtyRemaining(prodQty);
            System.out.println("Balance Point: " + iniPoint);
            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
        }   
    }
    
    public static void vcRedeemProgress(int[] vcQty,int[] requiredPts, int i){
        int fPoint = Point.getPoint() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            int iniPoint = fPoint;
            vcQty[i-1]-=1;
            Voucher.setVcRemaining(vcQty);
            System.out.println("Balance Point: " + iniPoint);
            System.out.println("Product Remaining Quantity: " + vcQty[i-1]);
        }   
    }
    
    
    //PRODUCT   
    

   
    //REDEMPTION PRODUCT
    

    
    //LIMITED PRODUCT
    

    
    //VOUCHER
    

}



