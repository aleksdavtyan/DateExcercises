package com.aca.date.ex3;

public class LeapYear {

    private int year;


    public boolean checkYearLeap(int year) {
        this.year = year;
        if ((this.year % 4 == 0) && (this.year % 100 != 0) || (this.year % 400 == 0)) {
            return true;
        } else { return false; }
    }
}
