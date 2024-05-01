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
    
public class Product {
    private String[] productName;
    private String[] prodDescription;
    private static int[] qtyRemaining;
    private int[] requiredPoint;

    public Product() {
    }

    public Product(String[] productName, String[] prodDescription, int[] qtyRemaining, int[] requiredPoint) {
        this.productName = productName;
        this.prodDescription = prodDescription;
        this.qtyRemaining = qtyRemaining;
        this.requiredPoint = requiredPoint;
    }

    public String getProductName(int i) {
        return productName[i];
    }

    public void setProductName(String[] productName) {
        this.productName = productName;
    }

    public String getProdDescription(int i) {
        return prodDescription[i];
    }

    public void setProdDescription(String[] productDescription) {
        this.prodDescription = productDescription;
    }

    public static int getQtyRemaining(int i) {
        return qtyRemaining[i];
    }

    public static void setQtyRemaining(int[] qtyRemaining) {
        Product.qtyRemaining = qtyRemaining;
    }

    public int getRequiredPoint(int i) {
        return requiredPoint[i];
    }

    public void setRequiredPoint(int[] requiredPoint) {
        this.requiredPoint = requiredPoint;
    }
    
    public void displayProduct(){
        System.out.print("");
    }
}
    
    //REDEMPTION PRODUCT
    
public class RedemptionProduct extends Product{

    public RedemptionProduct() {
    }

    public RedemptionProduct(String[] productName, String[] productDescription, int[] qtyRemaining, int[] requiredPoint) {
        super(productName, productDescription, qtyRemaining, requiredPoint);
    }
}
    
    //LIMITED PRODUCT
    
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
    
}
    
    //VOUCHER
    
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
    
    
}
}



