package com.aca.dateexercises;

import java.time.Duration;

public class Main4 {

    public static void main(String[] args) {
        String format, enteredDate;
        InputReader input = new InputReader();
        FormatOfDate formatOfDate = new FormatOfDate();
        System.out.println("Please enter a format of date: ");
        format = input.readStr();
        if (formatOfDate.validateFormat(format)) {
            System.out.println("The format is acceptable.");
        } else {
            System.out.println("The format is not acceptable.");
        }
        System.out.println("Please enter a date in this format: ");
        enteredDate = input.readStr();
        formatOfDate.dateDifference(enteredDate, format);
    }
}
