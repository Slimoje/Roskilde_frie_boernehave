package com.company;

import java.util.ArrayList;

public class WorkHours {
    int weekNumber;
    ArrayList<Day> days;

    public WorkHours(int weekNumber, ArrayList<Day> days) {
        this.weekNumber = weekNumber;
        this.days = days;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "WorkHours{" +
                "weekNumber=" + weekNumber +
                ", days=" + days +
                '}';
    }
}