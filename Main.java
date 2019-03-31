package com.company;

public class Main {

    public static void main(String[] args) {

        int year = tryParse(args[0]);

        //calculate only for 1800 - 2800  years
        if (year <= 2800 & year >= 1800) {
            System.out.println(year);
            System.out.println(getProgrammerDay(year));
        } else {
            System.out.println("choose year from 1800 to 2800");
        }


    }


    private static String getProgrammerDay(int year) {
        if (year != 1918)
            return (isLapYear(year) ? "12.09." : "13.09.") + year;
        else
            return "25.09." + year;
    }

    private static boolean isLapYear(int year) {
        if (year < 1918)
            return year % 4 == 0; //Julian calendar
        else
            return year % 4 == 0 & (year % 100 != 0 || year % 400 == 0); //Gregorian
    }

    private static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }

    }

}
