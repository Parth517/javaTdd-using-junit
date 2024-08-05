package com.example;

public class DigitToWords {
    public static String toWords(int num) {
        String ans = "";
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num < 20) {
            ans = units[num];
        } else if (num < 100) {
            ans = tens[num / 10] + (num % 10 != 0 ? "-" + units[num % 10] : "");
        } else if (num < 1000) {
            ans = units[num / 100] + " hundred" + (num % 100 == 0 ? "" : " " + toWords(num % 100));
        } else if (num < 100000) {
            ans = toWords(num / 1000) + " thousand" + (num % 1000 == 0 ? "" : " " + toWords(num % 1000));
        } else if (num < 10000000) {
            ans = toWords(num / 100000) + " lakhs" + (num % 100000 == 0 ? "" : " " + toWords(num % 100000));
        }

        return ans;
    }
}