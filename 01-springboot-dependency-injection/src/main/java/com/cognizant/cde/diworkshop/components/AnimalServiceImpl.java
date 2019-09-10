package com.cognizant.cde.diworkshop.components;

import com.cognizant.cde.diworkshop.configuration.InitialLoader;
import com.cognizant.cde.diworkshop.model.Animal;
import com.cognizant.cde.diworkshop.model.Dog;
import com.cognizant.cde.diworkshop.model.Gecko;
import com.cognizant.cde.diworkshop.model.Giraffe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {
    @Autowired DogService dogService;
    @Autowired GiraffeService giraffeService;
    @Autowired GeckoService geckoService;

    public void process(Animal animal) {
        if (animal instanceof Dog) {
            dogService.process((Dog)animal);
        }
        else if (animal instanceof Giraffe) {
            giraffeService.process((Giraffe)animal);
        }
        else if (animal instanceof Gecko) {
            geckoService.process((Gecko)animal);
        }
        else {
            System.out.println("I don't know what kind of animal this is: " + animal.getClass().getSimpleName());
        }
    }
}
