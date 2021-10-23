package com.virtualpairprogrammers.isbntools;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ExampleTests {

    @Test
    public void checkAValidIDBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("0140449116");
        assertTrue("first value", result);
        result = validateISBN.checkISBN("0140779116");
        assertTrue("second value", result);
    }

    @Test
    public void checkAnInvalidISBN() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("0140449117");
        assertFalse(result);
    }

    @Test
    public void ISBNNumbersEndingInAnXAreValid() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitISBNsAreNotAllowed() {
        ValidateISBN validateISBN = new ValidateISBN();
        validateISBN.checkISBN("123456789");
    }

    @Test(expected = NumberFormatException.class)
    public void nonNumericISBNsAreNotAllowed() {
        ValidateISBN validateISBN = new ValidateISBN();
        validateISBN.checkISBN("helloworld");
    }
}
