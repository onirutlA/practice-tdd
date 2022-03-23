package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

public class TaumBday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long bTotal = (long) b * bc;
        long wTotal = (long) w * wc;
        if (bc == 0 || wc == 0)
            return 0;
        else if (bc == z || (z > bc && z > wc))
            return bTotal + wTotal;
        else if (bc > wc + z)
            return ((long) b * wc) + wTotal + ((long) b * z);
        else if (wc > bc + z)
            return bTotal + ((long) w * (bc + z));
        else
            return bTotal + wTotal;
    }
}
