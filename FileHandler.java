package com.company;
import java.io.*;
import java.util.*;

public class FileHandler {

    public static void loadFromFile(ArrayList<Employee> employees) throws FileNotFoundException {
        Scanner load = new Scanner(new File("C:\\Users\\canny\\IntelliJ mappe\\Roskilde_frie_boernehave-master\\src\\com\\company\\employees.txt"));
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



}

