package com.example.three;

public class Main {
    public static void main(String[] args) {
        Object animalObj = new Dog();
        System.out.println(animalObj.toString());

        Animal animal = (Animal) animalObj;
        System.out.println(animal.makeNoise());

        Dog dog = (Dog) animal;
        dog.setName("Fido");
        System.out.println(dog.getName());
    }
}
