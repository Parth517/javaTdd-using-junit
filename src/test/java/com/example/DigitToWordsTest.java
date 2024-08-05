package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitToWordsTest {
      @Test
    public void testWords() {
        assertEquals("zero", DigitToWords.toWords(0));
        assertEquals("one", DigitToWords.toWords(1));
        assertEquals("fifteen", DigitToWords.toWords(15));
        assertEquals("one hundred", DigitToWords.toWords(100));
        assertEquals("four hundred", DigitToWords.toWords(400));
        assertEquals("twenty-two", DigitToWords.toWords(22));
        assertEquals("one thousand", DigitToWords.toWords(1000));
        assertEquals("one thousand two hundred thirty-three", DigitToWords.toWords(1233));
        assertEquals("one lakhs", DigitToWords.toWords(10000));
    }
}
