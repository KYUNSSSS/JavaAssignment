/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Customer {
    Scanner input = new Scanner(System.in);
    private String name = "";
    private int age = 0;
    private String email = "";
    private int phoneNum = 0 ;
    private double totalPurchaseAmount = 0;
    
     public Customer() {
    }

    
    public Customer(String name, int age, String email, int phoneNum, double totalPurchaseAmount) {
    
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNum = phoneNum;
        this.totalPurchaseAmount = totalPurchaseAmount;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public void setTotalPurchaseAmount(double totalPurchaseAmount) {
        this.totalPurchaseAmount = totalPurchaseAmount;
    }
    
    public void enterDetail(){
        System.out.print("Enter Name(Ali bin Abu): ");
        name = input.nextLine();
        
        System.out.print("Enter Age: ");
        age = input.nextInt();
       
        System.out.print("Enter Email(example@gmail.com): ");
        email = input.nextLine();
        input.next();
        
        System.out.print("Enter Phone Number(0123456789): ");
        phoneNum = input.nextInt();
        
        System.out.print("Enter Purchase Amount:RM ");
        totalPurchaseAmount = input.nextDouble();
        
        System.out.println("Registered Successfully.");
    
    }
    public boolean checkDetail(){
        int num;
        boolean bool;
        System.out.print("==Check User==\n Enter Phone Number: ");
        num = input.nextInt();
        if (num == getPhoneNum()){
            System.out.println("User Found!");
            bool =true;
        }else{
            bool = false;
        }
           
            
        return bool;
       }
    public boolean updateDetail(){
        int num;
        int choice;
        boolean bool;
        System.out.print("==Update User==\n Enter Phone Number: ");
        num = input.nextInt();
        if (num == getPhoneNum()){
            System.out.println("User Found!\nWhat to update?\n1.Name\n2.Age\n3.Email\nPhone Number");
            choice= input.nextInt();
            
            if(choice ==1){
      
                System.out.print("Enter Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.printf("%s %s" ,"Name changed ",name);
            }
                
            
            bool =true;
        }else{
            bool = false;
        }
           
            
        return bool;
       }
 
 
   
    
}