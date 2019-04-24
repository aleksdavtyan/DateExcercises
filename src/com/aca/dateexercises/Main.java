package com.aca.dateexercises;


import java.text.ParseException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws ParseException {
        int age;
        String date;
        GetYear userBirthYear = new GetYear();
        InputReader input = new InputReader();
        System.out.println("Please enter your age: ");
        age = input.readInt();
        System.out.println("Your birth year is " + userBirthYear.getYear(age));

        System.out.println("Please enter a date: ");
        date = input.readStr();
        GetNextFriday nextFriday = new GetNextFriday();
        System.out.println("Next Friday is: " + nextFriday.getNextFriday(date));
        System.out.println("Previous Friday is: " + nextFriday.getPreviousFriday(date));
    }
}
