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
   
       
    public static void redemption(AllTierProduct atP, LimitedProduct liP, Voucher voucher, Customer[] customer, String tier){
        Menu.redeemMenu();
        int opt = main.enterChoice();

        switch(opt){
            case 1:
                atP.redeemProduct(atP,customer);
                break;
            case 2:
                if(tier == "No Tier"){
                    System.out.println("Tier Level too low to redeem Tier Limited Item.");
                } else {
                    liP.redeemProduct(liP,tier,customer);
                }
                break;                
            case 3:
                voucher.redeemProduct(voucher,customer);
                break;
            default:
                System.out.print("Cancelled redemption");
        }
    }
    
}



