package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int countOnTime = 0;
        for (int student : a) {
            if (student <= 0) {
                countOnTime++;
            }
        }
        return countOnTime < k ? "YES" : "NO";
    }

}
