package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.BeautifulTriplet.beautifulTriplet;

class BeautifulTripletTest {
    @Test
    void testCase0_shouldReturn_3() {
        var list = Arrays.asList(0, 1, 2, 3, 4, 5);
        Assertions.assertEquals(4, beautifulTriplet(1, list));
    }

    @Test
    void testCase1_shouldReturn_3() {
        var list = Arrays.asList(1, 2, 4, 5, 7, 8, 10);
        Assertions.assertEquals(3, beautifulTriplet(3, list));
    }
}