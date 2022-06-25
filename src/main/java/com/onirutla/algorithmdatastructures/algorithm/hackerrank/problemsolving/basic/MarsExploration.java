package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

public class MarsExploration {

    public static int marsExploration(String s) {
        // Write your code here
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i) != sos.charAt(0)) count++;
            if (s.charAt(i + 1) != sos.charAt(1)) count++;
            if (s.charAt(i + 2) != sos.charAt(2)) count++;
        }
        return count;
    }
}
