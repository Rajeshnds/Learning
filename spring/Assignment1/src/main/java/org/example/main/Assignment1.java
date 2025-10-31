package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment1
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Assignment 1 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        String[] persons = context.getBeanNamesForType(Person.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        String[] vehicles = context.getBeanNamesForType(Vehicle.class);

        System.out.println("Person name from spring context is: " + person.getName());
        System.out.println("Vehicle owned by person is: " + person.getVehicle());

        System.out.println("services being used: " + vehicle.getVehicleServices() );

        System.out.println(vehicle.getVehicleServices().getSpeakers());
        System.out.println(vehicle.getVehicleServices().getTyres());

        System.out.println(person.getVehicle().getVehicleServices().getSpeakers());
        System.out.println(person.getVehicle().getVehicleServices().getTyres());
    }
}

