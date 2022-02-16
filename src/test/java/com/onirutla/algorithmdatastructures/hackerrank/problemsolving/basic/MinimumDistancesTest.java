package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.MinimumDistances.minimumDistances;
import static org.junit.jupiter.api.Assertions.*;

class MinimumDistancesTest {

    @Test
    void testCase0_shouldReturn_3() {
        Integer[] givenArray = new Integer[]{7, 1, 3, 4, 1, 7};
        Assertions.assertEquals(3, minimumDistances(Arrays.asList(givenArray)));
    }

    @Test
    void testCase1_shouldReturn_minus1() {
        Integer[] givenArray = new Integer[]{1, 2, 3, 4, 10};
        Assertions.assertEquals(-1, minimumDistances(Arrays.asList(givenArray)));
    }

    @Test
    void testCase8_shouldReturn_1(){
        Integer[] givenArray = new Integer[]{1,1};
        Assertions.assertEquals(1, minimumDistances(Arrays.asList(givenArray)));
    }

}