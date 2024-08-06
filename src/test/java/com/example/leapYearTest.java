package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class leapYearTest {
    leapYear helper=new leapYear();

    @Test
    public void testLeapYear(){
        assertEquals(true,helper.isLeap(2016));
        assertEquals(false,helper.isLeap(1900));
        assertEquals(true,helper.isLeap(4000));
        assertEquals(true,helper.isLeap(2004));
    }
}
