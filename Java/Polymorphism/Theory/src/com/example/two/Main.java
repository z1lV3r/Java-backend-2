package com.example.two;

import com.example.one.Animal;

public class Main {
    public static void main(String[] args) {
        Object animalObj = new Animal();
        System.out.println(animalObj.toString());

        Animal animal = (Animal) animalObj;
        System.out.println(animal.makeNoise());
    }
}
