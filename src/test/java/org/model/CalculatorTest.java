package org.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {


    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-5, calculator.add(0, -5));
        assertThrows(IllegalArgumentException.class, () -> calculator.add(Float.NaN, 2));
    }

    @Test
    void subtract() {
        assertEquals(0, calculator.subtract(10, 10));
        assertEquals(3, calculator.subtract(10, 7));
        assertEquals(-5, calculator.subtract(10, 15));
        assertEquals(0, calculator.subtract(-5, -5));
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract(Float.NaN, 2));
    }

    @Test
    void divide() {
        assertEquals(10, calculator.divide(20, 2));
        assertEquals(0, calculator.divide(0, 10));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(Float.NaN, 2));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(0, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void multiply() {
        assertEquals(0, calculator.multiply(10, 0));
        assertEquals(100, calculator.multiply(10, 10));
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(Float.NaN, 2));
    }
}