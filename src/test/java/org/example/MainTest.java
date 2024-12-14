package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Parameterized test for Email validation (True cases)
    @ParameterizedTest
    @CsvSource({
            "abc.xyz@bl.co.in, true",   // Valid email
            "abc-100@yahoo.com, true",  // Valid email
            "abc.100@yahoo.com, true",  // Valid email
            "abc111@abc.com, true",     // Valid email
            "abc@1.com, true",          // Valid email
            "abc@gmail.com.com, true",  // Valid email
            "abc+100@gmail.com, true"   // Valid email
    })
    void testValidEmailValidation(String email, boolean expectedResult) {
        Main userRegistration = new Main();
        assertEquals(expectedResult, userRegistration.isEmailValid(email));
    }

    // Parameterized test for Email validation (False cases)
    @ParameterizedTest
    @CsvSource({
            "abc, false",                    // Invalid email - Missing '@'
            "abc@.com.my, false",            // Invalid email - TLD starts with a dot
            "abc123@gmail.a, false",         // Invalid email - TLD with one character
            "abc123@.com, false",            // Invalid email - TLD starts with a dot
            "abc@%*.com, false",             // Invalid email - TLD contains invalid characters
            "abc..2002@gmail.com, false",    // Invalid email - Contains double dots
            "abc@abc@gmail.com, false",      // Invalid email - Multiple '@' symbols
            "abc@gmail.com.1a, false",      // Invalid email - TLD with a digit
            "abc@gmail.com.aa.au, false"     // Invalid email - Multiple TLDs
    })
    void testInvalidEmailValidation(String email, boolean expectedResult) {
        Main userRegistration = new Main();
        assertEquals(expectedResult, userRegistration.isEmailValid(email));
    }
}
