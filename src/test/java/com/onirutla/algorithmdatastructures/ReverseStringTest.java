package com.onirutla.algorithmdatastructures;

import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.algorithm.ReverseString.*;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void testCase0(){
        assertEquals("onirutla", reverseString4("alturino"));
    }
}