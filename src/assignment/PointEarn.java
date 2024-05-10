/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package assignment;

import java.util.Random;
import java.util.Scanner;


public class PointEarn {
    private int points;
    private int attemptsLeft;
    private int gamesPlayed;
    private Customer customer;

    public PointEarn() {
    }

    public PointEarn(Customer customer) {
        this.customer = customer;
        double totalAmounts = customer.getTotalPurchaseAmount();
        this.points = (int) Math.round(totalAmounts);
        attemptsLeft = 3;
        gamesPlayed = 0;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public void setAttemptsLeft(int attemptsLeft) {
        this.attemptsLeft = attemptsLeft;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (gamesPlayed < 5) {
            System.out.println("Game " + (gamesPlayed + 1) + ":");
            int num1 = random.nextInt(900) + 100; // Generate a random 3-digit number
            int num2 = random.nextInt(900) + 100; // Generate another random 3-digit number
            int correctAnswer = num1 + num2;

            System.out.println("What is the result of " + num1 + " + " + num2 + "?");
            try {
                int userAnswer = scanner.nextInt();
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct! You earned 50 points.");
                    points += 50;
                    attemptsLeft = 3; // Reset attempts for the next game
                    gamesPlayed++;
                    if (gamesPlayed < 5) {
                        System.out.println("Do you want to play again? (yes/no)");
                        String choice = scanner.next();
                        if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("y")) {
                            System.out.println("Exiting...");
                            break;
                        }
                    } else {
                        System.out.println("The games have the limit of 5 times. Exiting...");
                    }
                } else {
                    attemptsLeft--;
                    if (attemptsLeft == 0) {
                        System.out.println("Incorrect! You've run out of attempts. Moving to the next game.");
                        attemptsLeft = 3; // Reset attempts for the next game
                        gamesPlayed++;
                    } else {
                        System.out.println("Incorrect! Try again. You have " + attemptsLeft + " attempts left.");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid format. Please use numbers.");
                attemptsLeft = 2; // Reset attempts to 2 if input format is invalid
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
        System.out.println("Total points: " + points);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        PointEarn pointEarn = new PointEarn(customer);
        pointEarn.playGame();
    }
}
