package com.company;

public class WorkHours {
    Day[] days;
    int employeeID;

    public WorkHours(Day[] list) {
        days = list;
    }

    public WorkHours(int employeeID){
        days = emptyDayArray();
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
    
    /* Method returns the sum of the length of all days in the Days-array. */
    public int totalWorkhours(){
        int total = 0;
        for(int i = 0; i < days.length; i++){
            if(days[i] != null) {
                total += days[i].lengthOfDay();
            }
        }
        return total;
    }
    
    private Day[] emptyDayArray(){
        Day[] days = {new Day(), new Day(), new Day(), new Day(), new Day()};
        return days;
    }
}
