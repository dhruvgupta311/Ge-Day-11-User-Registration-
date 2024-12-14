package org.example;

import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // List of email samples (both valid and invalid)
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

        // Regular Expression for valid email validation
        String emailPattern = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        // Check each email sample
        for (String email : emailSamples) {
            if (Pattern.matches(emailPattern, email)) {
                System.out.println("Valid email: " + email);
            } else {
                System.out.println("Invalid email: " + email);
            }
        }
    }
}
