/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Asus
 */
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
 
    
}
