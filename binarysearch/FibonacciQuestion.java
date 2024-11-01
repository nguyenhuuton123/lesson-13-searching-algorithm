package com.codegym.binarysearch;

public class FibonacciQuestion {
    public static int fibonacci (int n) {
        if (n < 3)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
    }

}
