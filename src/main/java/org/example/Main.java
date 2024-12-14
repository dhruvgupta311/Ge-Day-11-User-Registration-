package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Regex pattern for Email validation
        String emailPattern = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        // Prompt user to enter a valid email
        System.out.println("Please enter your email address:");

        // Read input from user
        String email = scanner.nextLine();

        // Validate email using regex pattern
        if (Pattern.matches(emailPattern, email)) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email. Please enter a valid email in the format abc.xyz@bl.co.in.");
        }

        // Close the scanner
        scanner.close();
    }
}
