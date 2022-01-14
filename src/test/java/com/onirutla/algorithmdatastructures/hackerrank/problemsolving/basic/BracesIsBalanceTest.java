package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.BracesIsBalance.isBalance;

class BracesIsBalanceTest {

    @Test
    void testCase1_shouldReturn_true() {
        Assertions.assertTrue(isBalance("{}"));
    }

    @Test
    void testCase2_shouldReturn_false() {
        Assertions.assertFalse(isBalance("{]"));
    }

    @Test
    void testCase3_shouldReturn_true() {
        Assertions.assertTrue(isBalance("()"));
    }

    @Test
    void testCase4_shouldReturn_false() {
        Assertions.assertFalse(isBalance("{"));
    }

    @Test
    void testCase5_shouldReturn_false() {
        Assertions.assertFalse(isBalance("({)}"));
    }

    @Test
    void testCase7_shouldReturn_true(){
        Assertions.assertTrue(isBalance("[()]{}{[()()]()}"));
    }
}