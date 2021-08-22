package com.learndsa.miscproblems;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …

public class PrintFibonacciNumberRecursion {

    public static void main(String[] args) {
        System.out.println(returnFibonacciNumber(9));
    }

    public static int returnFibonacciNumber(int number) {
        int fib1 = 0;
        int fib2 = 1;
        if (number<=1) {
            return number;
        }
        return returnFibonacciNumber(number-1) + returnFibonacciNumber(number-2);
    }
}
