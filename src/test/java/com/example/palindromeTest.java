package com.example;

import org.junit.Test;

public class palindromeTest {
    Palindrome helper=new Palindrome();
    @Test
    publi void testPalindrome(){
        assetEquals("abcba",helper.isPalindrome(true));
        assetEquals("abcdba",helper.isPalindrome(false));
        assetEquals("wow",helper.isPalindrome(true));
        assetEquals("abcdcba",helper.isPalindrome(true));
    }
}
