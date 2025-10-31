package org.example.implementation;

import org.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle running on Michelin tyres";
    }
}
