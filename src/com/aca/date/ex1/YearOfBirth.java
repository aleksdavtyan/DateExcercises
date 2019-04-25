package com.aca.date.ex1;

import java.time.LocalDate;

public class YearOfBirth {

    private int year;

    public int getYearOfBirth(int age) {
        LocalDate localDate = LocalDate.now();
        this.year = localDate.minusYears(age).getYear();
        return this.year;
    }
}
