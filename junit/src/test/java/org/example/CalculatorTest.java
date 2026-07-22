package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;

    // Setup method runs before every test case.
    // It creates the Calculator object required for testing.
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }


    @Test
    void testAddition() {

        // Arrange: Prepare input values and required data.
        int a = 10;
        int b = 20;


        // Act: Execute the method that needs to be tested.
        int result = calculator.add(a, b);


        // Assert: Verify that actual output matches expected output.
        assertEquals(30, result);
    }


    @Test
    void testAnotherAddition() {

        // Arrange: Prepare another set of input values.
        int a = 5;
        int b = 15;


        // Act: Call the add method with given inputs.
        int result = calculator.add(a, b);


        // Assert: Check the result is as expected.
        assertEquals(20, result);
    }


    // Teardown method runs after every test case.
    // It clears the object after testing is completed.
    @AfterEach
    void tearDown() {
        calculator = null;
    }
}