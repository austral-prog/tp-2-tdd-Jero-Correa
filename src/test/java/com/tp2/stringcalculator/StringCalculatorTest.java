package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private final StringCalculator calc = new StringCalculator();

    @Test
    void emptyStringReturnsZero() {
        assertEquals(0, calc.add(""));
    }

    @Test
    void singleNumberReturnsItself() {
        assertEquals(5, calc.add("5"));
    }

    @Test
    void twoNumbersCommaSeparated() {
        assertEquals(3, calc.add("1,2"));
    }

    @Test
    void multipleNumbersCommaSeparated() {
        assertEquals(10, calc.add("1,2,3,4"));
    }

    @Test
    void numbersSeparatedByNewline() {
        assertEquals(6, calc.add("1\n2,3"));
    }

    @Test
    void negativeNumbersThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calc.add("1,-2,3"));
    }
}
