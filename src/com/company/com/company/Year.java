package com.company;

public class Year {
    int year;
    Week[] weeks;

    public Year(int year, Week[] weekArray) {
        this.year = year;
        weeks = weekArray;
    }

    public Year(int year){
        this.year = year;
        weeks = new Week[52];
    }

    public Year(){
        year = 0;
        weeks = null;
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

    public String toString(){
        String result = "";
        for(int i = 0; i<weeks.length;i++){
            result += weeks[i].week+"\n";
            for(int j = 0; j<weeks[i].getWorkHourList().size();j++){
                result += weeks[i].getWorkHourList().get(j).getEmployeeID()+"\n";
                for(int k = 0; k<weeks[i].getWorkHourList().get(j).getDays().length;k++){
                    result += weeks[i].getWorkHourList().get(j).getDays()[k].getStart()+"-"+weeks[i].getWorkHourList().get(j).getDays()[k].getEnd()+"\n";
                }
            }
        }
        return result;
    }
}