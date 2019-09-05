package com.cognizant.cde.diworkshop.model;

public class FernadinaIslandGalapagosTortoise implements Animal {
    @Override
    public int getNumLegs() {
        return 4;
    }

    @Override
    public int getHeight() {
        return 10;
    }

    @Override
    public String quack() {
        return "I'm the last of my species.";
    }

    @Override
    public String getColor() {
        return "Somber Green";
    }

    @Override
    public String getName() {
        return "Bob";
    }
}
