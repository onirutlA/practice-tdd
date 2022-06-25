package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

public class FunnyString {
    public static String funnyString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        String rv = sb.toString();

        for (int i = 0, j = 0; i < s.length() - 1 && j < sb.length() - 1; i++, j++) {
            int sCurr = s.charAt(i), sNext = s.charAt(i + 1);
            int rvCurr = rv.charAt(j), rvNext = rv.charAt(j + 1);
            if (Math.abs(sCurr - sNext) != Math.abs(rvNext - rvCurr))
                return "Not Funny";
        }

        return "Funny";
    }
}
