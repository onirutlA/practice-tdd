package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import java.util.HashMap;
import java.util.Map;

public class HappyLadybugs {
    public static String happyLadyBugs(String b) {
        Map<Character, Integer> map = new HashMap<>();

        String s = "";
        int n = b.length();

        for (int i = 0; i < n; i++) {
            char k = b.charAt(i);
            if (map.containsKey(k)) {
                int v = map.get(k);
                map.put(k, ++v);
            } else
                map.put(k, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getKey() > 90) {
                if (entry.getValue() >= 2)
                    s = "YES";
                else
                    s = "NO";
            }else{

            }
        }

        return s;

    }

}

