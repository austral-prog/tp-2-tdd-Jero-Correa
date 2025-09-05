package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    private final RomanNumerals converter = new RomanNumerals();

    @Test void convert1() { assertEquals("I", converter.convert(1)); }
    @Test void convert5() { assertEquals("V", converter.convert(5)); }
    @Test void convert10() { assertEquals("X", converter.convert(10)); }
    @Test void convert4() { assertEquals("IV", converter.convert(4)); }
    @Test void convert9() { assertEquals("IX", converter.convert(9)); }
    @Test void convert40() { assertEquals("XL", converter.convert(40)); }
    @Test void convert50() { assertEquals("L", converter.convert(50)); }
    @Test void convert90() { assertEquals("XC", converter.convert(90)); }
    @Test void convert100() { assertEquals("C", converter.convert(100)); }
    @Test void convert400() { assertEquals("CD", converter.convert(400)); }
    @Test void convert500() { assertEquals("D", converter.convert(500)); }
    @Test void convert900() { assertEquals("CM", converter.convert(900)); }
    @Test void convert1000() { assertEquals("M", converter.convert(1000)); }
    @Test void convert1994() { assertEquals("MCMXCIV", converter.convert(1994)); }
}
