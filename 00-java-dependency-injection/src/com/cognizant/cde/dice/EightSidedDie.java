package com.cognizant.cde.dice;

import java.util.Random;

public class EightSidedDie implements GameDie {
    private Random random = new Random();

    @Override
    public int roll() {
        return random.nextInt(8) + 1;
    }
}
