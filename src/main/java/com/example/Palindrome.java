package com.example;

public class Palindrome {
    public boolean isPalindrome(String str){
        if(str==null)return false;
        int right=str.length()-1;
        int left=0;
        while(right>left){
            if(str.charAt(right)!=str.charAt(left)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
