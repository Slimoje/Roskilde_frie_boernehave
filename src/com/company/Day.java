package com.company;

public class Day {

    int start;
    int end;

    public Day(){
        start = 0;
        end = 0;
    }
    public Day(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int getStart() {
        return start;
    }

    public int getEnd() { return end; }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    /* Method returns the length of the working day. */
    public int lengthOfDay(){
        return end - start;
    }
}
