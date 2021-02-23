package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        /* The following two lines instantiates a new ArrayList of Employees,
         * and populates it with five hardcoded Employee-objects. */
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        addHardcodedEmployees(employees);

        System.out.println(employees);

        createEmployee(scan, employees);

        System.out.println(employees);
        
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
        System.out.println("Tryk 3 for at lave vagtplanen");
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
