package com.cognizant.cde.dice;

import java.util.Random;

public class OneHundredSidedDie implements GameDie {
    private Random random = new Random();

    @Override
    public int roll() {
        return random.nextInt(100) + 1;
    }
}
