package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import java.util.List;

public class BeautifulTriplet {
    public static int beautifulTriplet(int d, List<Integer> arr) {
        int count = 0;
        for (Integer i : arr) {
            if (arr.contains(i + d) && arr.contains(i + (2 * d)))
                count++;
        }
        return count;
    }
}


