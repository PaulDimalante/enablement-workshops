package com.cognizant.cde.diworkshop.components;

import com.cognizant.cde.diworkshop.model.Gecko;
import org.springframework.stereotype.Component;

@Component
public class GeckoService {
    void process(Gecko gecko) {
        System.out.println("This is custom business logic for Geckos");
        System.out.println("Geckos have " + gecko.getNumLegs() + " legs");
        System.out.println("Geckos are " + gecko.getHeight() + " tall");
        System.out.println("Geckos are " + gecko.getColor());
        System.out.println("This gecko is " + gecko.getName());
    }
}
