package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Regex pattern for First Name validation (Starts with Capital and at least 3 characters)
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";

        // Prompt user to enter a valid first name
        System.out.println("Please enter your first name:");

        // Read input from user
        String firstName = scanner.nextLine();

        // Check if the input matches the regex pattern
        if (Pattern.matches(firstNamePattern, firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }

        // Close the scanner
        scanner.close();
    }
}
