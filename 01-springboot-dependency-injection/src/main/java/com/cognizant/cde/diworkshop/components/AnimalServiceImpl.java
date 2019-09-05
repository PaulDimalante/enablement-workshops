package com.cognizant.cde.diworkshop.components;

import com.cognizant.cde.diworkshop.model.Animal;
import com.cognizant.cde.diworkshop.model.Dog;
import com.cognizant.cde.diworkshop.model.Giraffe;

public class AnimalServiceImpl implements AnimalService {
    DogService dogService;
    GiraffeService giraffeService;
    GeckoService geckoService;

    public void process(Animal animal) {
        if (animal instanceof Dog) {
            dogService.process((Dog)animal);
        }
        else if (animal instanceof Giraffe) {
            giraffeService.process((Giraffe)animal);
        }
        //TODO: Do something here
        else {
            System.out.println("I don't know what kind of animal this is: " + animal.getClass().getSimpleName());
        }
    }
}
