package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic.FunnyString.funnyString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FunnyStringTest {

    @Test
    void testCase_0() {
        assertEquals("Funny", funnyString("acxz"));
        assertEquals("Not Funny", funnyString("bcxz"));
    }

    @Test
    void testCase_1() {
        assertEquals("Not Funny", funnyString("ivvkxq"));
        assertEquals("Not Funny", funnyString("ivvkx"));
    }

    @Test
    void testCase_2() {
        assertEquals("Funny", funnyString("uvzxrumuztyqyvpnji"));
    }

}