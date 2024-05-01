package assignment;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */


public class main {
       static int phonenum;
       static int choice;
       static int currentUser=0;
       static boolean result;
       static double point;
       //System allow n number users to register(in this case 10)
       static Customer[]customer = new Customer[10];
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Menu.addHardcodeCust();
       Menu.splashScreen();
      do{
        Menu.mainMenu();
        choice = input.nextInt();
           switch (choice) {
               case 1:
                   customer[Customer.getUserRegistered()] = new Customer();
                   customer[Customer.getUserRegistered()].enterDetail();
                   System.out.println(Customer.getUserRegistered());
                   Menu.backAction();
                   break;
               case 2:                
                   do{
                    System.out.print("Enter Phone Number: ");
                    phonenum = input.nextInt();                 
                    for(int i = 0 ;i<Customer.getUserRegistered();i++){
                        if(customer[i].getPhoneNum()==phonenum){
                              System.out.println("User Found!");
                              result=true;
                              currentUser=i;
                              break;
                             }
                    }
                    if (result==false){
                        System.out.println("User not found,Please Try Again.");
                    }
                   }while(result==false);
                   do{
                    System.out.println("Welcome back,"+customer[currentUser].getName());
                    Menu.userMenu();
                    choice = input.nextInt();
                    switch(choice){
                        case 1:
                            customer[currentUser].updateDetail();
                           Menu.backAction();
                            break;
                        case 2:
                            customer[currentUser].updateAmount();
                             Menu.backAction();
                            break;
                        case 3:
                            Point pointInstance = new Point(customer[currentUser]);
                            pointInstance.checkAmount();
                            pointInstance.checkExpiryDate();
                            Menu.backAction();
                            break;
                        case 4:
                            String[] reProdNames = {"Pillow","Headphone","Backpack"};
                            String[] reProdDesc = {"Harvey Norman","CookingPanDesc","BackpackDesc"};
                            int[] reQtyRemain= {10,12,15};
                            int[] reRequiredPts = {250,500,800};

                            String[] liTier = {"Silver","Gold","Gold"};
                            String[] liProdNames = {"Vacuum Cleaner","Cooking Pan","Knife Set"};
                            String[] liProdDesc = {"VacuumCleanerDesc","CookingPanDesc","KnifeSetDesc"};
                            int[] liQtyRemain = {10,13,20};
                            int[] liRequiredPts = {1000,600,800};   

                            String[] vcNames = {"RM5 Discount Voucher","RM10 Discount Voucher","RM20 Discount Voucher"};
                            String[] vcDesc = {"Deduct RM5 on Next Purchase","Deduct RM10 on Next Purchase","Deduct RM20 on Next Purchase"};
                            int[] vcQtyRemain = {10,10,10};
                            int[] vcRequiredPts = {490,950,1900};

                            RedemptionProduct reP = new RedemptionProduct();
                            LimitedProduct liP = new LimitedProduct();
                            Voucher voucher = new Voucher();

                            reP.setProductName(reProdNames);
                            reP.setProdDescription(reProdDesc);
                            reP.setQtyRemaining(reQtyRemain);
                            reP.setRequiredPoint(reRequiredPts);

                            liP.setTier(liTier);
                            liP.setProductName(liProdNames);
                            liP.setProdDescription(liProdDesc);
                            liP.setQtyRemaining(liQtyRemain);
                            liP.setRequiredPoint(liRequiredPts);

                            voucher.setVcName(vcNames);
                            voucher.setVcDescription(vcDesc);
                            voucher.setVcRemaining(vcQtyRemain);
                            voucher.setRequiredPoint(vcRequiredPts);

                            Scanner scanner = new Scanner(System.in);
                            Menu.redeemMenu();
                            int opt = scanner.nextInt();

                            switch(opt){
                                case 1:
                                    for(int i=0; i<reProdNames.length;i++){
                                        System.out.println((i+1) + "." + reProdNames[i] + "\tQuantity remaining:" + reQtyRemain[i]);
                                    }
                                    System.out.print("Choose product to redeem(One at a time):");
                                    int opt2 = scanner.nextInt();
                                    switch(opt2){
                                        case 1:
                                            Redemption.reRedeemProgress(reQtyRemain,reRequiredPts,opt2);
                                            break;
                                        case 2:
                                            Redemption.reRedeemProgress(reQtyRemain,reRequiredPts,opt2);
                                            break;
                                        case 3:
                                            Redemption.reRedeemProgress(reQtyRemain,reRequiredPts,opt2);
                                            break;
                                        default:
                                            System.out.print("Cancelled redemption");
                                            break;
                                    }
                                    break;

                                case 2:
                                    for(int i=0; i<liProdNames.length;i++){
                                        System.out.println((i+1) + "." + liProdNames[i] + "\tQuantity remaining:" + liQtyRemain[i]);
                                    }
                                    System.out.print("Choose product to redeem(One at a time):");
                                    opt2 = scanner.nextInt();
                                    switch(opt2){
                                        case 1:
                                            Redemption.liRedeemProgress(liQtyRemain,liRequiredPts,opt2);
                                            break;
                                        case 2:
                                            Redemption.liRedeemProgress(liQtyRemain,liRequiredPts,opt2);
                                            break;
                                        case 3:
                                            Redemption.liRedeemProgress(liQtyRemain,liRequiredPts,opt2);
                                            break;
                                        default:
                                            System.out.print("Cancelled redemption");
                                            break;
                                    }
                                    break;                
                                case 3:
                                    for(int i=0; i<vcNames.length;i++){
                                        System.out.println((i+1) + "." + vcNames[i]);
                                    }
                                    System.out.print("Choose product to redeem(One at a time):");
                                    opt2 = scanner.nextInt();
                                    switch(opt2){
                                        case 1:
                                            Redemption.vcRedeemProgress(vcQtyRemain,vcRequiredPts,opt2);
                                            break;
                                        case 2:
                                            Redemption.vcRedeemProgress(vcQtyRemain,vcRequiredPts,opt2);
                                            break;
                                        case 3:
                                            Redemption.vcRedeemProgress(vcQtyRemain,vcRequiredPts,opt2);
                                            break;
                                        default:
                                            System.out.print("Cancelled redemption");
                                            break;
                                    }
                                    break;

                                default:
                                    System.out.print("Cancelled redemption");
                            }
                        case 5:
                            Menu.backAction();
                            break;
                        default:
                            Menu.backAction();                         
                    }
                   }while(choice!=5);             
                   break;
               case 3:
                   System.out.println("Thank you for using our system!");
                        break;
               default:
                   break;
           }
      }while(choice !=3);
           
    }
     public static boolean chkPhoneNumber(int hpnum){
        for(int i = 0 ;i<Customer.getUserRegistered();i++){
                        if(customer[i].getPhoneNum()==hpnum){
                          
                              result=true;
                              break;
                         }else{
                            result=false;
                        }
        
    }
        return result;
   }
     
}
