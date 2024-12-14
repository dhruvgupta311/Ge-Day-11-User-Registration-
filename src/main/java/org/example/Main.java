package org.example;

import java.util.regex.Pattern;

public class Main {

    // Method to validate email address
    public boolean isEmailValid(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        return Pattern.matches(regex, email);
    }

    // Main method to test email validation
    public static void main(String[] args) {
        Main userRegistration = new Main();

        // Testing the email validation with both valid and invalid emails
        System.out.println(userRegistration.isEmailValid("abc.xyz@bl.co.in"));  // Should return true
        System.out.println(userRegistration.isEmailValid("abc@.com.my"));        // Should return false
    }
}
