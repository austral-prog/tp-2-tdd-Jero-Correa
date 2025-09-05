package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void shortPasswordIsInvalid() {
        assertFalse(validator.isValid("Ab1!"));
    }

    @Test
    void passwordWithoutUppercaseIsInvalid() {
        assertFalse(validator.isValid("abcdefg1!"));
    }

    @Test
    void passwordWithoutLowercaseIsInvalid() {
        assertFalse(validator.isValid("ABCDEFG1!"));
    }

    @Test
    void passwordWithoutNumberIsInvalid() {
        assertFalse(validator.isValid("Abcdefgh!"));
    }

    @Test
    void passwordWithoutSpecialCharIsInvalid() {
        assertFalse(validator.isValid("Abcdefg1"));
    }

    @Test
    void validPasswordPasses() {
        assertTrue(validator.isValid("Abcdefg1!"));
    }
}

