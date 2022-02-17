package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import java.util.List;

public class FairRations {
    public static String fairRations(List<Integer> B) {
        // Write your code here
        int breadGiven = 0;
        int sum = 0;

        for (Integer i : B) sum += i;

        if (sum % 2 != 0) return "NO";
        else {
            for (int i = 0; i < B.size() - 1; i++) {
                if (B.get(i) % 2 != 0) {
                    B.set(i, B.get(i) + 1);
                    breadGiven++;

                    B.set(i + 1, B.get(i + 1) + 1);
                    breadGiven++;
                }
            }
            return String.valueOf(breadGiven);
        }
    }
}
