/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Asus
 */
public class LimitedProduct extends Product{
    private String tier;

    public LimitedProduct() {
    }

    public LimitedProduct(String tier, String productName, String prodDescription, int prodQty, int qtyRedeemed, int requiredPoint) {
        super(productName, prodDescription, prodQty, qtyRedeemed, requiredPoint);
        this.tier = tier;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }



}
