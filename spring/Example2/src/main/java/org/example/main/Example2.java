package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2
{
    public static void main( String[] args ){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("vehicle name from spring context is: " + veh.getName());
    }
}
