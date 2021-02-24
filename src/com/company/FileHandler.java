package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public static void saveWorkHours(Year year, ArrayList<Employee> list)throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("Workhours.txt"));
        for(int i = 0; i < year.getWeeks().length; i++){
            Week w = year.getWeeks()[i];
            output.print("Week:"+w.week+":");
            for(int j = 0; j < w.getWorkHourList().size(); j++){
                for(int k = 0; k < list.size(); k++){
                    if(w.getWorkHourList().get(j).employeeID == list.get(k).employeeID) {
                        output.print("EmployeeID:"+list.get(k).employeeID + ":");
                        for (int l = 0; l < w.getWorkHourList().get(j).getDays().length; l++){
                            if (w.getWorkHourList().get(j).getDays()[l].getStart() != 0) {
                                output.print(w.getWorkHourList().get(j).getDays()[l].start + ":");
                            } else {
                                output.print("0:");
                            }
                            if (w.getWorkHourList().get(j).getDays()[l].getEnd() != 0) {
                                output.print(w.getWorkHourList().get(j).getDays()[l].end+":");
                            } else {
                                output.print("0:");
                            }
                        }
                    }
                }
            }
            output.println();
        }
    }
    public static void loadWorkHours(Year year)throws FileNotFoundException{
        File workHours = new File(("Workhours.txt"));
        int week = 0;
        if(workHours.exists()){
            Scanner scan = new Scanner(workHours);
            while(scan.hasNextLine()){
                ArrayList<WorkHours> workhours = new ArrayList<>();
                Scanner line = new Scanner(scan.nextLine());
                line.useDelimiter(":");
                if(line.next().equals("Week")){
                    week = line.nextInt();
                }while (line.hasNext()) {
                    if(line.next().equals("EmployeeID")) {
                        int employeeID = line.nextInt();
                        int startMonday = line.nextInt();
                        int endMonday = line.nextInt();
                        int startTuesday = line.nextInt();
                        int endTuesday = line.nextInt();
                        int startWednesday = line.nextInt();
                        int endWednesday = line.nextInt();
                        int startThursday = line.nextInt();
                        int endThursday = line.nextInt();
                        int startFriday = line.nextInt();
                        int endFriday = line.nextInt();

                        Day monday = new Day(startMonday, endMonday);
                        Day tuesday = new Day(startTuesday, endTuesday);
                        Day wednesday = new Day(startWednesday, endWednesday);
                        Day thursday = new Day(startThursday, endThursday);
                        Day friday = new Day(startFriday, endFriday);
                        Day[] days = {monday, tuesday, wednesday, thursday, friday};

                        WorkHours newWorkHours = new WorkHours(days, employeeID);
                        workhours.add(newWorkHours);
                    }
                }
                Week newWeek = new Week(week, workhours);
                year.getWeeks()[week - 1] = newWeek;
            }
        }
    }

    /* The method reads data from a .txt file, and uses it to instantiate Employee-objects. The
     * objects are stored in an ArrayList, which the method takes as a parameter. */
    public static void loadEmployees(ArrayList<Employee> employees) throws FileNotFoundException {
        Scanner load = new Scanner(new File("employees.txt"));
        load.useDelimiter(";");
        while (load.hasNextLine()) {
            String name = load.next();
            String address = load.next();
            int phoneNumber = Integer.parseInt(load.next());
            String mail = load.next();
            int CPR = Integer.parseInt(load.next());
            int employeeID = Integer.parseInt(load.next());
            boolean admin = load.nextBoolean();
            String department = load.next();
            employees.add(new Employee(name, address, phoneNumber, mail, CPR, employeeID, admin, department));
        }
    }

    /* The method takes an ArrayList of Employee-objects and saves them to a file
     * in a format that is recognisable for the corresponding load-method. */
    public static void saveEmployees(ArrayList<Employee> employees) throws FileNotFoundException {
        PrintStream save = new PrintStream("employees.txt");
        if(employees.size() > 0){
            save.print(employees.get(0).toStringFileFormat());
        }
        for(int i = 1; i < employees.size(); i++){
            save.println(";");
            save.print(employees.get(i).toStringFileFormat());
        }
    }
}
