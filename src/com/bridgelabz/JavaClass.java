package com.bridgelabz;

class Employee {
    String name = "Rohit";
    int id = 10;
}

public class JavaClass {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Employee amol = new Employee(); // object created of Employee class.
        Employee ivan = new Employee(); // you can create as  any as object of the custom class.

        // if you are directly calling the Employees class variables then, it will print Rohit and 10.
        // but you are changing the varibles in main method then it will show the main method variables.
         // amol.name="ELNINO";
         // amol.id=21;

         ivan.id= 12;
        ivan.name="Torres";
        System.out.println(amol.id + " " + amol.name);
        System.out.println(ivan.id+ " " +ivan.name);
    }
}
