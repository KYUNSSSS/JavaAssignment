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
    
    public static RedemptionProduct iniReProd(String[] Name,String[] Desc, int[] Qty, int[] Pts){
        RedemptionProduct reP = new RedemptionProduct();
        
//        String[] reProdNames = {"Pillow","Headphone","Backpack"};
//        String[] reProdDesc = {"Harvey Norman","CookingPanDesc","BackpackDesc"};
//        int[] reQtyRemain= {10,12,15};
//        int[] reRequiredPts = {50,300,500};
        
        reP.setProductName(Name);
        reP.setProdDescription(Desc);
        reP.setQtyRemaining(Qty);
        reP.setRequiredPoint(Pts);
        return reP;
    }
    
    public static LimitedProduct iniLiProd(String[] Tier, String[] Name,String[] Desc, int[] Qty, int[] Pts){
        LimitedProduct liP = new LimitedProduct();
        
//        String[] liTier = {"Silver","Gold","Gold"};
//        String[] liProdNames = {"Vacuum Cleaner","Cooking Pan","Knife Set"};
//        String[] liProdDesc = {"VacuumCleanerDesc","CookingPanDesc","KnifeSetDesc"};
//        int[] liQtyRemain = {10,13,20};
//        int[] liRequiredPts = {500,600,600};  
        
        liP.setTier(Tier);
        liP.setProductName(Name);
        liP.setProdDescription(Desc);
        liP.setQtyRemaining(Qty);
        liP.setRequiredPoint(Pts);
       
        return liP;
    }
    
    public static Voucher iniVc(String[] Name,String[] Desc, int[] Qty, int[] Pts){
        Voucher voucher = new Voucher();
//        
//        String[] vcNames = {"RM5 Discount Voucher","RM10 Discount Voucher","RM20 Discount Voucher"};
//        String[] vcDesc = {"Deduct RM5 on Next Purchase","Deduct RM10 on Next Purchase","Deduct RM20 on Next Purchase"};
//        int[] vcQtyRemain = {10,10,10};
//        int[] vcRequiredPts = {490,950,1900};
        
        voucher.setVcName(Name);
        voucher.setVcDescription(Desc);
        voucher.setVcRemaining(Qty);
        voucher.setRequiredPoint(Pts);
        
        return voucher;
    }    
    
    public static void reRedeemProgress(int[] prodQty,int[] requiredPts, int i){
        int fPoint = Point.getPoint() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            Point.setPoint(fPoint);
            prodQty[i-1]-=1;
            RedemptionProduct.setQtyRemaining(prodQty);
            System.out.println("Balance Point: " + fPoint);
            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
        }   
    }
    
    public static void liRedeemProgress(int[] prodQty,int[] requiredPts, int i){
        int fPoint = Point.getPoint() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            Point.setPoint(fPoint);
            prodQty[i-1]-=1;
            LimitedProduct.setQtyRemaining(prodQty);
            System.out.println("Balance Point: " + fPoint);
            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
        }   
    }
    
    public static void vcRedeemProgress(int[] vcQty,int[] requiredPts, int i){
        int fPoint = Point.getPoint() - requiredPts[i-1];
        if(fPoint < 0){
            System.out.println("Balance point insufficient.");
        }else{
            Point.setPoint(fPoint);
            vcQty[i-1]-=1;
            Voucher.setVcRemaining(vcQty);
            System.out.println("Balance Point: " + fPoint);
            System.out.println("Product Remaining Quantity: " + vcQty[i-1]);
        }   
    }
}



