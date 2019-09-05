package com.cognizant.cde.diworkshop.model;

public class Dog implements Animal {
    int height;
    String color, name;

    public Dog(int height, String color, String name) {
        this.height = height;
        this.color = color;
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
        return color;
    }

    @Override
    public String getName() {
        return name;
    }
}
