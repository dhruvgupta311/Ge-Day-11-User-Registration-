package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Regex pattern for Mobile Number validation
        String mobilePattern = "^\\d{2} \\d{10}$"; // Country code followed by space and 10 digits
        // Prompt user to enter a valid mobile number
        System.out.println("Please enter your mobile number ");

        // Read input from user
        String mobileNumber = scanner.nextLine();

        // Validate mobile number using regex pattern
        if (Pattern.matches(mobilePattern, mobileNumber)) {
            System.out.println("Valid mobile number: " + mobileNumber);
        } else {
            System.out.println("Invalid mobile number. Please enter a valid mobile number in the format 91 9919819801.");
        }

        // Close the scanner
        scanner.close();
    }
}
