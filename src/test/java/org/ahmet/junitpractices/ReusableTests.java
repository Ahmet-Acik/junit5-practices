package org.ahmet.junitpractices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Interface for reusable test logic
interface ReusableTests {

    // Abstract method: must be implemented by subclasses
    boolean isValid(String input);

    // Default method: provides reusable logging functionality
    @Test
    default void logTest() {
        System.out.println("Running a reusable log test");
        assertTrue(true, "Log test passed");
    }

    // Static method: provides a utility for input validation
    static boolean validateInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
}

// Test class for validating user input
class UserValidationTest implements ReusableTests {

    @Override
    public boolean isValid(String input) {
        return input.matches("[a-zA-Z]+"); // Only allows alphabetic input
    }

    @Test
    void testUserValidation() {
        String input = "JohnDoe";
        assertTrue(isValid(input), "Input should be valid");
        assertTrue(ReusableTests.validateInput(input), "Input should not be null or empty");
    }
}

// Test class for validating order input
class OrderValidationTest implements ReusableTests {

    @Override
    public boolean isValid(String input) {
        return input.matches("\\d+"); // Only allows numeric input
    }

    @Test
    void testOrderValidation() {
        String input = "12345";
        assertTrue(isValid(input), "Input should be valid");
        assertTrue(ReusableTests.validateInput(input), "Input should not be null or empty");
    }
}