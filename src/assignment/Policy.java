
package assignment;

import java.util.Scanner;

public abstract class Policy {

    protected abstract void displayMainMenu();
    protected abstract void continueReadingPolicy();
    protected static int enterChoice() {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean validInput = false;
        do {
            try {
                System.out.print("\nEnter your choice: ");
                num = scan.nextInt();
                validInput = true;
            } catch (Exception ex) {
                System.out.println("Please enter numbers displayed only.");
                scan.nextLine();
            }
        } while (!validInput);
        return num;
    }

}
