package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 12 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println("Name of person is: " + person.getName());
        System.out.println("Vehicle owned by person is: " + person.getVehicle());

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name is: " + vehicle.getName());
        System.out.println("Printing from toString: " + vehicle.toString());
        vehicle.printHello();
    }
}

