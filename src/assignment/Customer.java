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
    private static int userRegistered;
    
     public Customer() {
    }

    
    public Customer(String name, int age, String email, int phoneNum, double totalPurchaseAmount) {
    
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNum = phoneNum;
        this.totalPurchaseAmount = totalPurchaseAmount;
        userRegistered++;
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

    public static int getUserRegistered() {
        return userRegistered;
    }

    public static void setUserRegistered(int userRegistered) {
        Customer.userRegistered = userRegistered;
    }
    
    public void enterDetail(){
        System.out.print("Enter Name(Ali bin Abu): ");
        name = input.nextLine();
        
        System.out.print("Enter Age: ");
        age = input.nextInt();
       
        System.out.print("Enter Email(example@gmail.com): ");
        email = input.nextLine();
        input.next();
        boolean a;
        do{
        System.out.print("Enter Phone Number(123456789): ");
        phoneNum = input.nextInt();
        if(main.chkPhoneNumber(this.phoneNum)==true){
            System.out.println("Phone number used.Please try again.");
            a=false;
        }else{
        a=true;}
        }while(a==false);
        System.out.print("Enter Purchase Amount:RM ");
        totalPurchaseAmount = input.nextDouble();
        userRegistered++;
        System.out.println("Registered Successfully.");
    
    }
    public boolean checkDetail(int phoneNum){
        
        boolean bool;
      
        
        if (phoneNum == getPhoneNum()){
            System.out.println("User Found!");
            bool =true;
        }else{
            bool = false;
        }
           
            
        return bool;
       }
    public void updateDetail(){
        int num;
        int choice;
        
        
        
        
            System.out.print("\nWhat to update?\n1.Name ["+name+"]"+"\n2.Age ["+age+"]"+"\n3.Email {"+email+"]"+"\n4.Phone Number ["+phoneNum+"]"+"\n5.Back\nSelect One:");
            choice= input.nextInt();
            
            if(choice ==1){
      
                System.out.print("Enter Name: ");
                input.nextLine();
                name = input.nextLine();
                System.out.printf("%s %s" ,"New Name: ",name+"\n");
            }else if(choice ==2){
                System.out.print("Enter Age: ");
                input.nextInt();
                age = input.nextInt();
                System.out.printf("%s %s" ,"New Age: ",age+"\n");
   
            }else if(choice ==3){
                System.out.print("Enter Email: ");
                input.nextLine();
                email = input.nextLine();
                System.out.printf("%s %s" ,"New Email: ",email+"\n");
                
            }else if(choice ==4){
                System.out.print("Enter Phone Number: ");
                input.nextInt();
                age = input.nextInt();
                System.out.printf("%s %s" ,"New Phone Number: ",phoneNum+"\n");
               
            }
                  

       }
    public void updateAmount(){
        double num;
        System.out.print("Balance Amount: RM"+this.totalPurchaseAmount+"\n");
        System.out.print("Enter Amount to add: RM");
        num = input.nextDouble();
        this.totalPurchaseAmount+=num;
        System.out.print("New  Balance Amount: RM"+this.totalPurchaseAmount+"\n");
        
    }
    
 
 
   
    
}