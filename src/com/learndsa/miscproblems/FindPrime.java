package com.learndsa.miscproblems;

public class FindPrime {
    public static void main(String[] args) {
        checkIfPrime(6);
    }

    private static void checkIfPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            int temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(num + "number is prime");
        } else {
            System.out.println(num + "number is not a prime");
        }

    }
}
