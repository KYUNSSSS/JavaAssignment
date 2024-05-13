/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Product {
    private String productName;
    private String prodDescription;
    private int qtyRemaining;
    private int requiredPoint;

    public Product() {
    }

    public Product(String productName, String prodDescription, int qtyRemaining, int requiredPoint) {
        this.productName = productName;
        this.prodDescription = prodDescription;
        this.qtyRemaining = qtyRemaining;
        this.requiredPoint = requiredPoint;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public int getQtyRemaining() {
        return qtyRemaining;
    }

    public void setQtyRemaining(int qtyRemaining) {
        this.qtyRemaining = qtyRemaining;
    }

    public int getRequiredPoint() {
        return requiredPoint;
    }

    public void setRequiredPoint(int requiredPoint) {
        this.requiredPoint = requiredPoint;
    }

    
    public void redeemProgress(Product[] product, int choice, Customer[] customer) {
        int finalPoint = (int) customer[main.currentUser].getTotalPurchaseAmount() - product[choice].getRequiredPoint();
        if (finalPoint < 0) {
            System.out.println("Balance point insufficient.");
        } else {
            customer[main.currentUser].setTotalPurchaseAmount(finalPoint);
            main.updateCustomerFile(customer);
            int prodQty = this.getQtyRemaining()-1;
            this.setQtyRemaining(prodQty);
            System.out.println("Balance Point: " + finalPoint);
            System.out.println("Product Remaining Quantity: " + prodQty);
        }
    }
//    public void readProductFile() {
//      
//        File prodFile = new File("product.txt");
//        try {
//            Scanner scanner = new Scanner(prodFile);
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] values = line.split(",");
//                int[] qtyRemaining = {Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2])};
//                this.setQtyRemaining(qtyRemaining);
//                
//        
//            }
//            scanner.close();
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//    public void updateProductFile() {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("product.txt"));
//                    String Data = this.getQtyRemaining(0) +","+getQtyRemaining(1)+","+getQtyRemaining(2);
//                    writer.write(Data);
//            
//            writer.close();
//            // System.out.println("Customer file updated successfully.");
//        } catch (IOException e) {
//            System.out.println("An error occurred while updating customer file.");
//            e.printStackTrace();
//        }
//    }

}
