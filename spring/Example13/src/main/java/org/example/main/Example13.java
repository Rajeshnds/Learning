package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 13 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person name from spring context is: " + person.getName());
        System.out.println("Vehicle owned by person is: " + person.getVehicle());
    }
}

