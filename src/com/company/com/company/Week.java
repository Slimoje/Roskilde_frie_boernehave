package com.company;

import java.util.ArrayList;

public class Week {
    int week;
    ArrayList<Employee> employees;

    public Week(int week, ArrayList<Employee> list) {
        this.week = week;
        employees = list;
    }

    public int getWeek() {
        return week;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
