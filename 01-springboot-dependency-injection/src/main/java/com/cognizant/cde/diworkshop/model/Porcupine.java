package com.cognizant.cde.diworkshop.model;

public class Porcupine implements Animal {
    String name;

    public Porcupine(String name) {
        this.name = name;
    }

    @Override
    public int getNumLegs() {
        return 4;
    }

    @Override
    public int getHeight() {
        return 5;
    }

    @Override
    public String quack() {
        return "Poke";
    }

    @Override
    public String getColor() {
        return "Brown";
    }

    @Override
    public String getName() {
        return name;
    }
}
