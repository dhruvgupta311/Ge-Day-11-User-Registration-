package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Test for valid First Name
    @Test
    void testValidFirstName() {
        Main userRegistration = new Main();
        try {
            assertTrue(userRegistration.isFirstNameValid("John"));
        } catch (InvalidFirstNameException e) {
            fail("Valid first name threw exception: " + e.getMessage());
        }
    }

    // Test for invalid First Name
    @Test
    void testInvalidFirstName() {
        Main userRegistration = new Main();
        InvalidFirstNameException exception = assertThrows(InvalidFirstNameException.class, () -> {
            userRegistration.isFirstNameValid("jo");
        });
        assertEquals("Invalid First Name: First name must start with a capital letter and have at least 3 characters.", exception.getMessage());
    }

    // Test for valid Last Name
    @Test
    void testValidLastName() {
        Main userRegistration = new Main();
        try {
            assertTrue(userRegistration.isLastNameValid("Doe"));
        } catch (InvalidLastNameException e) {
            fail("Valid last name threw exception: " + e.getMessage());
        }
    }

    // Test for invalid Last Name
    @Test
    void testInvalidLastName() {
        Main userRegistration = new Main();
        InvalidLastNameException exception = assertThrows(InvalidLastNameException.class, () -> {
            userRegistration.isLastNameValid("do");
        });
        assertEquals("Invalid Last Name: Last name must start with a capital letter and have at least 3 characters.", exception.getMessage());
    }

    // Test for valid Email
    @Test
    void testValidEmail() {
        Main userRegistration = new Main();
        try {
            assertTrue(userRegistration.isEmailValid("abc.xyz@bl.co.in"));
        } catch (InvalidEmailException e) {
            fail("Valid email threw exception: " + e.getMessage());
        }
    }

    // Test for invalid Email
    @Test
    void testInvalidEmail() {
        Main userRegistration = new Main();
        InvalidEmailException exception = assertThrows(InvalidEmailException.class, () -> {
            userRegistration.isEmailValid("abc@.com.my");
        });
        assertEquals("Invalid Email: Please enter a valid email in the format abc.xyz@bl.co.in.", exception.getMessage());
    }

    // Test for valid Mobile Number
    @Test
    void testValidMobileNumber() {
        Main userRegistration = new Main();
        try {
            assertTrue(userRegistration.isMobileValid("91 9919819801"));
        } catch (InvalidMobileNumberException e) {
            fail("Valid mobile number threw exception: " + e.getMessage());
        }
    }

    // Test for invalid Mobile Number
    @Test
    void testInvalidMobileNumber() {
        Main userRegistration = new Main();
        InvalidMobileNumberException exception = assertThrows(InvalidMobileNumberException.class, () -> {
            userRegistration.isMobileValid("919919819801");
        });
        assertEquals("Invalid Mobile Number: Mobile number must follow the format CountryCode followed by space and 10-digit number.", exception.getMessage());
    }

    // Test for valid Password
    @Test
    void testValidPassword() {
        Main userRegistration = new Main();
        try {
            assertTrue(userRegistration.isPasswordValid("Abc@1234"));
        } catch (InvalidPasswordException e) {
            fail("Valid password threw exception: " + e.getMessage());
        }
    }
}
