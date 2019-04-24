package com.aca.dateexercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class GetYear {

    private int year;

    public int getYear(int age) {
        LocalDate localDate = LocalDate.now();
        this.year = localDate.minusYears(age).getYear();
        return this.year;
    }
}
