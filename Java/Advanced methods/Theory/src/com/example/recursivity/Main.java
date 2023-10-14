package com.example.recursivity;

public class Main {
    public static void main(String[] args) {
        head(3);
        tail(3);

        int sum;

        sum = sum(3);
        System.out.println(sum);

        sum = tailSum( 3);
        System.out.println(sum);

        sum = iterativeSum(3);
        System.out.println(sum);
    }

    public static void head(int n) {
        if(n == 0)
            return;
        else
            head(n-1);
        System.out.println(n);
    }

    public static void tail(int n)
    {
        if(n == 0)
            return;
        else
            System.out.println(n);
        tail(n-1);
    }

    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int tailSum(int n) {
        return tailSum(0, n);
    }

    public static int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    public static int iterativeSum(int n) {
        int sum = 0;
        if(n < 0) {
            return -1;
        }
        for(int i=0; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
}
