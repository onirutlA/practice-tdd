package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.CountingValley.countingValleys;

public class CountingValleyTest {

    @Test
    void lowThanConstraint_shouldReturn_0() {
        int steps = 1;
        String path = "DD";

        Assertions.assertEquals(0, countingValleys(steps, path));
    }

    @Test
    void higherThanConstraint_shouldReturn_0() {
        int steps = 1000_001;
        String path = "";
        Assertions.assertEquals(0, countingValleys(steps, path));
    }

    @Test
    void testCase1_shouldReturn_1() {
        int steps = 8;
        String path = "DDUUUUDD";
        Assertions.assertEquals(1, countingValleys(steps, path));
    }

    @Test
    void testCase2_shouldReturn_2() {
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        Assertions.assertEquals(2, countingValleys(steps, path));
    }

    @Test
    void testCase3_shouldReturn_0() {
        int steps = 10;
        String path = "UDUUUDUDDD";
        Assertions.assertEquals(0, countingValleys(steps, path));
    }

}
