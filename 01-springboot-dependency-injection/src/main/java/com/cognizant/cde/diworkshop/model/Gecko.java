package com.cognizant.cde.diworkshop.model;

public class Gecko implements Animal {

    @Override
    public int getNumLegs() {
        return 4;
    }

    @Override
    public int getHeight() {
        return 1;
    }

    @Override
    public String quack() {
        return "";
    }

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getName() {
        return "Gary";
    }
}
