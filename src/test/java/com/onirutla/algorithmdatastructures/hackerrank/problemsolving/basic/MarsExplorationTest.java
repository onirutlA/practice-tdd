package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.MarsExploration.marsExploration;

class MarsExplorationTest {

    @Test
    void testCase0_shouldReturn_3() {
        Assertions.assertEquals(3, marsExploration("SOSSPSSQSSOR"));
    }

    @Test
    void testCase1_shouldReturn_1() {
        Assertions.assertEquals(1, marsExploration("SOSSOT"));
    }

    @Test
    void testCase3_shouldReturn_12() {
        Assertions.assertEquals(12, marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS"));
    }

    @Test
    void testCase11_shouldReturn_0() {
        Assertions.assertEquals(0, marsExploration("SOSSOSSOS"));
    }

}