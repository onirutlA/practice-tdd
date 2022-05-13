package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GemStone {
    public static int gemstones(@NotNull List<String> arr) {
        Set<Character> set = toSet(arr.get(0));

        for (int i = 1; i < arr.size(); i++) {
            set.retainAll(toSet(arr.get(i)));
        }
        return set.size();
    }

    static Set<Character> toSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set;
    }
}
