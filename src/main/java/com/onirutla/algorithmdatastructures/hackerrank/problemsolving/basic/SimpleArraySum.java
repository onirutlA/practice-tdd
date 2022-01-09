package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

public class SimpleArraySum {


    /**
     * O(1)
     */
    private static int sum(int[] a) {
        return ((a[0] + a[a.length - 1]) * a.length) / 2;
    }

    /**
     * O(n)
     */
    private static long sum1(int[] a) {
        long sum = 0;
        for (long i : a) {
            sum += i;
        }
        return sum;
    }

}
