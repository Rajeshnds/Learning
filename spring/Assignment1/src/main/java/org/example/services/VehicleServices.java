package org.example.services;

import org.example.interfaces.Speakers;
import org.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    private final Speakers speakers;
    private final Tyres tyres;

    @Autowired
    public VehicleServices(Speakers speakers, Tyres tyres){
        this.speakers = speakers;
        this.tyres = tyres;
    }

    public String getTyres() {
        return tyres.rotate();
    }

    public String getSpeakers() {
        return speakers.makeSound();
    }

    public String getServiceDetails(){
        return speakers.makeSound() + " and " + tyres.rotate();
    }

    @Override
    public String toString() {
        return getServiceDetails();
    }

}
