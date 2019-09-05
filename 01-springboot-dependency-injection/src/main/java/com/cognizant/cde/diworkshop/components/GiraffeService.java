package com.cognizant.cde.diworkshop.components;

import com.cognizant.cde.diworkshop.model.Giraffe;
import org.springframework.stereotype.Component;

@Component
public class GiraffeService {
    public void process(Giraffe giraffe) {
        System.out.println("This is custom business logic for giraffes");
        System.out.println(
                "       .-\",\n" +
                "       `~||\n" +
                "         ||___\n" +
                "         (':.)`\n" +
                "         || ||\n" +
                "         || ||\n" +
                "         ^^ ^^"
        );
        System.out.println("Name: " + giraffe.getName());
        System.out.println("Height: " + giraffe.getHeight());
    }
}
