package com.example.wet.v1;

public class Main {
    public static void main(String[] args) {
        int []variables = {1, 2, 3, 4};
        for (int i = 0; i < variables.length; i++) {
            int variable = variables[i];
            System.out.println("Result operation value " + (i+1) + ": " + operation(variable));
        }
    }

    public static int operation(int variable) {
        return variable + variable;
    }
}
