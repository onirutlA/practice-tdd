package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic.FairRations.fairRations;

class FairRationsTest {
    @Test
    void testCase0_shouldReturn_4() {
        var list = Arrays.asList(2, 3, 4, 5, 6);
        Assertions.assertEquals("4", fairRations(list));
    }

    @Test
    void testCase1_shouldReturn_NO() {
        var list = Arrays.asList(1, 2);
        Assertions.assertEquals("NO", fairRations(list));
    }

    @Test
    void testCase1_shouldReturn_4() {
        var list = Arrays.asList(4, 5, 6, 7);
        Assertions.assertEquals("4", fairRations(list));
    }
}