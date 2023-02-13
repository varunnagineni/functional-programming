package com.functional.programming.datastructures.algorithms.linkedin.recursion;

public class Factorial {

    public static void main(String[] args) {

        try {
            System.out.println(factorial(10));
            System.out.println(factorial(-10));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int factorial(int n) {

        if (n < 0)
            throw new RuntimeException("N can't be less than 0");
        if (n == 0)
            return n;
        return n*factorial(n-1);
    }
}
