package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Method to check if the first name is valid
    public boolean isFirstNameValid(String firstName) {
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$"; // Starts with uppercase and at least 3 characters
        return firstName.matches(firstNamePattern);
    }

    // Method to check if the last name is valid
    public boolean isLastNameValid(String lastName) {
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$"; // Starts with uppercase and at least 3 characters
        return lastName.matches(lastNamePattern);
    }

    // Method to check if the email is valid
    public boolean isEmailValid(String email) {
        String emailPattern = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$"; // Valid email regex
        return email.matches(emailPattern);
    }

    // Method to check if the mobile number is valid
    public boolean isMobileNumberValid(String mobileNumber) {
        String mobilePattern = "^[0-9]{1,3} [0-9]{10}$"; // Country code followed by space and 10-digit number
        return mobileNumber.matches(mobilePattern);
    }

    // Method to check if the password meets all security requirements
    public boolean isPasswordSecure(String password) {
        String minLength = ".{8,}"; // Minimum 8 characters
        String hasUpperCase = "(?=.*[A-Z]).*"; // At least one uppercase letter
        String hasNumber = "(?=.*[0-9]).*"; // At least one numeric number
        String hasSpecialChar = "(?=.*[@#$%^&+=!]).*"; // At least one special character

        return password.matches(minLength) &&
                password.matches(hasUpperCase) &&
                password.matches(hasNumber) &&
                password.matches(hasSpecialChar);
    }

    // Method to validate a list of emails
    public List<Boolean> validateEmailList(List<String> emails) {
        List<Boolean> results = new ArrayList<>();
        for (String email : emails) {
            results.add(isEmailValid(email));
        }
        return results;
    }

    public static void main(String[] args) {
        Main userRegistration = new Main();

        // Test the methods
        System.out.println("First Name Validation:");
        System.out.println(userRegistration.isFirstNameValid("John")); // Should return true
        System.out.println(userRegistration.isFirstNameValid("jo"));   // Should return false

        System.out.println("Last Name Validation:");
        System.out.println(userRegistration.isLastNameValid("Doe"));  // Should return true
        System.out.println(userRegistration.isLastNameValid("do"));   // Should return false

        System.out.println("Email Validation:");
        System.out.println(userRegistration.isEmailValid("abc.xyz@bl.co.in")); // Should return true
        System.out.println(userRegistration.isEmailValid("abc@.com.my"));     // Should return false

        System.out.println("Mobile Number Validation:");
        System.out.println(userRegistration.isMobileNumberValid("91 9919819801")); // Should return true
        System.out.println(userRegistration.isMobileNumberValid("919919819801"));  // Should return false

        // Test Password
        System.out.println("Password Validation:");
        System.out.println(userRegistration.isPasswordSecure("Abc@1234")); // Should return true
        System.out.println(userRegistration.isPasswordSecure("abc1234")); // Should return false

        List<String> emailSamples = List.of(
                // Valid Emails
                "abc@yahoo.com",         // Valid
                "abc-100@yahoo.com",     // Valid
                "abc.100@yahoo.com",     // Valid
                "abc111@abc.com",        // Valid
                "abc-100@abc.net",       // Valid
                "abc.100@abc.com.au",    // Valid
                "abc@1.com",             // Valid
                "abc@gmail.com.com",     // Valid
                "abc+100@gmail.com",     // Valid

                // Invalid Emails
                "abc",                   // Invalid - Missing "@" symbol
                "abc@.com.my",           // Invalid - TLD starts with a dot
                "abc123@gmail.a",        // Invalid - TLD must have at least two characters
                "abc123@.com",           // Invalid - TLD starts with a dot
                "abc123@.com.com",       // Invalid - TLD starts with a dot
                ".abc@abc.com",          // Invalid - First character is a dot
                "abc()*@gmail.com",      // Invalid - Contains invalid characters
                "abc@%*.com",            // Invalid - TLD contains invalid characters
                "abc..2002@gmail.com",   // Invalid - Contains double dots
                "abc.@gmail.com",        // Invalid - Ends with a dot
                "abc@abc@gmail.com",     // Invalid - Contains multiple "@" symbols
                "abc@gmail.com.1a",      // Invalid - TLD with two characters contains a digit
                "abc@gmail.com.aa.au"    // Invalid - Multiple TLDs are not allowed
        );

        System.out.println("Email Samples Validation:");
        System.out.println(userRegistration.validateEmailList(emailSamples));

    }
}
