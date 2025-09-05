package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void yearDivisibleBy4IsLeapYear() {
        assertTrue(new LeapYear().isLeapYear(2004));
    }

    @Test
    void yearNotDivisibleBy4IsNotLeapYear() {
        assertFalse(new LeapYear().isLeapYear(2001));
    }

    @Test
    void yearDivisibleBy100IsNotLeapYear() {
        assertFalse(new LeapYear().isLeapYear(1900));
    }

    @Test
    void yearDivisibleBy400IsLeapYear() {
        assertTrue(new LeapYear().isLeapYear(2000));
    }
}
