package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

public class IsPrime {

    private static int isPrime(int number) {
        int result = 0;
        if (number == 2) {
            return 1;
        } else if (number % 2 == 0) {
            return 2;
        } else if (number % 3 == 0) {
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (i % number == 0) {
                    result = i;
                    break;
                }
            }
        } else if (number % 5 == 0) {
            if (number == 5)
                return 1;
            return 5;
        } else if (number % 7 == 0) {
            if (number == 7)
                return 1;
            return 7;
        } else {
            result = 1;
        }
        return result;
    }

}
