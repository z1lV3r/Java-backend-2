package com.example.varargs;

public class Main {
    public static void main(String[] args) {
        String formattedString = String.format("This is a formatted string. %s", "prueba");
        System.out.println(formattedString);

        String string = "String";
        Integer integer = 1;
        Object object = new Object();

        printObjects(string);
        printObjects(string, integer);
        printObjects(string, integer, object);
    }

    private static void printObjects(Object object) {
        System.out.println(object.toString());
    }

    private static void printObjects(Object object1, Object object2) {
        System.out.println(object1);
        System.out.println(object2);
    }

    private static void printObjects(Object... objects) {
        Object []internalObjects = objects;
        if(internalObjects.length > 0) {
            for (Object object : internalObjects) {
                System.out.println(internalObjects.toString());
            }
        }
    }
}
