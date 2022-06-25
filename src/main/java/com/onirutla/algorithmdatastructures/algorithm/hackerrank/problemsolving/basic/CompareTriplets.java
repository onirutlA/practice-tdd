package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        Integer aWin = 0, bWin = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) aWin++;
            if (a.get(i) < b.get(i)) bWin++;
        }

        result.add(aWin);
        result.add(bWin);

        return result;
    }

}
