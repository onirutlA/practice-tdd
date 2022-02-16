package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        int chocolates = n / c;
        int wrapper = chocolates;

        while(wrapper >= m){
            int freeChocolate = wrapper / m;
            chocolates += freeChocolate;
            wrapper = freeChocolate + wrapper % m;
        }

        return chocolates;
    }

    public static int chocolateFeast2(int n, int c, int m){
        int chocolates = n/c;
        int totalChocolates = chocolates;

        while(chocolates >= m){
            chocolates -= m;

            totalChocolates++;
            chocolates++;
        }

        return totalChocolates;
    }
}
