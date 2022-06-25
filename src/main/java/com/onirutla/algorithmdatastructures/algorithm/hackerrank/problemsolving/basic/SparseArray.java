package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            int count = 0;
            for (String string : strings) {
                if (string.equals(query)) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }

}
