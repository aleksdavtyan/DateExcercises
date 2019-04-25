package com.aca.dateexercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;

public class GetNextPreviousFriday {

    private LocalDate localDate = null;
    static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate getNextFriday(String date) {
        try {
            this.localDate = LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Please enter valid date format. This is the format: dd/MM/yyyy");
        }
        return localDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
    }

    public LocalDate getPreviousFriday(String date) {
        try {
            this.localDate = LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Please enter valid date format. This is the format: dd/MM/yyyy");
        }
        return localDate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
    }
}
