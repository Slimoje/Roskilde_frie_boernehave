package com.company;

import java.util.ArrayList;

public class WorkHours {
    Day[] days;
    int employeeID;

    public WorkHours(Day[] list) {
        days = list;
    }

    public WorkHours(int employeeID){
        days = new Day[5];
        this.employeeID = employeeID;
    }

    public WorkHours(Day[] days, int employeeID){
        this.days = days;
        this.employeeID = employeeID;
    }

    public Day[] getDays() {
        return days;
    }

    public void setDays(Day[] days) {
        this.days = days;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}