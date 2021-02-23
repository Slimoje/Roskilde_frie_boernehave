package com.company;

public class Year {
    int year;
    Week[] weeks;

    public Year(int year, Week[] weekArray) {
        this.year = year;
        weeks = weekArray;
    }
    public String toString(){
        return "";
    }

    public int getYear() {
        return year;
    }

    public Week[] getWeeks() {
        return weeks;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeeks(Week[] weeks) {
        this.weeks = weeks;
    }
}
