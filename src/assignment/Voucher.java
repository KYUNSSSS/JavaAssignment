/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Asus
 */
public class Voucher extends Product{

    public Voucher() {
    }

    public Voucher(String vcName, String vcDescription, int vcQty, int vcRedeemed, int requiredPoint) {
        super(vcName, vcDescription, vcQty, vcRedeemed, requiredPoint);
    }
    
//    public static Voucher iniVoucher(){
//        String[] vcNames = {"RM5 Discount Voucher","RM10 Discount Voucher","RM20 Discount Voucher"};
//        String[] vcDesc = {"Deduct RM5 on Next Purchase","Deduct RM10 on Next Purchase","Deduct RM20 on Next Purchase"};
//        int[] vcQtyRemain = {10,10,10};
//        int[] vcRequiredPts = {490,950,1900};
//
//        Voucher voucher = new Voucher();
//        
//        voucher.setProductName(vcNames);
//        voucher.setProdDescription(vcDesc);
//        voucher.setQtyRemaining(vcQtyRemain);
//        voucher.setRequiredPoint(vcRequiredPts);
//        
//        return voucher;
//    } 
    
//    public void redeemProduct(Voucher voucher,Customer[] customer){
//        String[] vcNames = voucher.getProductName();
//        int[] vcRemain = voucher.getQtyRemaining();
//        int[] vcRequiredPts = voucher.getRequiredPoint();
//
//        for(int i=0; i<vcNames.length;i++){
//            System.out.println((i+1) + "." + vcNames[i] + "\tQuantity remaining:" + vcRemain[i] + "\tRequired point:" + vcRequiredPts[i]);
//        }
//            System.out.print("Choose product to redeem(One at a time):");
//            int opt2 = main.enterChoice();
//            switch(opt2){
//                case 1:
//                    this.redeemProgress(vcRemain,vcRequiredPts,opt2,customer);
//                    break;
//                case 2:
//                    this.redeemProgress(vcRemain,vcRequiredPts,opt2,customer);
//                    break;
//                case 3:
//                    this.redeemProgress(vcRemain,vcRequiredPts,opt2,customer);
//                    break;
//                default:
//                    System.out.println("Cancelled redemption");
//                    break;
//            }
//    }

//    public void redeemProgress(int[] prodQty,int[] requiredPts, int i, Customer[] customer){
//    
//        int fPoint = (int)customer[main.currentUser].getTotalPurchaseAmount() - requiredPts[i-1];
//        if(fPoint < 0){
//            System.out.println("Balance point insufficient.");
//        }else{
//            customer[main.currentUser].setTotalPurchaseAmount(fPoint);
//            main.updateCustomerFile(customer);
//            prodQty[i-1]-=1;
//            this.setQtyRemaining(prodQty);
//            System.out.println("Balance Point: " + fPoint);
//            System.out.println("Product Remaining Quantity: " + prodQty[i-1]);
//        }   
//    }

}
