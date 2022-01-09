package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

public class DrawingBook {

    // O(n)
    public static int pageCount1(int n, int p) {
        // Write your code here
        int front = 0, back = 0;
        for (int i = 1, j = n; i <= n && j >= 0; i += 2, j -= 2) {
            //from front
            if (p == i) {
                return front;
            } else if (i < p || i + 1 <= p) {
                front++;
                if (i - 1 == p) {
                    return Math.min(front, back);
                }
            }

            //from back
            if (p % 2 != 0) {
                if (j == p || j + 1 == p) {
                    return back;
                } else {
                    back++;
                }
            } else {
                if (j == p || j - 1 == p) {
                    return Math.min(front, back);
                } else {
                    back++;
                }
            }

        }
        return Math.min(front, back);
    }

    //O(1)
    public static int pageCount2(int n, int p) {
        int front = p >> 1;
        int back = ((n & 1) == 1) ? (n - p) >> 1 // odd number of pages
                : (n - p + 1) >> 1; // even number of pages

        return Math.min(front, back);
    }

    //O(1)
    public static int pageCount3(int n, int p) {
        int front = p / 2;
        int back;

        if (n % 2 == 0)
            back = (n - p + 1) / 2;
        else
            back = (n - p) / 2;

        return Math.min(front, back);
    }
}
