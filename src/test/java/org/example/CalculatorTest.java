package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest
{
        private final Calculator calculator = new Calculator();

        @Test
        void testAddition() {
            assertEquals(5, calculator.add(2, 3));
            assertEquals(-1, calculator.add(-2, 1));
            assertEquals(0, calculator.add(0, 0));
        }

        @Test
        void testSubtraction() {
            assertEquals(-1, calculator.subtract(2, 3));
            assertEquals(-3, calculator.subtract(-2, 1));
            assertEquals(0, calculator.subtract(0, 0));
        }

        @Test
        void testMultiplication() {
            assertEquals(6, calculator.multiply(2, 3));
            assertEquals(-2, calculator.multiply(-2, 1));
            assertEquals(0, calculator.multiply(0, 5));
        }

        @Test
        void testDivision() {
            assertEquals(2.0, calculator.divide(6, 3), 0.001);
            assertEquals(-2.0, calculator.divide(-6, 3), 0.001);

            ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
            assertEquals("Cannot divide by zero", exception.getMessage());
        }


}
