package com.company;

import java.util.ArrayList;

public class Week {
    int week;
    ArrayList<WorkHours> workHourList;

    public Week(int week, ArrayList<WorkHours> list) {
        this.week = week;
        this.workHourList = list;
    }

    public int getWeek() {
        return week;
    }

    public ArrayList<WorkHours> getWorkHourList() {
        return workHourList;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setWorkHourList(ArrayList<WorkHours> workHourList) {
        this.workHourList = workHourList;
    }
}
