package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

public class longestCommonPrefixTest {
    private longestCommonPrefix lcp;
    private static int passedTests=0;
    private static int failedTests=0;

    @BeforeEach
    public void setup(){
        lcp=new longestCommonPrefix();
    }

    @AfterAll
    public void tearDown(){
        System.out.println("PassedTests"+passedTests);
        System.out.println("Failed Tests"+failedTests);
    }
    private void runTest(String[] input, String expectedResult) {
        String result = lcp.longestCommonPrefix(input);
        if (result.equals(expectedResult)) {
            passedTests++;
            System.out.println("Test passed for input: " + String.join(", ", input) + "! Expected: \"" + expectedResult + "\", Got: \"" + result + "\"");
        } else {
            failedTests++;
            System.out.println("Test failed for input: " + String.join(", ", input) + "! Expected: \"" + expectedResult + "\", Got: \"" + result + "\"");
        }
        assertEquals(expectedResult, result);
    }

    @Test
    public void Test testLongestCommonPrefix_FlowerFlowFlight(){
        runTest(new String[]{"Flower","Flow","Flight"},"Fl");
    }
    @Test
    public void Test testLongestCommonPrefix_DogRacecarCar(){
        runTest(new String[]{"dog","racecar","car"}, "");
    }
    @Test
    public void testLongestCommonPrefix_InterspeciesInterstellerInterstate(){
        runTest(new String[]{"interspecies","interstellar","interstate"},"inter");
    }
}
