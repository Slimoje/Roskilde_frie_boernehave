package com.company;

public class Year {
    int year;
    Week[] weeks;

    public Year(int year, Week[] weekArray) {
        this.year = year;
        weeks = weekArray;
    }
    public String toString(){
        return "Year: "+year+"\n"+
                "Week: "+weeks[0].week+"\n"+
                "Employee: "+weeks[0].employees.get(0).name+"\n"+
                "Days: \n"+
                weeks[0].employees.get(0).days.get(0).day+":("+weeks[0].employees.get(0).days.get(0).start+"-"+weeks[0].employees.get(0).days.get(0).end+")";
    }
}
