package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException{
        
        /* The following two lines instantiates a new ArrayList of Employees,
         * and populates it with five hardcoded Employee-objects. */
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        addHardcodedEmployees(employees);



        /*createEmployee(scan, employees);

        System.out.println(employees);*/

        Year year = new Year(2021);
        loadWorkHours(year);

        System.out.println(year);

        editSchedule(scan, year, employees);

        System.out.println(year.getWeeks()[51]);
        //addHardcodedWeekToYear(year, employees);

        //saveWorkHours(year, employees);
        
        /*HashMap<String, String> loginInfo = new HashMap<>();
        HashMap<String, String> adminLoginInfo = new HashMap<>();
        Scanner console = new Scanner(System.in);
        loginInfo.put("pungrotten69", "xd");
        adminLoginInfo.put("admin", "admin");
        //MÅSKE SPØRGE OM DU ER ADMIN ELLER PERSONALE, OGSÅ KAN MAN VÆLGE 1 ELLER 2 SOM ENTER TO FORSKELLIGE HASHMAPS?


        int answer = 1;
        System.out.println("Tryk 1 for admin login");
        System.out.println("Tryk 2 for personale login");
        System.out.println("Tryk 0 for at exitte denne menu");
        while(answer != 0){
            answer = console.nextInt();

            switch(answer) {
//Her tager programmet adminLoginInfo hashmappet, som bliver brugt til vores admin. Hvis man kommer igennem de to forskellige, vil man komme videre til den næste metode
//som nok bliver en menu, hvor man kan access og ÆNDRER en vagtplan.
                case 1:
                    System.out.println("Skriv dit brugernavn:");
                    String username = console.next();
                    if (adminLoginInfo.containsKey(username)) {
                        System.out.println("Skriv dit adgangsord:");
                        String password = console.next();
                        if (adminLoginInfo.containsValue(password)) {
                            System.out.println("Login var en succes!");
                            adminMenu(console);
                        }
                    }
                break;
//Her tager programmet loginInfo hashmappet, som bliver brugt til vores Staff. Hvis man kommer igennem de to forskellige, vil man komme videre til den næste metode
//som nok bliver en menu, hvor man kan access en vagtplan.
                case 2:
                    System.out.println("Skriv dit brugernavn:");
                    String staffUsername = console.next();
                    if (loginInfo.containsKey(staffUsername)) {
                        System.out.println("Skriv dit adgangsord:");
                        String staffPassword = console.next();
                        if (loginInfo.containsValue(staffPassword)) {
                            System.out.println("Login var en succes!");
                            staffMenu(console);
                        }
                    }
                break;

                default:
                    //System.out.println("Forkert input, prøv igen!");
                break;
            }
        }*/
    }



    //DENNE MENU KAN KUN BLIVE ACCESSED VIA ADMIN LOGIN
    public static void adminMenu(Scanner console){

        int answer = 1;
        System.out.println("Tryk 1 for at vise en liste over børn");
        System.out.println("Tryk 2 for at vise vagtplanen");
        System.out.println("Tryk 3 for at redigere vagtplanen");
        System.out.println("Tryk 4 for at vise telefonlisten");
        System.out.println("Tryk 5 for at vise listen over ansatte");
        System.out.println("Tryk 0 for at exitte menuen");

        while (answer != 0){
            answer = console.nextInt();

            switch (answer){
                case 1:
                    System.out.println("Sike, thats the wrong NUMBER");
                    break;

                case 2:
                    System.out.println("Du har valgt at vise vagtplanen");
                    //METODE FOR AT VISE VAGTPLANEN
                    break;

                case 3:
                    System.out.println("Du har valgt at lave vagtplanen");
                    //METODE FOR AT ÆNDRER I VAGTPLANEN
                    break;

                case 4:
                    System.out.println("Sike, thats the wrong NUMBER");
                    break;

                case 5:
                    System.out.println("Sike, thats the wrong NUMBER");
                    break;
                default:
                    //System.out.println("Forkert input");
                    break;
            }
        }
    }
    //DENNE MENU KAN KUN BLIVE ACCESED VIA STAFFLOGIN
    public static void staffMenu(Scanner console){

        int answer = 1;
        System.out.println("Tryk 1 for at vise en liste over børn");
        System.out.println("Tryk 2 for at vise vagtplanen");
        System.out.println("Tryk 3 for at vise telefonlisten");
        System.out.println("Tryk 0 for at exitte menuen");

        while (answer != 0){
            answer = console.nextInt();

            switch (answer){
                case 1:
                    System.out.println("Sike, thats the wrong NUMBER");
                    break;

                case 2:
                    System.out.println("Du har valgt at vise vagtplanen");
                    //METODE FOR AT VISE VAGTPLANEN
                    break;

                case 3:
                    System.out.println("Sike, thats the wrong NUMBER");
                    break;

                default:
                    //System.out.println("Forkert input");
                    break;
            }
        }
    }
    
    /* The method takes an ArrayList of Employees and adds five hardcoded Employee objects to it. */
    public static void addHardcodedEmployees(ArrayList<Employee> employees){
        Employee e1 = new Employee("Sandra Madsen", "Bogkjærvej 17", 61235234, "mail@111.dk",
                543415, 1001, true, "Administrationen");
        Employee e2 = new Employee("Josefine Clausen", "Engehøjgårdsvej 39", 67234789, "mail@222.dk",
                424751, 1002, false, "Rød stue");
        Employee e3 = new Employee("Peter Ellehammer", "Konrad Ankersgade 11, 1. th", 34128312, "mail@333.dk",
                435413, 1003, false, "Blåbærsstuen");
        Employee e4 = new Employee("Karla Emma Simonsen", "Brombærstrædet 9", 53357141, "mail@333.dk",
                123443, 1004, false, "Blåbærstuen");
        Employee e5 = new Employee("Johanne Marie Smith Nørgaard", "Højøvej 1", 43212389, "mail@555.dk",
                345142, 1005, false, "Rød stue");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
    }
    public static void addHardcodedWeekToYear(Year year, ArrayList<Employee> employees){
        for(int i = 0; i < year.getWeeks().length; i++) {
            Day d01 = new Day(8, 16);
            Day d02 = new Day(9, 16);
            Day d03 = new Day(8, 16);
            Day d04 = new Day(9, 15);
            Day d05 = new Day(8, 16);
            Day[] days0 = {d01, d02, d03, d04, d05};
            WorkHours wh1 = new WorkHours(days0, employees.get(0).getEmployeeID());

            Day d11 = new Day(10, 18);
            Day d12 = new Day(10, 18);
            Day d13 = new Day(9, 18);
            Day d14 = new Day(12, 18);
            Day d15 = new Day(11, 18);
            Day[] days1 = {d11, d12, d13, d14, d15};
            WorkHours wh2 = new WorkHours(days1, employees.get(1).getEmployeeID());

            Day d21 = new Day(6, 14);
            Day d22 = new Day(6, 15);
            Day d23 = new Day(7, 16);
            Day d24 = new Day(6, 13);
            Day d25 = new Day(6, 15);
            Day[] days2 = {d21, d22, d23, d24, d25};
            WorkHours wh3 = new WorkHours(days2, employees.get(2).getEmployeeID());

            Day d31 = new Day(9, 17);
            Day d32 = new Day(7, 15);
            Day d33 = new Day(6, 15);
            Day d34 = new Day(8, 15);
            Day d35 = new Day(6, 12);
            Day[] days3 = {d31, d32, d33, d34, d35};
            WorkHours wh4 = new WorkHours(days3, employees.get(3).getEmployeeID());

            Day d41 = new Day(7, 15);
            Day d42 = new Day(8, 15);
            Day d43 = new Day(7, 15);
            Day d44 = new Day(8, 14);
            Day d45 = new Day(7, 15);
            Day[] days4 = {d41, d42, d43, d44, d45};
            WorkHours wh5 = new WorkHours(days4, employees.get(4).getEmployeeID());

            ArrayList<WorkHours> workHours = new ArrayList<>();
            workHours.add(wh1);
            workHours.add(wh2);
            workHours.add(wh3);
            workHours.add(wh4);
            workHours.add(wh5);

            Week w = new Week(i + 1, workHours);

            year.getWeeks()[i] = w;
        }
    }
    public static void createEmployee(Scanner scan, ArrayList<Employee> list){
        System.out.println("Indtast navn: ");
        String name = scan.nextLine();
        System.out.println("Indtast adresse: ");
        String address = scan.nextLine();
        System.out.println("Indtast telefon nummer: ");
        int phoneNumber = scan.nextInt();
        System.out.println("Indtast email: ");
        String email = scan.next();
        System.out.println("Indtast ssn: ");
        int ssn = scan.nextInt();
        int memberID = 0;
        for(int i = 0; i < list.size(); i++){
            memberID = list.get(i).employeeID;
            memberID++;
        }
        System.out.println("Skal den nye medarbejder have manager rettigheder? Indtast Ja/Nej: ");
        String choice = scan.next();
        boolean isManager;
        if(choice.equalsIgnoreCase("ja")){
            isManager = true;
        }else{
            isManager = false;
        }
        System.out.println("Indtast afdeling: ");
        String department = scan.next();
        Employee newEmployee = new Employee(name, address, phoneNumber, email, ssn, memberID, isManager, department);
        list.add(newEmployee);
    }
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
    public static void editSchedule(Scanner scan, Year year, ArrayList<Employee> list){
        System.out.println("Indtast nummer for den uge du vil redigere:");
        int weekNumber = scan.nextInt();
        for(int i=0;i<list.size();i++){
            System.out.println("Medarbejdernummer: "+list.get(i).employeeID+" - "+list.get(i).name+".");
        }
        System.out.println("Indtast medarbejder nummer for den medarbejder, hvis tider du vil redigere:");
        int empID = scan.nextInt();
        boolean foundID = false;
        for(int i=0;i<year.getWeeks()[weekNumber-1].workHourList.size();i++){
            if(empID == year.getWeeks()[weekNumber-1].workHourList.get(i).employeeID){
                foundID = true;
                for(int j=0;j<year.getWeeks()[weekNumber-1].workHourList.get(i).getDays().length;j++){
                    switch(j){
                        case 0:
                            System.out.println("Mandag: "+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getStart()+"-"+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 1:
                            System.out.println("Tirsdag: "+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getStart()+"-"+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 2:
                            System.out.println("Onsdag: "+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getStart()+"-"+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 3:
                            System.out.println("Torsdag: "+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getStart()+"-"+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 4:
                            System.out.println("Fredag: "+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getStart()+"-"+year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        default:
                            break;
                    }
                }
                System.out.println("Indtast hvilken dag du vil redigere: ");
                String ugeDag = scan.next();
                switch(ugeDag.toUpperCase()){
                    case "MANDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        int newStart = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[0].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        int newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[0].setEnd(newEnd);
                        break;
                    case "TIRSDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[1].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[1].setEnd(newEnd);
                        break;
                    case "ONSDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[2].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[2].setEnd(newEnd);
                        break;
                    case "TORSDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[3].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[3].setEnd(newEnd);
                        break;
                    case "FREDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[4].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber-1].workHourList.get(i).getDays()[4].setEnd(newEnd);
                        break;
                }
                System.out.println("Vagten er opdateret.");
            }
        }
        if(!foundID){
            System.out.println("Der er ingen medarbejder med dette medarbejdernummer i vagtplanen.");
        }

    }

}

//DØD KODE:: KUNNE IKKE FÅ USERNAME/PASSWORD TIL AT TJEKKE OM DET VAR ADMIN ELLER STAFF.
/*
        if (loginInfo.containsKey(username.contains("admin"))){
            System.out.println("Please enter password");
            String password = console.next();

            if (loginInfo.containsValue(password.contains("admin"))) {
                System.out.println("Login succesful");
                System.out.println("HER ER DER EN METODE HVOR ADMIN ENTER EN ADMIN MENU");
            }
        }

        /*if (loginInfo.containsKey(username)){
            System.out.println("Please enter password");
            String password = console.next();

            if (loginInfo.containsValue(password)){
                System.out.println("login succesful");
                System.out.println("HER ER DER EN METODE HVOR PERSONALET ENTER EN PERSONALE MENU");
            }
        }*/