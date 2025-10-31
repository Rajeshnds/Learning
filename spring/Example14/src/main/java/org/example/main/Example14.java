package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 14 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);

        System.out.println("Hashcode of the object vehicleService1: " + vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleService2: " + vehicleServices2.hashCode());

        if(vehicleServices1 == vehicleServices2){
            System.out.println("vehicleServices is a singleton bean.");
        }
        else{
            System.out.println("vehicleServices is not a singleton bean.");
        }
    }
}

