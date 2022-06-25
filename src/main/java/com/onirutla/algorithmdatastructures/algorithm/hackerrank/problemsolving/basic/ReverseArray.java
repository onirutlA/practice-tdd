package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

public class ReverseArray {

    private static int[] reverseArray(int[] input) {
        int[] result = new int[input.length];
        for (int start = 0, end = result.length - 1; start < result.length && end >= 0; start++, end--) {
            result[start] = input[end];
        }
        return result;
    }
}
