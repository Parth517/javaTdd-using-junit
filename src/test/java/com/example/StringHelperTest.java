package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringHelperTest {
    StringHelper help = new StringHelper();

    @Test
    public void testStringHavingAInFirstCharOnly() {
        assertEquals("BCD", help.removeAInFirst2Chars("ABCD"));
    }

    @Test
    public void testStringNoAInFirst2Chars() {
        assertEquals("BBAA",help.removeAInFirst2Chars("BBAA"));
    }

    @Test
    public void testStringNoAInFirst2CharsAnd4Char(){
        assertEquals("BBA",help.removeAInFirst2Chars("ABBA"));
    }
    @Test
    public void testStringOnly1Char(){
        assertEquals("B",help.removeAInFirst2Chars("B"));
    }
    @Test
    public void testStringWithEmptyString(){
        assertEquals("",help.removeAInFirst2Chars(""));
    }
}
