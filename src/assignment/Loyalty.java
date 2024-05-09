/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author xuan
 */
public class Loyalty {
    private String tierName;
    private String tierDescription;
    private int tierLevel;
    private Customer customer;

    public Loyalty() {
        
    }

    public Loyalty(String tierName, String tierDescription, int tierLevel, Customer customer) {
        this.tierName = tierName;
        this.tierDescription = tierDescription;
        this.tierLevel = tierLevel;
        this.customer = customer;
    }

    public String getTierName() {
        return tierName;
    }

    public void setTierName(String tierName) {
        this.tierName = tierName;
    }

    public String getTierDescription() {
        return tierDescription;
    }

    public void setTierDescription(String tierDescription) {
        this.tierDescription = tierDescription;
    }

    public int getTierLevel() {
        return tierLevel;
    }

    public void setTierLevel(int tierLevel) {
        this.tierLevel = tierLevel;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String displayTier() {
        return "Your Current Tier is Tier " + tierLevel + ", " + tierName;
    }
    
    public int updateTier(double amount, Customer customer) {
        if (amount >= 10000 ) {
            tierLevel = 3;
            tierName = "Platinum";
        } else if (amount >= 1000) {
            tierLevel = 2;
            tierName = "Gold";
        } else if (amount >= 100) {
            tierLevel = 1;
            tierName = "Silver";
        } else {
            tierLevel = 0;
            tierName = "No Tier";
        }

        customer.setTier(tierName);
        
        return tierLevel;
    }
}
