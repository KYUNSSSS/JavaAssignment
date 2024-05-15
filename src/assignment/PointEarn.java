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

    public PointEarn() {
    }

    public PointEarn(Customer[] customer) {
        double totalAmounts = customer[main.currentUser].getTotalPurchaseAmount();
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

    public void playGame(Customer[] customer) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("***************************************************************");
        System.out.println("*                             Games                           *");
        System.out.println("***************************************************************");
        System.out.println("*                                                             *");
        System.out.println("*                                                             *");
        System.out.println("*                 Welcome to the Games section!               *");
        System.out.println("*                  You can play up to 5 games.                *");
        System.out.println("*           Each game provides a chance to earn 50 points.    *");
        System.out.println("*                    Have fun and good luck!                  *");
        System.out.println("*                                                             *");
        System.out.println("*                                                             *");
        System.out.println("*                (\\__/)                   (\\__/)              *");
        System.out.println("*                (='.'=)                  (='.'=)             *");
        System.out.println("*                (:)_(:)                  (:)_(:)             *");
        System.out.println("*                                                             *");
        System.out.println("***************************************************************");

        while (gamesPlayed < 5) {
            System.out.println("\nGame " + (gamesPlayed + 1) + ":");
            int num1 = random.nextInt(900) + 100; // Generate a random 3-digit number
            int num2 = random.nextInt(900) + 100; // Generate another random 3-digit number
            int correctAnswer = num1 + num2;

            System.out.println("What is the result of " + num1 + " + " + num2 + "?");
            try {
                int userAnswer = scanner.nextInt();
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct! You earned 50 points.");
                    points += 50;
                    customer[main.currentUser].updateTotalPurchaseAmounts(50);
                    main.updateCustomerFile(customer);
                    attemptsLeft = 3; // Reset attempts for the next game
                    gamesPlayed++;
                    if (gamesPlayed < 5) {
                        boolean validChoice = false;
                        while (!validChoice) {
                            System.out.println("Do you want to play again? [Y/N]");
                            String choice = scanner.next();
                            if (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("y")) {
                                validChoice = true;
                            } else if (choice.equalsIgnoreCase("N") || choice.equalsIgnoreCase("n")) {
                                System.out.println("Exiting...");
                                return; // Exit the method
                            } else {
                                System.out.println("Invalid input! Please enter [Y/N].\n");
                            }
                        }
                    } else {
                        System.out.println("The games have reached their limit. Exiting...");
                        return; // Exit the method
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
                attemptsLeft--;
                if (attemptsLeft == 0) {
                    System.out.println("You've run out of attempts. Moving to the next game.");
                    attemptsLeft = 3; // Reset attempts for the next game
                    gamesPlayed++;
                } else {
                    System.out.println("You have " + attemptsLeft + " attempts left.");
                }
                scanner.next(); 
            }
        }
        System.out.println("Total points: " + points);
    }

    public static void updateReferralCode(Customer[] customer) {
        Scanner scanner = new Scanner(System.in);
        String referralCode = "ABC123";
        boolean validCodeEntered = false;

        while (!validCodeEntered) {
            System.out.print("\nEnter the referral code: ");
            String inputCode = scanner.next();

            if (inputCode.equals(referralCode)) {
                System.out.println("\nYou earned 50 points!");
                double amt = customer[main.currentUser].getTotalPurchaseAmount() + 50;
                customer[main.currentUser].setTotalPurchaseAmount(amt) ;
                validCodeEntered = true;
            } else {
                System.out.println("Invalid code! Please try again.");
            }
        }
    }
}
