package com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.algorithm.hackerrank.problemsolving.basic.HappyLadybugs.happyLadyBugs;
import static org.junit.jupiter.api.Assertions.*;

class HappyLadybugsTest {
    @Test
    void testCase0() {
        assertEquals("YES", happyLadyBugs("RBY_YBR"));
        assertEquals("NO", happyLadyBugs("X_Y__X"));
        assertEquals("YES", happyLadyBugs("RBY_YBR"));
        assertEquals("YES", happyLadyBugs("__"));
        assertEquals("YES", happyLadyBugs("B_RRBR"));
    }
}
