package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import java.util.List;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int temp = 0;
            for (int j = i; j < i + m; j++) {
                temp += s.get(j);
            }
            if (temp == d) {
                result++;
            }
        }
        return result;
    }

}