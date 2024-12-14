package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Happy test case for First Name validation
    @Test
    public void testFirstNameValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isFirstNameValid("John")); // Should return true
    }

    // Sad test case for First Name validation
    @Test
    public void testFirstNameInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isFirstNameValid("jo"));   // Should return false
    }

    // Happy test case for Last Name validation
    @Test
    public void testLastNameValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isLastNameValid("Doe"));  // Should return true
    }

    // Sad test case for Last Name validation
    @Test
    public void testLastNameInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isLastNameValid("do"));   // Should return false
    }

    // Happy test case for Email validation
    @Test
    public void testEmailValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isEmailValid("abc.xyz@bl.co.in")); // Should return true
    }

    // Sad test case for Email validation
    @Test
    public void testEmailInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isEmailValid("abc@.com.my"));     // Should return false
    }

    // Happy test case for Mobile validation
    @Test
    public void testMobileValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isMobileNumberValid("91 9919819801")); // Should return true
    }

    // Sad test case for Mobile validation
    @Test
    public void testMobileInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isMobileNumberValid("919919819801"));  // Should return false
    }

    // Happy test case for Password validation
    @Test
    public void testPasswordValid() {
        Main userRegistration = new Main();
        assertTrue(userRegistration.isPasswordSecure("Abc@1234")); // Should return true
    }

    // Sad test case for Password validation
    @Test
    public void testPasswordInvalid() {
        Main userRegistration = new Main();
        assertFalse(userRegistration.isPasswordSecure("abc1234")); // Should return false (missing uppercase letter and special character)
    }
}
