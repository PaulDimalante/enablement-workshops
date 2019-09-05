package com.cognizant.cde.diworkshop.components;

import com.cognizant.cde.diworkshop.model.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogService {
    public void process(Dog dog) {
        System.out.println("This is custom business logic for Dogs");
        System.out.println("My dog is " + dog.getName());
        System.out.println("Height: " + dog.getHeight());
    }
}
