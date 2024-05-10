package assignment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
    private LocalDate pointDate;
    private double totalPurchaseAmount = 0;
    private String tier;
    private static int userRegistered;
    
    public Customer() {
        File custfile = new File("customerfile.txt");
        try {

            Scanner read = new Scanner(custfile);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] values = line.split(",");
                if (values.length > 0) {
                    userRegistered = Integer.parseInt(values[0])+1;
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    
    public Customer(String name, int age, String email, int phoneNum, double totalPurchaseAmount) {
    
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNum = phoneNum;
        this.totalPurchaseAmount = totalPurchaseAmount;
        pointDate = LocalDate.now();
        userRegistered++;
    }
    public Customer(String name, int age, String email, int phoneNum, double totalPurchaseAmount,LocalDate date) {
    
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNum = phoneNum;
        this.totalPurchaseAmount = totalPurchaseAmount;
        this.pointDate = date;
        userRegistered++;
        File custfile = new File("customerfile.txt");
            try {
               
            FileWriter writer = new FileWriter(custfile,true);
            Scanner read = new Scanner(custfile);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] values = line.split(",");
                if (values.length > 0) {
                    userRegistered = Integer.parseInt(values[0])+1;
                }
            }
            
            String input = String.format("%d,%s,%d,%s,%d,%.2f%n", userRegistered,name, age, email, phoneNum, totalPurchaseAmount);
            writer.write(input);
            writer.close();
           // writer.write( String.format("%d,%d,%s,%d,%.2f\n", userRegistered, age, email, phoneNum, totalPurchaseAmount));
            read.useDelimiter(",");
            while (read.hasNext())
                System.out.println(read.next());
       
            } catch (IOException e) {
              System.out.println("An error occurred.");
            }
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

    public LocalDate getPointDate() {
        return pointDate;
    }

    public void setPointDate(LocalDate pointDate) {
        this.pointDate = pointDate;
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

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public static int getUserRegistered() {
        return userRegistered;
    }

    public static void setUserRegistered(int userRegistered) {
        Customer.userRegistered = userRegistered;
    }
    
    public void enterDetail(){
        boolean a;//a store value to decide whether user need to re-enter.
        do{
        System.out.print("Enter Name(Ali bin Abu)(0 to return): ");
        name = input.nextLine();
        if(name.isBlank()){  
            System.out.println("Name cannot be empty.");
            a=!(name.isBlank());
        }else if(name.equals("0")){
            return;
        }
        else{
            a=true;
        }
        }while(!a);
        
        
            do{
                try{
                    System.out.print("Enter Age: ");
                    age = input.nextInt();
                    a=Integer.toString(age).matches("[1-9]||[1-9][0-9]");
                    if(a==false)
                        System.out.println("Invalid value.Please Enter number between 1 to 99.");
                    }catch(Exception ex){
                         System.out.println("Please enter numbers only.");
                         a=false;
                         input.nextLine();
                         }
                   
                    
           }while(a==false);
        
         input.nextLine();
         do {
            System.out.print("Enter Email (example@gmail.com): ");
            email = input.nextLine(); 

            a = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
                if (!a)
                    System.out.println("Invalid value. Please follow the format.");
            } while (!a);


        do{
            try{
                System.out.print("Enter Phone Number(123456789): +60");
                phoneNum = input.nextInt();
                if(main.chkPhoneNumber(this.phoneNum)==true){
                    System.out.println("Phone number used.Please try again.");
                    a=false;
                    
                }else{
                    if(Integer.toString(phoneNum).length()<9 || Integer.toString(phoneNum).length()>10){
                        System.out.println("Invalid format.Enter 9 to 10 value only.");

                        a=false;}
                    else{
                         a=true;}
                    }
            }catch(Exception ex){
            System.out.println("Invalid Format. Enter numbers only.");
            a=false;
            input.nextLine();
        }
        }while(a==false);
        do{
            try{
                System.out.print("Enter Purchase Amount:RM ");
                totalPurchaseAmount = input.nextDouble();
                if(totalPurchaseAmount>=10000){
                    System.out.println("Limit Exceed. Pleasse enter value between 0 to 10000 only.");
                }
            }catch(Exception ex){
                System.out.println("Invalid Format.Enter numbers only.");
                a=false;
            }
        }while(!a);
        File custfile = new File("customerfile.txt");
            try {
               
            FileWriter writer = new FileWriter(custfile,true);
            Scanner read = new Scanner(custfile);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] values = line.split(",");
                if (values.length > 0) {
                    userRegistered = Integer.parseInt(values[0])+1;
                }
            }
            
            String input = String.format("%d,%s,%d,%s,%d,%.2f,%s%n", userRegistered,name, age, email, phoneNum, totalPurchaseAmount,pointDate.toString());
            writer.write(input);
            writer.close();
           // writer.write( String.format("%d,%d,%s,%d,%.2f\n", userRegistered, age, email, phoneNum, totalPurchaseAmount));
            read.useDelimiter(",");
            while (read.hasNext())
                System.out.println(read.next());
       
            } catch (IOException e) {
              System.out.println("An error occurred.");
            }
                
        System.out.println("Registered Successfully.");
        System.out.print("Press any key to return...");
        input.next();
    
    }
   
    public void updateDetail(){
        int num;
        int choice;
        boolean a;
            System.out.print("\nWhat to update?\n1.Name ["+name+"]"+"\n2.Age ["+age+"]"+"\n3.Email {"+email+"]"+"\n4.Phone Number ["+phoneNum+"]"+"\n5.Back\nSelect One:");
            choice= input.nextInt();
            
        switch (choice) {
            case 1:
                do{
                    System.out.print("Enter Name(Ali bin Abu): ");
                    name = input.nextLine();
                    if(name.isBlank()){  
                        System.out.println("Name cannot be empty.");
                        a=!(name.isBlank());
                    }else if(name.equals("0")){
                        return;
                    }
                    else{
                        a=true;
                    }
                }while(!a);
             
                System.out.printf("%s %s" ,"New Name: ",name+"\n");
                break;
            case 2:
                   do{
                        try{
                            System.out.print("Enter Age: ");
                            age = input.nextInt();
                            a=Integer.toString(age).matches("[1-9]||[1-9][0-9]");
                            if(a==false)
                                System.out.println("Invalid value.Please Enter number between 1 to 99.");
                            }catch(Exception ex){
                                 System.out.println("Please enter numbers only.");
                                 a=false;
                                 input.nextLine();
                                 }


                   }while(a==false);
                
                System.out.printf("%s %s" ,"New Age: ",age+"\n");
                break;
            case 3:
                    do {
                    System.out.print("Enter Email (example@gmail.com): ");
                    input.nextLine();
                    email = input.nextLine(); 

                    a = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
                        if (!a)
                            System.out.println("Invalid value. Please follow the format.");
                    } while (!a);   

                
                
                System.out.printf("%s %s" ,"New Email: ",email+"\n");
                break;
            case 4:
                    do{
                            try{
                                System.out.print("Enter Phone Number(123456789): +60");
                                phoneNum = input.nextInt();
                                if(main.chkPhoneNumber(this.phoneNum)==true){
                                    System.out.println("Phone number used.Please try again.");
                                    a=false;

                                }else{
                                    if(Integer.toString(phoneNum).length()<9 || Integer.toString(phoneNum).length()>10){
                                        System.out.println("Invalid format.Enter 9 to 10 value only.");

                                        a=false;}
                                    else{
                                         a=true;}
                                    }
                            }catch(Exception ex){
                            System.out.println("Invalid Format. Enter numbers only.");
                            a=false;
                            input.nextLine();
                        }
                        }while(a==false);
         
                
                System.out.printf("%s %s" ,"New Phone Number: ",phoneNum+"\n");
                break;
            default:
                break;
        }
                  

       }
    public void updateAmount(){
        double num;
        System.out.print("Balance Amount: RM"+this.totalPurchaseAmount+"\n");
        System.out.print("Enter Amount to add: RM");
        num = input.nextDouble();
        this.totalPurchaseAmount+=num;
        pointDate = LocalDate.now();
        System.out.print("New  Balance Amount: RM"+this.totalPurchaseAmount+"\n");
        
    }

    public void updateReferralCode() {
        Scanner scanner = new Scanner(System.in);
        // Random random = new Random();
        // StringBuilder sb = new StringBuilder();
        // String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // for (int i = 0; i < 6; i++) {
        //     int index = random.nextInt(characters.length());
        //     sb.append(characters.charAt(index));
        // }
        // String refferalCode = sb.toString();
        String refferalCode = "ABC123";
        System.out.print("Enter the referral code: ");
        String inputCode = scanner.next();
        if(inputCode.equals(refferalCode)){
            System.out.println("You earned 50 points!");
            this.totalPurchaseAmount += 50;
            
        }else{
            System.out.println("Invalid code! ");  
        }
    }
    
    public String displayProfile(){
        return  "Name        : " + name +
                "\nAge         : " + age +
                "\nEmail       : " + email +
                "\nPhone Number: " + phoneNum;
    }  
}
