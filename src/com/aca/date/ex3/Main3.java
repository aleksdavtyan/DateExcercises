package com.aca.date.ex3;

import com.aca.date.InputReader;

public class Main3 {
    public static void main(String[] args) {
        int year;
        InputReader input = new InputReader();
        System.out.println("Please enter a year to check: ");
        year = input.readInt();
        LeapYear leapYear = new LeapYear();
        if (leapYear.checkYearLeap(year)) {
            System.out.println("Specified year is a leap year.");
        } else {
            System.out.println("Specified year is not a leap year.");
        }
    }
}
