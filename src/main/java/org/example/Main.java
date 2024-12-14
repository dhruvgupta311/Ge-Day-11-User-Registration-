package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Regex pattern for First Name validation (Starts with Capital and at least 3 characters)
        String namePattern = "^[A-Z][a-zA-Z]{2,}$";

        // Prompt user to enter a valid first name
        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        // Validate first name
        if (Pattern.matches(namePattern, firstName)) {
            System.out.println("Valid first name: " + firstName);
        } else {
            System.out.println("Invalid first name. Please ensure it starts with a capital letter and has at least 3 characters.");
            return; // Exit if first name is invalid
        }

        // Prompt user to enter a valid last name
        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        // Validate last name
        if (Pattern.matches(namePattern, lastName)) {
            System.out.println("Valid last name: " + lastName);
        } else {
            System.out.println("Invalid last name. Please ensure it starts with a capital letter and has at least 3 characters.");
        }

        // Close the scanner
        scanner.close();
    }
}
