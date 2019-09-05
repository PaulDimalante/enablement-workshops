package com.cognizant.cde.diworkshop.configuration;

import com.cognizant.cde.diworkshop.components.AnimalService;
import com.cognizant.cde.diworkshop.model.Dog;
import com.cognizant.cde.diworkshop.model.Gecko;
import com.cognizant.cde.diworkshop.model.Giraffe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@Configuration
public class InitialLoader {
    @Autowired
    AnimalService animalService;

    @EventListener(ContextRefreshedEvent.class)
    public void onAppStart() {
        Dog fido = new Dog(4, "beige", "Fido");
        Giraffe giraffe = new Giraffe(100, "Geoffrey");
        Gecko gecko = new Gecko();

        System.out.println("##############");
        animalService.process(fido);
        System.out.println("##############");
        animalService.process(giraffe);
        System.out.println("##############");
        animalService.process(gecko);
    }
}
