package com.aca.dateexercises;


import java.text.ParseException;

public class Main1 {

    public static void main(String[] args) throws ParseException {
        int age;
        InputReader input = new InputReader();
        YearOfBirth userBirthYear = new YearOfBirth();
        System.out.println("Please enter your age: ");
        age = input.readInt();
        System.out.println("Your birth year is " + userBirthYear.getYearOfBirth(age));
    }
}
