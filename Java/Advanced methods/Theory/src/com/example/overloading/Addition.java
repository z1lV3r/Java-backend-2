package com.example.overloading;

public class Addition {

    private final long a;
    private final long b;

    public Addition(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public Addition() {
        this(0,0);
    }

    public Addition(int a, int b) {
        this((long)a, (long)b);
    }

    public long getAddition() {
        return add(a,b);
    }

    public static long add(int a, int b, int c) {
        return add(a, add(b, c));
    }

    public static long add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    protected static int add(long a, int b) {
        return (int) add(a, (long) b);
    }

}
