package com.aca.dateexercises;

public class Main2 {
    public static void main(String[] args) {
        String date;
        InputReader input = new InputReader();
        System.out.println("Please enter a date: ");
        date = input.readStr();
        GetNextPreviousFriday nextPreviousFriday = new GetNextPreviousFriday();
        System.out.println("Next Friday is: " + nextPreviousFriday.getNextFriday(date));
        System.out.println("Previous Friday is: " + nextPreviousFriday.getPreviousFriday(date));
    }
}
