package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic.ChocolateFeast.chocolateFeast2;

class ChocolateFeastTest {

    @Test
    void testCase0_shouldReturn9(){
        Assertions.assertEquals(9, chocolateFeast2(15, 3, 2));
    }

    @Test
    void testCase1_shouldReturn6(){
        Assertions.assertEquals(6, chocolateFeast2(10, 2, 5));
    }

    @Test
    void testCase2_shouldReturn3(){
        Assertions.assertEquals(3, chocolateFeast2(12, 4, 4));
    }
}