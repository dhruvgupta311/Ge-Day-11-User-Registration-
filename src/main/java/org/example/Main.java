package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Regex pattern for password validation (including all 4 rules)
        String r1 = ".{8,}"; // Minimum 8 characters
        String r2 = "(?=.*[A-Z]).*"; // At least one uppercase letter
        String r3 = "(?=.*[0-9]).*"; // At least one numeric number
        String r4 = "(?=.*[@#$%^&+=!]).*"; // At least one special character
        // Prompt user to enter a valid password
        System.out.println("Please enter your password (Minimum 8 characters, at least 1 uppercase letter, 1 numeric digit, and exactly 1 special character):");

        // Read input from user
        String password = scanner.nextLine();

        // Validate password using regex pattern
        if (Pattern.matches(r4, password) && Pattern.matches(r3, password)
                && Pattern.matches(r2, password) && Pattern.matches(r1, password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password. Please follow these rules:");
            System.out.println("1. Minimum 8 characters.");
            System.out.println("2. At least 1 uppercase letter.");
            System.out.println("3. At least 1 numeric digit.");
            System.out.println("4. Exactly 1 special character.");
        }

        // Close the scanner
        scanner.close();
    }
}
