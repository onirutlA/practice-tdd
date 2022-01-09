package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairCount = 0;

        // this set act as a stack but preventing duplicate
        Set<Integer> colors = new HashSet<>();

        for (int i = 0; i < n; i++) {
            //if colors is doesnt have value like ar.get(i) then add the color
            // if colors have value like ar.get(i) count pair and remove it
            if (!colors.contains(ar.get(i))) {
                colors.add(ar.get(i));
            } else {
                pairCount++;
                colors.remove(ar.get(i));
            }
        }

        return pairCount;
    }

}
