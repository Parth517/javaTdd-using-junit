package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class palindromeTest {
    Palindrome helper=new Palindrome();
    @Test
    public void testPalindrome() {
        assertEquals(true, helper.isPalindrome("abcba"));
        assertEquals(false, helper.isPalindrome("abcdba"));
        assertEquals(true, helper.isPalindrome("wow"));
        assertEquals(true, helper.isPalindrome("abcdcba"));
    }
}
