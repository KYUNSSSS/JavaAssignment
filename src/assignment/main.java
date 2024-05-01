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
                            //Menu.backAction();
                            break;
                        case 4:
                            Menu.backAction();
                            break;
                        default:
                            Menu.backAction();                         
                    }
                   }while(choice!=4);             
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
