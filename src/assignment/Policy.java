/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author xuan
 */
public class Policy {
    private String descPolicy;

    public Policy() {
    }

    public Policy(String descPolicy) {
        this.descPolicy = descPolicy;
    }

    public String getDescPolicy() {
        return descPolicy;
    }

    public void setDescPolicy(String descPolicy) {
        this.descPolicy = descPolicy;
    }
    
    public String displayReport() {
        return descPolicy;
    }
}
