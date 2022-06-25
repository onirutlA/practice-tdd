package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

public class CatAndMouse {

    static String catAndMouse(int x, int y, int z) {
        int distanceCatA = Math.abs(x - z), distanceCatB = Math.abs(y - z);
        if (distanceCatA > distanceCatB)
            return "Cat B";
        else if (distanceCatA < distanceCatB)
            return "Cat A";
        else
            return "Mouse C";
    }

}
