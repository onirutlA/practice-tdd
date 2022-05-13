package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.GemStone.gemstones;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GemStoneTest {

    @Test
    void testCase0() {
        assertEquals(2, gemstones(List.of("abcdde", "baccd", "eeabg")));
    }

    // a, s, d, f
    @Test
    void testCase1() {
        assertEquals(4, gemstones(List.of("basdfj", "asdlkjfdjsa", "bnafvfnsd", "oafhdlasd")));
    }

}
