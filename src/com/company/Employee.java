package com.company;

public class Employee extends Person{
    int ssn;
    int employeeID;
    boolean isManager;
    String department;

    public Employee(String name, String address, int phoneNumber, String email,
                    int ssn, int employeeID, boolean isManager, String department){
        super(name, address, phoneNumber, email);
        this.ssn = ssn;
        this.employeeID = employeeID;
        this.isManager = isManager;
        this.department = department;
    }

    public int getSsn() {
        return ssn;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public boolean isManager() {
        return isManager;
    }

    public String getDepartment() {
        return department;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return "";
    }
}
