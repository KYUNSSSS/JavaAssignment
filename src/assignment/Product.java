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
    private int prodQty;
    private int qtyRedeemed;
    private int requiredPoint;

    public Product() {
    }

    public Product(String productName, String prodDescription, int prodQty, int qtyRedeemed, int requiredPoint) {
        this.productName = productName;
        this.prodDescription = prodDescription;
        this.prodQty = prodQty;
        this.qtyRedeemed = qtyRedeemed;
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

    public int getProdQty() {
        return prodQty;
    }

    public void setProdQty(int prodQty) {
        this.prodQty = prodQty;
    }

    public int getQtyRedeemed() {
        return qtyRedeemed;
    }

    public void setQtyRedeemed(int qtyRedeemed) {
        this.qtyRedeemed = qtyRedeemed;
    }

    public int getRequiredPoint() {
        return requiredPoint;
    }

    public void setRequiredPoint(int requiredPoint) {
        this.requiredPoint = requiredPoint;
    }

    public void redeemProgress(Product[] product, int choice, int qty, Customer[] customer) {
        int finalPoint = (int) customer[main.currentUser].getTotalPurchaseAmount() - (qty * product[choice].getRequiredPoint());
        if (finalPoint < 0) {
            System.out.println("Balance point insufficient.");
        } else {
            customer[main.currentUser].setTotalPurchaseAmount(finalPoint);
            main.updateCustomerFile(customer);
            int prodQty = product[choice].getProdQty() - qty;
            int prodRedeemed = product[choice].getQtyRedeemed() + qty;
            product[choice].setProdQty(prodQty);
            product[choice].setQtyRedeemed(prodRedeemed);
            System.out.println("Balance Point: " + finalPoint);
            System.out.println("Product Remaining Quantity: " + prodQty);
        }
    }

    public void readProductFile(Product[] product) {
        int num = 0;

        File prodFile = new File("product.txt");
        try {
            Scanner scanner = new Scanner(prodFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
//                int[] qtyRemaining = {Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2])};
//                this.setQtyRemaining(qtyRemaining);

                Product newProd = new Product();

                newProd.setProdQty(Integer.parseInt(values[0]));
                newProd.setQtyRedeemed(Integer.parseInt(values[1]));

                product[num].setProdQty(newProd.getProdQty());
                product[num].setQtyRedeemed(newProd.getQtyRedeemed());
                
                num++;

                if (num >= product.length) {

                    break;
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void updateProductFile(Product[] product) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("product.txt"));
//                    String Data = this.getQtyRemaining(0) +","+getQtyRemaining(1)+","+getQtyRemaining(2);
            for (int i = 0; i < product.length; i++) {
                if (product[i] != null) {
                    String prodData = product[i].getProdQty() + "," + product[i].getQtyRedeemed();
                    writer.write(prodData);
                    writer.newLine();
                }
            }
            writer.close();
            // System.out.println("Customer file updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating customer file.");
            e.printStackTrace();
        }
    }

}
