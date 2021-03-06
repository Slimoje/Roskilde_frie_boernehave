package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        /* The following two lines instantiates a new ArrayList of Employees,
        * and populates it by loading information of employees from a file. */
        ArrayList<Employee> employees = new ArrayList<>();
        FileHandler.loadEmployees(employees);
        //addHardcodedEmployees(employees);

        /* The following two lines instatniates the Year 2021 and then loads the
        * information with all the working hours from a file. */
        Year year = new Year(2021);
        FileHandler.loadWorkHours(year);
        //addHardcodedWeekToYear(year, employees);

        Scanner console = new Scanner(System.in);
        loginMenu(employees, year, console);

        /* The following two lines saves the information in the Employees-
        * ArrayList and the Year-object to files. */
        FileHandler.saveEmployees(employees);
        FileHandler.saveWorkHours(year, employees);
    }

    /* The method contains the login menu. So for it creates a single common user and
    * a single administrator. It then asks the user to log in as on of the two types, and
    * proceeds to the corresponing menus. */
    public static void loginMenu(ArrayList<Employee> employees, Year year, Scanner console){
        HashMap<String, String> loginInfo = new HashMap<>();
        HashMap<String, String> adminLoginInfo = new HashMap<>();
        loginInfo.put("pungrotten69", "xd");
        adminLoginInfo.put("admin", "admin");
        //MÅSKE SPØRGE OM DU ER ADMIN ELLER PERSONALE, OGSÅ KAN MAN VÆLGE 1 ELLER 2 SOM ENTER TO FORSKELLIGE HASHMAPS?


        int answer = 1;

        while (answer != 0) {
            System.out.println("Tryk 1 for admin login");
            System.out.println("Tryk 2 for personale login");
            System.out.println("Tryk 0 for at exitte denne menu");
            answer = console.nextInt();

            switch (answer) {
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
                            adminMenu(console, employees, year);
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
                case 0:
                    break;
                default:
                    System.out.println("Forkert input, prøv igen!");
                    break;
            }
        }
    }

    /* The method is the menu for administrators, and the focus for this project.
    * It gives the user the possibility to view information and to edit it.*/
    public static void adminMenu(Scanner console, ArrayList<Employee> employees, Year year) {
        int answer = 1;
        while (answer != 0) {
            System.out.println("----------======Hovedmenu======----------");
            System.out.println("Tryk 1 for at vise en liste over børn");
            System.out.println("Tryk 2 for vagtplan");
            System.out.println("Tryk 3 for at vise telefonlisten");
            System.out.println("Tryk 4 for medarbejdere");
            System.out.println("Tryk 0 for at exitte menuen");
            answer = console.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Sike, thats the wrong NUMBER");
                    break;
                case 2:
                    scheduleMenu(console, employees, year);
                    break;
                case 3:
                    System.out.println("Sike, thats the wrong NUMBER");
                    break;
                case 4:
                    boolean keepGoing = true;
                    while(keepGoing){
                        System.out.println("Tryk 1 for at vise medarbejdere");
                        System.out.println("Tryk 2 for at oprette en ny medarbejder");
                        System.out.println("Tryk 3 for at redigere en medarbejder");
                        System.out.println("Tryk 4 for at slette en medarbejder");
                        System.out.println("Tryk 0 for at returnere til hovedmenu");
                        int valg = console.nextInt();
                        switch(valg){
                            case 1:
                                for(int i=0;i<employees.size();i++){
                                    System.out.println("Medarbejdernummer: "+employees.get(i).employeeID+" - "+employees.get(i).name+".");
                                }
                                System.out.println("Indtast medarbejdernummer for den medarbejder du vil se informationerne på: ");
                                int empID = console.nextInt();
                                for(int i=0;i<employees.size();i++){
                                    if(empID==employees.get(i).employeeID){
                                        System.out.println(employees.get(i));
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                createEmployee(employees, year);
                                System.out.println("Medarbejderen er oprettet.");
                                break;
                            case 3:
                                System.out.println("Denne funktion forventes færdiggjort kort efter første indbetaling.");
                                break;
                            case 4:
                                for(int i=0;i<employees.size();i++){
                                    System.out.println("Medarbejdernummer: "+employees.get(i).employeeID+" - "+employees.get(i).name+".");
                                }
                                System.out.println("Indtast medarbejdernummer for den medarbejder du vil slette.");
                                empID = console.nextInt();
                                boolean foundEmpID = false;
                                for(int i=0;i<employees.size();i++){
                                    if(empID==employees.get(i).employeeID){
                                        System.out.println(employees.get(i).name+" er slettet.");
                                        employees.remove(i);
                                        foundEmpID = true;
                                        break;
                                    }
                                }
                                if(!foundEmpID){
                                    System.out.println("Der er ingen medarbejder med dette medarbejdernummer.");
                                }
                                break;
                            case 0:
                                System.out.println("Returnerer til hovedmenu.");
                                keepGoing = false;
                                break;
                            default:
                                System.out.println("Dette er ikke en mulighed.");
                                break;
                        }
                    }
                case 0:
                    break;
                default:
                    System.out.println("Forkert input.");
                    break;
            }
        }
    }

    /* The method is the menu for the normal staff. It should give the user the
    * possibility to view information without editing it. */
    public static void staffMenu(Scanner console) {
        int answer = 1;
        while (answer != 0) {
            System.out.println("----------======Hovedmenu======----------");
            System.out.println("Tryk 1 for at vise en liste over børn");
            System.out.println("Tryk 2 for at vise vagtplanen");
            System.out.println("Tryk 3 for at vise telefonlisten");
            System.out.println("Tryk 0 for at exitte menuen");
            answer = console.nextInt();
            switch (answer) {
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
                case 0:
                    break;
                default:
                    System.out.println("Forkert input");
                    break;
            }
        }
    }

    /* The method should contain a menu for how to handle the schedule. This will be implementet
    * in future iterations. So far it asks the user for what week they want to view, and returns
    * the corresponding Week-object. It then calls the method to view and edit working hours for
    * that week. */
    public static void scheduleMenu(Scanner console, ArrayList<Employee> employees, Year year){
        System.out.print("Indtast uge: ");
        Week week = inputIntToReturnWeek(console, year);
        viewAndEditSchedule(console, employees, year, week);
    }

    /* The method prints a working schedule for one week in the console. It then provides the user
    * with a menu for editing working hours for employees for that week, and for navigating
    * to different weeks. */
    public static void viewAndEditSchedule(Scanner console, ArrayList<Employee> employees, Year year, Week week){
        System.out.println("\n");
        printSchedule(employees, week);
        System.out.println();
        int answer = -1;
        System.out.println("Tryk 1 for at redigere vagtplan");
        System.out.println("Tryk 2 for at gå til foregående uge");
        System.out.println("Tryk 3 for at gå til næste uge");
        System.out.println("Tryk 4 for at søge blandt uger");
        System.out.println("Tryk 0 for at exitte menuen");

        while (0 > answer || answer > 4) {
            System.out.print("Indtast valg: ");
            answer = console.nextInt();

            switch (answer) {
                case 1:
                    editSchedule(console, week.getWeek(), year, employees);
                    viewAndEditSchedule(console, employees, year, week);
                    break;

                case 2:
                    Week prevWeek = year.getWeeks()[week.getWeek()-2];
                    viewAndEditSchedule(console, employees, year, prevWeek);
                    answer = 0;
                    break;

                case 3:
                    Week nextWeek = year.getWeeks()[week.getWeek()];
                    viewAndEditSchedule(console, employees, year, nextWeek);
                    answer = 0;
                    break;

                case 4:
                    System.out.print("Indtast uge: ");
                    Week newWeek = inputIntToReturnWeek(console, year);
                    viewAndEditSchedule(console, employees, year, newWeek);
                    answer = 0;
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Forkert input");
                    break;
            }
        }

    }

    /* The method requires the user to input a number and returns the corresponding
    * Week-object.  */
    public static Week inputIntToReturnWeek(Scanner console, Year year){
        int weekNumber = console.nextInt();
        Week week = year.getWeeks()[weekNumber-1];
        return week;
    }

    /* The method takes the ArrayList of employees and the week of choice. It then prints
     * the working schedule for that week. This is the method that should be called in order
     * to print the schedule. */
    public static void printSchedule(ArrayList<Employee> employees, Week week) {
        System.out.println("                                           uge " + week.getWeek());
        System.out.println("medarbejdere\\ugedage|   mandag  |  tirsdag  |  onsdag   |  torsdag  |  fredag   |  timetal  ");
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            WorkHours wh;
            for (int j = 0; j < week.getWorkHourList().size(); j++) {
                WorkHours whTemp = week.getWorkHourList().get(j);
                if (emp.getEmployeeID() == whTemp.getEmployeeID()) {
                    wh = whTemp;
                    printEmployeeWithWorktime(emp, wh);
                }
            }
        }
    }

    /* Method takes an Employee and a WorkHours-object. First a line is printed to seperate the
     * information from the line above it. It then produces a console output with the
     * employee's name, and work hours for the corresponding days. It finishes with printing the
     * total amount of work hours for that week. */
    public static void printEmployeeWithWorktime(Employee emp, WorkHours wh) {
        separatorlineInSchedule();
        System.out.print(stringAtCertainLength(emp.getName(), 20));
        for (int i = 0; i < wh.getDays().length; i++) {
            System.out.print("|");
            Day day = wh.getDays()[i];
            if (day == null || (day.getStart() == 0 && day.getEnd() == 0)) {
                System.out.print("    fri    ");
            } else {
                String hours = "    " + day.getStart() + "-" + day.getEnd();
                hours = stringAtCertainLength(hours, 11);
                System.out.print(hours);
            }
        }
        System.out.print("|");
        System.out.println("    " + wh.totalWorkhours());
    }

    /* Method prints the horizontal line seperator for schedules. */
    public static void separatorlineInSchedule() {
        System.out.println("--------------------+-----------+-----------+-----------+-----------+-----------+-----------");
    }

    /* Method takes a String and an integer, and returns that String at the length
     * specified by the integer. If the original String is shorter, the method puts
     * spaces " " at the end until the desired length is met. If it is longer, the
     * method returns a substring of the specified length. */
    public static String stringAtCertainLength(String name, int len) {
        if (name.length() == len) {
            return name;
        }
        String nameFormatted = "";
        if (name.length() < len) {
            nameFormatted = name;
            while (nameFormatted.length() < len) {
                nameFormatted = nameFormatted + " ";
            }
        } else {
            nameFormatted = name.substring(0, len);
        }
        return nameFormatted;
    }

    public static void createEmployee(ArrayList<Employee> list, Year year){
        Scanner scan = new Scanner(System.in);
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
        int empID = 0;
        for(int i = 0; i < list.size(); i++){
            empID = list.get(i).employeeID;
            empID++;
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
        Employee newEmployee = new Employee(name, address, phoneNumber, email, ssn, empID, isManager, department);
        list.add(newEmployee);
        for(int i=0;i<year.getWeeks().length;i++){
            year.getWeeks()[i].getWorkHourList().add(new WorkHours(empID));
        }
    }

    public static void editSchedule(Scanner scan, int weekNumber, Year year, ArrayList<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Medarbejdernummer: " + list.get(i).employeeID + " - " + list.get(i).name + ".");
        }
        System.out.println("Indtast medarbejder nummer for den medarbejder, hvis tider du vil redigere:");
        int empID = scan.nextInt();
        boolean foundID = false;
        for (int i = 0; i < year.getWeeks()[weekNumber - 1].workHourList.size(); i++) {
            if (empID == year.getWeeks()[weekNumber - 1].workHourList.get(i).employeeID) {
                foundID = true;
                for (int j = 0; j < year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays().length; j++) {
                    switch (j) {
                        case 0:
                            System.out.println("Mandag: " + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getStart() + "-" + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 1:
                            System.out.println("Tirsdag: " + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getStart() + "-" + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 2:
                            System.out.println("Onsdag: " + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getStart() + "-" + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 3:
                            System.out.println("Torsdag: " + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getStart() + "-" + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        case 4:
                            System.out.println("Fredag: " + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getStart() + "-" + year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[j].getEnd());
                            break;
                        default:
                            break;
                    }
                }
                System.out.println("Indtast hvilken dag du vil redigere: ");
                String ugeDag = scan.next();
                switch (ugeDag.toUpperCase()) {
                    case "MANDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        int newStart = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[0].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        int newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[0].setEnd(newEnd);
                        break;
                    case "TIRSDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[1].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[1].setEnd(newEnd);
                        break;
                    case "ONSDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[2].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[2].setEnd(newEnd);
                        break;
                    case "TORSDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[3].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[3].setEnd(newEnd);
                        break;
                    case "FREDAG":
                        System.out.println("Indtast start tidspunkt for vagten:");
                        newStart = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[4].setStart(newStart);
                        System.out.println("Indtast slut tidspunkt for vagten:");
                        newEnd = scan.nextInt();
                        year.getWeeks()[weekNumber - 1].workHourList.get(i).getDays()[4].setEnd(newEnd);
                        break;
                }
                System.out.println("Vagten er opdateret.");
            }
        }
        if (!foundID) {
            System.out.println("Der er ingen medarbejder med dette medarbejdernummer i vagtplanen.");
        }
    }

    /* The method takes an ArrayList of Employees and adds five hardcoded Employee objects to it. */
    /*public static void addHardcodedEmployees(ArrayList<Employee> employees) {
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
    }*/

    /* The method takes a Year-object and an ArrayList of Employee-objects. A prerequisite for this
    * method to work optimally is to have 5 Employee-object in the ArrayList. In a for-loop traversing
    * the length of the Week[] in the year, the method generates working hours for each employee and
    * and adds to the corresponing Week giving along with the week's number. First the method makes five
    * Day-objects with times for when the shift starts and ends. Then it creates a Day-array with those five
    * Days. It then instantiates a WorkHours-object with the Day-array and employeeID from the first
    * Employee in the list. This it does for all five employees in the list. It then creates an
    * ArrayList for WorkHours and add these five WorkHours-objects. A Week-object is instantiated, with the
    * correct week number and the WorkHours-ArrayList, and the put into the corresponding position of
    * in the Year-object. */
    /*public static void addHardcodedWeekToYear(Year year, ArrayList<Employee> employees) {
        for (int i = 0; i < year.getWeeks().length; i++) {
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
            Day d25 = new Day(0, 0);
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
    }*/
}
