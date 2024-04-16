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
       Customer[]customer = new Customer[10];
       customer[0] = new Customer();
       customer[0].enterDetail();
       customer[0] =new Customer(customer[0].getName(),customer[0].getAge(),customer[0].getEmail(),customer[0].getPhoneNum(),customer[0].getTotalPurchaseAmount());
       
       if(customer[0].checkDetail()==false){
           System.out.println("User not found");
       }
       if(customer[0].updateDetail()==false){
           System.out.println("User not found");
       }
     
       
        
           
       
       
        
       
       
       
    }
     
}
