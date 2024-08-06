package com.example;

public class LeapYear {
    public boolean isLeap(int year){
        boolean ans;
        if(year%400==0){
            ans=true;
        }else if(year%4==0&& year%100!=0){
            ans=true;
        }else{
            ans=false;
        }
        return ans;
    }
}
