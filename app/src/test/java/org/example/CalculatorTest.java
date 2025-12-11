package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator c = new Calculator();
        assertEquals(7.8, c.add(5.5, 2.3), 0.0001, "5.5 + 2.3 should equal 7.8");
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5.5, calc.subtract(10.0, 4.5), 0.0001, "10.0 - 4.5 should equal 5.5");
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(42.0, calc.multiply(6.0, 7.0), 0.0001, "6.0 * 7.0 should equal 42.0");
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(4.0, calc.divide(20.0, 5.0), 0.0001, "20.0 / 5.0 should equal 4.0");
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception e = assertThrows(IllegalArgumentException.class, () -> calc.divide(9, 0));

        assertEquals("Cannot divide by zero", e.getMessage());
    }

    @Test
    void testSquare() {
        Calculator calc = new Calculator();
        assertEquals(81.0, calc.square(9), 0.0001, "9 squared should equal 81");
    }

    @Test
    void testCube() {
        Calculator calc = new Calculator();
        assertEquals(27, calc.cube(3), 0.0001, "3 cubed should equal 27");
    }

}