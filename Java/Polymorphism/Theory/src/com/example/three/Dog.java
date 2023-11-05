package com.example.three;

public class Dog extends Animal {

    private String name;

    @Override
    public String makeNoise() {
        return "Bark!!!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
