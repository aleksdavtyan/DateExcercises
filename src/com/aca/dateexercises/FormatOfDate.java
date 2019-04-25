package com.aca.dateexercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class FormatOfDate {

    private LocalDate localDate;
    private DateTimeFormatter formatter;


    public boolean validateFormat(String format) {
        switch (format) {
            case "dd/MM/yyyy":
                return true;
            case "dd/MM/YY":
                return true;
            case "dd.MM.yyyy":
                return true;
            case "dd-MMM-yyyy":
                return true;
            case "yyyy-MM-dd":
                return true;
            case "YYYYMMDD":
                return true;
            case "EEEE, MMM d yyyy":
                return true;
            default:
                System.out.println("No such format.");
                return false;
        }
    }

    public void dateDifference(String date, String format) {
        LocalDate today = LocalDate.now();
        this.formatter = DateTimeFormatter.ofPattern(format);
        try {
            this.localDate = LocalDate.parse(date, this.formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Please enter valid date in exact format.");
        }
        if (!this.localDate.equals(null)) {
            LocalDate fromTemp = LocalDate.from(this.localDate);
            long years = fromTemp.until(today, ChronoUnit.YEARS);
            fromTemp = fromTemp.plusYears(years);

            long months = fromTemp.until(today, ChronoUnit.MONTHS);
            fromTemp = fromTemp.plusMonths(months);

            long days = fromTemp.until(today, ChronoUnit.DAYS);
            System.out.printf("Difference between now and that date is %s years, %s months, %s days, " + years, months, days);
        }
    }
}
