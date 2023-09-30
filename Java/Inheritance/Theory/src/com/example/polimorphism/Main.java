package com.example.polimorphism;

public class Main {
    public static void main(String[] args) {

        Object chips = new Chips("Papas", 10.0f, System.currentTimeMillis(), System.currentTimeMillis() ,"La costeña".toCharArray());
        System.out.println(chips.toString());

    }
}
