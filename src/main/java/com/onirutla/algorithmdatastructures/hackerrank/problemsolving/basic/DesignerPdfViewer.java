package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import java.util.List;

public class DesignerPdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        int tallest = 0;

        for (int i = 0; i < word.length(); i++) {
            tallest = Math.max(tallest, h.get((int) word.charAt(i) - (int) 'a'));
        }

        return tallest * word.length();
    }

    public static int designerPdfViewer2(List<Integer> h, String word) {
        int tallest = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < h.size(); j++) {
                if (j + 97 == (int) word.charAt(i)) {
                    if (h.get(j) > tallest)
                        tallest = h.get(j);
                }
            }
        }
        return tallest * word.length();
    }
}
