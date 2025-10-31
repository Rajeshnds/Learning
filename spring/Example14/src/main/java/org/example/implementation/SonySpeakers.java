package org.example.implementation;

import org.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound() {
        return "Playing music through Sony speakers";
    }
}
