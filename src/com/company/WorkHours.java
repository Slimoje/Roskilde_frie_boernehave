package com.company;

import java.util.ArrayList;

public class WorkHours {
    ArrayList<Day> days;

    public WorkHours(ArrayList<Day> list) {
        days = list;
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }


}
