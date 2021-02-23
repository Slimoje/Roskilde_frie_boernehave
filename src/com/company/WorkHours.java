package com.company;

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
    
    public int totalWorkhours(){
        int total = 0;
        for(int i = 0; i < days.length; i++){
            if(days[i] != null) {
                total += days[i].end - days[i].start;
            }
        }
        return total;
    }
}
