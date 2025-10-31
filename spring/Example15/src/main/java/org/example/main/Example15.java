package org.example.main;

import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15
{
    public static void main( String[] args ){
        System.out.println("\n============= This is Example 15 =============\n");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the bean from the spring context.");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the bean from the spring context.");
    }
}
