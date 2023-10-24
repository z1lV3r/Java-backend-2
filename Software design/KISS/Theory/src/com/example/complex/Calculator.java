package com.example.complex;

public class Calculator {
    public int add(int a, int b) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        for (int i = 0; i < 1000000; i++) {
            a += b;
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            while (true) {
                // This loop never ends because result is infinity
            }
        } else {
            return a / b;
        }
    }
}
