/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class AllTierProduct extends Product {

    public AllTierProduct() {
    }

    public AllTierProduct(String[] productName, String[] productDescription, int[] qtyRemaining, int[] requiredPoint) {
        super(productName, productDescription, qtyRemaining, requiredPoint);
    }

    public static AllTierProduct iniReProd() {
        // AllTierProduct("Pillow","HarveyNorman",10,50);
        String[] reProdNames = {"Pillow", "Headphone", "Backpack"};
        String[] reProdDesc = {"Harvey Norman", "Sony", "BackpackDesc"};
        int[] reQtyRemain = {10, 12, 15};
        int[] reRequiredPts = {50, 100, 200};

        AllTierProduct reP = new AllTierProduct();

        reP.setProductName(reProdNames);
        reP.setProdDescription(reProdDesc);
        reP.setQtyRemaining(reQtyRemain);
        reP.setRequiredPoint(reRequiredPts);
        return reP;
    }

    public void redeemProduct(AllTierProduct atP, Customer[] customer) {
        String[] reProdNames = atP.getProductName();
        int[] reQtyRemain = atP.getQtyRemaining();
        int[] reRequiredPts = atP.getRequiredPoint();

        for (int i = 0; i < reProdNames.length; i++) {
            System.out.println((i + 1) + "." + reProdNames[i] + "\tQuantity remaining:" + reQtyRemain[i] + "\tRequired points:" + reRequiredPts[i]);
        }
        System.out.print("Choose product to redeem(One at a time):");
        int opt2 = main.enterChoice();
        switch (opt2) {
            case 1:
                this.redeemProgress(reQtyRemain, reRequiredPts, opt2, customer);
                break;
            case 2:
                this.redeemProgress(reQtyRemain, reRequiredPts, opt2, customer);
                break;
            case 3:
                this.redeemProgress(reQtyRemain, reRequiredPts, opt2, customer);
                break;
            default:
                System.out.println("Cancelled redemption");
                break;
        }
    }
    
    


    // public void redeemProgress(int[] prodQty, int[] requiredPts, int i, Customer[] customer) {
    //     int fPoint = (int) customer[main.currentUser].getTotalPurchaseAmount() - requiredPts[i - 1];
    //     if (fPoint < 0) {
    //         System.out.println("Balance point insufficient.");
    //     } else {
    //         customer[main.currentUser].setTotalPurchaseAmount(fPoint);
    //         main.updateCustomerFile(customer);
    //         prodQty[i - 1] -= 1;
    //         this.setQtyRemaining(prodQty);
    //         System.out.println("Balance Point: " + fPoint);
    //         System.out.println("Product Remaining Quantity: " + prodQty[i - 1]);
    //     }
    // }

}
