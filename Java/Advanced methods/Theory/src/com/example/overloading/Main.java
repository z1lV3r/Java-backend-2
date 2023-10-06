package com.example.overloading;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition);
        System.out.println(Addition.add(1, 0));
        System.out.println(Addition.add(1, 0, 1));

        char a = 1;
        short b = 1;

        System.out.println(Addition.add(a,b));

        char c = 1;
        long d = 1;

        System.out.println(Addition.add(c,d));
    }
}
