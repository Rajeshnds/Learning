package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 5 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + vehicle.getName());
        vehicle.printHello();
    }
}
