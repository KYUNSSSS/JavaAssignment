package assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ReferralCode {
    private String referralCode;

    public ReferralCode() {
    }

    public ReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public String generateReferralCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        referralCode = sb.toString();
        return referralCode;
    }

    public void addReferralCodeToFile() {
        try {
            File custFile = new File("customerfile.txt");
            File tempFile = new File("tempfile.txt");
            FileWriter writer = new FileWriter(tempFile);
            Scanner read = new Scanner(custFile);

            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] values = line.split(",");
                if (values.length > 0) {
                    int userRegistered = Integer.parseInt(values[0]);
                    if (userRegistered > 0) {
                        // Generate a referral code
                        generateReferralCode();
                        // Append the referral code to the end of the line
                        line += "," + referralCode;
                    }
                }
                writer.write(line + "\n"); // Write the modified line to the temporary file
            }

            writer.close();
            read.close();

            // Rename tempfile.txt to customerfile.txt
            if (!custFile.delete()) {
                System.out.println("Failed to delete the original file.");
                return;
            }
            if (!tempFile.renameTo(custFile)) {
                System.out.println("Failed to rename the temporary file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}




