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
    private AllTierProduct allTierProduct;
    private Voucher voucher;
    private LimitedProduct limitedProduct;
    private int quantity;
    
    public Redemption() {
    }

    public Redemption(AllTierProduct allTierProduct, Voucher voucher, LimitedProduct limitedProduct, int quantity) {
        this.allTierProduct = allTierProduct;
        this.voucher = voucher;
        this.limitedProduct = limitedProduct;
        this.quantity = quantity;
    }

    public AllTierProduct getAllTierProduct() {
        return allTierProduct;
    }

    public void setAllTierProduct(AllTierProduct allTierProduct) {
        this.allTierProduct = allTierProduct;
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
   
  public void redeemProduct(Product[] product, Customer[] customer, String tier){
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("                                       Product Menu");
        System.out.println("______________________________________________________________________________________________");
        System.out.println("\nAll Tier Product");
        
        System.out.println("______________________________________________________________________________________________");
        System.out.println("  No.            Product           Quantity Remaining     Required Points     Tier Required");
        System.out.println("______________________________________________________________________________________________");
        for(int i=0; i<(3);i++){
            System.out.printf("  %-3d     %-23s          %-20d %-18d %-2s\n", (i + 1),product[i].getProductName(),product[i].getProdQty(), product[i].getRequiredPoint(),"-");        
        }
        System.out.println("\nTier Limited Product");
        System.out.println("______________________________________________________________________________________________");
        System.out.println("  No.            Product           Quantity Remaining     Required Points     Tier Required");
        System.out.println("______________________________________________________________________________________________");
        for(int i=3; i<(6);i++){
            System.out.printf("  %-3d     %-23s          %-20d %-16d %s\n", (i + 1),product[i].getProductName(),product[i].getProdQty(), product[i].getRequiredPoint(),((LimitedProduct)product[i]).getTier());
                }
        System.out.println("\nVoucher");
        System.out.println("______________________________________________________________________________________________");
        System.out.println("  No.            Product           Quantity Remaining     Required Points     Tier Required");
        System.out.println("______________________________________________________________________________________________");
        for(int i=6; i<(9);i++){
            System.out.printf("  %-3d     %-23s          %-20d %-18d %-3s\n", (i + 1),product[i].getProductName(),product[i].getProdQty(), product[i].getRequiredPoint(),"-");
                }

        
        int opt = main.enterChoice();
        int qty=0;
        switch(opt){
            case 1,2,3:
                if (opt == 1){
                    choice = 0;
                } else if (opt == 2){
                    choice = 1;
                } else if(opt == 3){
                    choice = 2;
                } 
                qty = this.enterQuantity(product, opt);
                this.redeemProgress(product,choice,qty,customer);
                break;
            case 4,5,6:
                if (opt == 4){
                    if (tier.equals("Silver") || tier.equals("Gold") || tier.equals("Platinum")){
                        choice = 3; 
                        qty = this.enterQuantity(product, opt);
                    }else{
                        System.out.println("Tier level too low.");
                    }
                } else if (opt == 5){
                    if (tier.equals("Gold") || tier.equals("Platinum")){
                        choice = 4;    
                        qty = this.enterQuantity(product, opt);
                    }else{
                        System.out.println("Tier level too low.");
                    }
                } else if(opt == 6){
                    if (tier.equals("Platinum")){
                        choice = 5;         
                        qty = this.enterQuantity(product, opt);
                    }else{
                        System.out.println("Tier level too low.");
                    }
                }
                this.redeemProgress(product,choice,qty,customer);
                break;
            case 7,8,9:
                if (opt == 7){
                    choice = 6;
                } else if (opt == 8){
                    choice = 7;
                } else if(opt == 9){
                    choice = 8;
                }
                this.redeemProgress(product,choice,qty,customer);
                break;
        }
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
            System.out.println("Balance Point: " + finalPoint + "\n");
        }
    }
  
  public int enterQuantity(Product[] product, int opt) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean a = true;
        do {
            try {
                System.out.print("\nEnter Quantity: ");
                num = scan.nextInt();
                if (num > product[opt-1].getProdQty() && num>0){
                    System.out.println("Quantity entered out of range.");
                    a = false;
                }else{
                    a = true;                   
                }
            } catch (Exception ex) {
                System.out.println("Please number number only.");
                a = false;
                scan.nextLine();
            }

        } while (a == false);

        return num;

    }
    
}




