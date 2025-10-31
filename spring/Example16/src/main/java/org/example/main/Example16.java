package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example16
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 16 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        Vehicle vehicle2 = context.getBean("vehicle", Vehicle.class);

        System.out.println("Hashcode of the object vehicle1: " + vehicle1.hashCode());
        System.out.println("Hashcode of the object vehicle2: " + vehicle2.hashCode());

        if(vehicle1 == vehicle2){
            System.out.println("vehicle is a singleton scoped bean.");
        }
        else{
            System.out.println("vehicle is a prototype scoped bean.");
        }
    }
}
