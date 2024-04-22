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
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int phonenum;
       int choice;
       int user=0;
       //System allow n number users to register(in this case 10)
       Customer[]customer = new Customer[10];
       
       customer[0] = new Customer("TAN AH KOW",21,"ahkow@gmail.com",122,150.00);
       System.out.println("WELCOME TO BEEWARD!");
      do{
       
       System.out.print("1.Register New Account\n2.LOGIN TO EXISTING ACCOUNT\n3.Exit\nEnter Your Choice: ");
        choice = input.nextInt();
           switch (choice) {
               case 1:
                   customer[Customer.getUserRegistered()] = new Customer();
                   customer[Customer.getUserRegistered()].enterDetail();
                  // customer[Customer.getUserRegistered()] =new Customer(customer[Customer.getUserRegistered()].getName(),customer[Customer.getUserRegistered()].getAge(),customer[Customer.getUserRegistered()].getEmail(),customer[Customer.getUserRegistered()].getPhoneNum(),customer[Customer.getUserRegistered()].getTotalPurchaseAmount());
                   System.out.println(Customer.getUserRegistered());
                   System.out.println("GOING BACK TO HOME...");
                   break;
               case 2:
                   boolean result=false;
                   
                   do{
                    System.out.print("Enter Phone Number: ");
                    phonenum = input.nextInt();

                    for(int i = 0 ;i<Customer.getUserRegistered();i++){
                        if(customer[i].getPhoneNum()==phonenum){
                              System.out.println("User Found!");
                              result=true;
                              user=i;
                              break;
                             }


                    }
                    if (result==false){
                        System.out.println("User not found,Please Try Again.");
                    }
                   }while(result==false);
                   do{
                    System.out.println("Welcome back,"+customer[user].getName());
                    System.out.print("1.Update Details\n2.Add New Transaction Amount\n3.Redeem Point\n4.Back\nEnter choice: ");
                    choice = input.nextInt();
                    switch(choice){
                        case 1:
                            customer[user].updateDetail();
                           System.out.println("===========GOING BACK=========\n");

                            break;
                        case 2:
                            
                            break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("GOING BACK....");
                            break;
                        default:

                            System.out.println("GOING BACK...");
                            break;


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
     
}
