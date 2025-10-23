package org.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Honda";
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Destroying vehicle bean.");
    }

    public void printHello(){
        System.out.println("Printing hello from component vehicle bean.");
    }
}
