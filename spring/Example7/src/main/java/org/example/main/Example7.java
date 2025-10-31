package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 7 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volksWagen = new Vehicle();
        volksWagen.setName("Volkswagen");
        Supplier<Vehicle> volksWagenSupplier = () -> volksWagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random Number is: " + randomNumber);

        if(randomNumber % 2 == 0){
            context.registerBean("volksWagen", Vehicle.class, volksWagenSupplier);
        }else{
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle =  null;
        Vehicle audiVehicle = null;

        try{
            volksVehicle = context.getBean("volksWagen", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Volkswagen vehicle");
        }

        try{
            audiVehicle = context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Error while creating Audi vehicle");
        }

        if(volksVehicle != null){
            System.out.println("Programming vehicle name from spring context is: " + volksVehicle.getName());
        }
        else{
            System.out.println("Programming vehicle name from spring context is: " + audiVehicle.getName());
        }
    }
}
