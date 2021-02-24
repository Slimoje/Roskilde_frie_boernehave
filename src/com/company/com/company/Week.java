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
    public String toString(){
        String result = week+":\n";
        for(int i=0;i<workHourList.size();i++){
            result += workHourList.get(i).employeeID+":\n";
            for(int j=0;j<workHourList.get(i).getDays().length;j++){
                result += workHourList.get(i).getDays()[j].getStart()+"-"+workHourList.get(i).getDays()[j].getEnd()+"\n";
            }
        }
        return result;
    }
}