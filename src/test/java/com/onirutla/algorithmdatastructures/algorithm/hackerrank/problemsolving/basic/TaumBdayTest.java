package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaumBdayTest {

    @Test
    void testCase1() {
        Assertions.assertEquals(20, TaumBday.taumBday(10, 10, 1, 1, 1));
    }

    @Test
    void testCase2() {
        Assertions.assertEquals(37, TaumBday.taumBday(5, 9, 2, 3, 4));
    }

    @Test
    void testCase3() {
        Assertions.assertEquals(12, TaumBday.taumBday(3, 6, 9, 1, 1));
    }

    @Test
    void testCase4() {
        Assertions.assertEquals(35, TaumBday.taumBday(7, 7, 4, 2, 1));
    }

    @Test
    void testCase5() {
        Assertions.assertEquals(12, TaumBday.taumBday(3, 3, 1, 9, 2));
    }

    @Test
    void testCase14() {
        Assertions.assertEquals(29, TaumBday.taumBday(3, 5, 3, 4, 2));
    }

    @Test
    void testCase16() {
        Assertions.assertEquals(2000000, TaumBday.taumBday(100, 100, 10_000, 10_000, 0));
        Assertions.assertEquals(0, TaumBday.taumBday(100, 100, 0, 1_000_000, 0));
        Assertions.assertEquals(0, TaumBday.taumBday(100, 100, 0, 0, 0));
    }
}