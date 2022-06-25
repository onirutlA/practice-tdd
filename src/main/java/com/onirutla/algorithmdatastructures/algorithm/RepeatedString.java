package com.onirutla.algorithmdatastructures.algorithm;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long remainder = n % s.length();
        long aInGivenString = 0;
        long aInRemainder = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aInGivenString++;
            }
        }

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                aInRemainder++;
            }
        }
        return aInGivenString * (n / s.length()) + aInRemainder;
    }
}
