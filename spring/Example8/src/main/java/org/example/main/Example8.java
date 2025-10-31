package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example8
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 8 =============\n");

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name from spring context is: " + veh2.getName());
    }
}
