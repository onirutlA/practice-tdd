package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TwoDimensionArray {

    public static int hourGlass(List<List<Integer>> arr) {
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = arr.get(i).get(j) + arr.get(i).get(j + 1) +
                        arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) +
                        arr.get(i + 2).get(j + 2);
                sum.add(temp);
            }
        }
        return Collections.max(sum);
    }

}
