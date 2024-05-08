/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Superaiyoyyoo
 */
import java.util.Random;

public class ReferralCode extends Customer {
    private String referralCode;

    public ReferralCode() {
       generateReferralCode();
    }

    public ReferralCode(String name, int age, String email, int phoneNum, double totalPurchaseAmount) {
        super(name, age, email, phoneNum, totalPurchaseAmount);
        generateReferralCode();
    }

    private void generateReferralCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        referralCode = sb.toString();
    }
    
    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }
    
    public void displayReferralCode(Customer[] customers, int currentUser) {
        if (customers[currentUser] instanceof ReferralCode) {
            ReferralCode referralCustomer = (ReferralCode) customers[currentUser];
            System.out.println("Referral Code: " + referralCustomer.getReferralCode());
        }else {
            System.out.println("Referral code not applicable for this customer.");
        }
    }
    
}

