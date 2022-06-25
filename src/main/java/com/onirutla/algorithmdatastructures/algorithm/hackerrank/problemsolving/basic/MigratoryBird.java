package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import java.util.List;

public class MigratoryBird {

    public static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[5];
        for (int i : arr) {
            if (i == 1) {
                ++count[0];
            }
        }
        return count[0];
    }

}
