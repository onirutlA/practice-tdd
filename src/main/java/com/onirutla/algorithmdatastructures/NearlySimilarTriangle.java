package com.onirutla.algorithmdatastructures;

import java.util.List;

public class NearlySimilarTriangle {
    public static long nearlySimilarRectangles(List<List<Long>> sides) {
        long count = 0;
        double nextRes = 0, res = 0;
        for (int i = 0; i < sides.size(); i++) {
            res = (double) sides.get(i).get(0) / sides.get(i).get(1);
            for (int j = i + 1; j < sides.size(); j++) {
                nextRes = (double) sides.get(j).get(0) / sides.get(j).get(1);
                if(res == nextRes){
                    count++;
                }
            }
        }

        return count;
    }
}
