package com.company;

public class Day {
    String weekDay;
    String date;
    int start;
    int end;

    public Day(String day, String date, int start, int end) {
        this.weekDay = day;
        this.date = date;
        this.start = start;
        this.end = end;
    }

    public Day(int start, int end){
        weekDay = "";
        date = "";
        this.start = start;
        this.end = end;
    }

    public String getDate() {
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
