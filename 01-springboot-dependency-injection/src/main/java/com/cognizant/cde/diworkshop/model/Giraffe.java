package com.cognizant.cde.diworkshop.model;

public class Giraffe implements Animal {
    int height;
    String name;

    public Giraffe(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public int getNumLegs() {
        return 4;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String quack() {
        return "woof";
    }

    @Override
    public String getColor() {
        return "Giraffe Yellow";
    }

    @Override
    public String getName() {
        return name;
    }
}
