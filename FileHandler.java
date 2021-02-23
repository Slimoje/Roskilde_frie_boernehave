package com.company;
import java.io.*;
import java.util.*;

public class FileHandler {

    /* The method reads data from a .txt file, and uses it to instantiate Employee-objects. The
    * objects are stored in an ArrayList, which the method takes as a parameter. */
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
    
    /* The method takes an ArrayList of Employee-objects and saves them to a file
    * in a format that is recognisable for the corresponding load-method. */
    public static void saveToFile(ArrayList<Employee> employees) throws FileNotFoundException {
        PrintStream save = new PrintStream("./res/employees2.txt");
        if(employees.size() > 0){
            save.print(employees.get(0).toStringFileFormat());
        }
        for(int i = 1; i < employees.size(); i++){
            save.println(";");
            save.print(employees.get(i).toStringFileFormat());
        }
    }
}

