package com.onirutla.algorithmdatastructures.algorithm;

public class IsPrime {

    public static int isPrime(int n) {
        if (n == 2) {
            return 1;
        } else if (n % 2 == 0) {
            return 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
