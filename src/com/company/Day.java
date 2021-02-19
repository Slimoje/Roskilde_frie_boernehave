package com.company;

public class Day {
    String weekDay;
    int date;
    int start;
    int end;

    public Day(String day, int date, int start, int end) {
        this.weekDay = day;
        this.date = date;
        this.start = start;
        this.end = end;
    }

    public int getDate() {
        return date;
    }

    public String getDay() {
        return weekDay;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }


    
}
