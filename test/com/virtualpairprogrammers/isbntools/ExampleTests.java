package com.virtualpairprogrammers.isbntools;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExampleTests {

    @Test
    public void exampleTest() {
        ValidateISBN validateISBN = new ValidateISBN();
        boolean result = validateISBN.checkISBN(1140449116);
        assertTrue(result);
    }
}
