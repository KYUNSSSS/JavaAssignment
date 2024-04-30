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
    
    public void displayRedemptionItem(RedemptionProduct redemptionProduct, Voucher voucher, LimitedProduct limitedProduct) {
        
    }
    
    //PRODUCT   
    
    public class Product {
    private String[] productName;
    private String[] prodDescription;
    private int[] qtyRemaining;
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

    public int getQtyRemaining(int i) {
        return qtyRemaining[i];
    }

    public void setQtyRemaining(int[] qtyRemaining) {
        this.qtyRemaining = qtyRemaining;
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
    private String vcName;
    private String vcDescription;
    private int vcRemaining;
    private int requiredPoint;

    public Voucher() {
    }

    public Voucher(String vcName, String vcDescription, int vcRemaining, int requiredPoint) {
        this.vcName = vcName;
        this.vcDescription = vcDescription;
        this.vcRemaining = vcRemaining;
        this.requiredPoint = requiredPoint;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }

    public String getVcDescription() {
        return vcDescription;
    }

    public void setVcDescription(String vcDescription) {
        this.vcDescription = vcDescription;
    }

    public int getVcRemaining() {
        return vcRemaining;
    }

    public void setVcRemaining(int vcRemaining) {
        this.vcRemaining = vcRemaining;
    }

    public int getRequiredPoint() {
        return requiredPoint;
    }

    public void setRequiredPoint(int requiredPoint) {
        this.requiredPoint = requiredPoint;
    }
    
    
    }
}




