package com.onirutla.algorithmdatastructures.algorithm;

public class BonusCoklat {
    public static int bonusCoklat(int n) {
        int exchanged = n/5;
        int exchangedExchanged = exchanged/5;
        return n + exchanged + exchangedExchanged;
    }
}
