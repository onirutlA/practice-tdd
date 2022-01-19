package com.onirutla.algorithmdatastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.RepeatedString.repeatedString;

public class RepeatedStringTest {
    @Test
    void testCase0_shouldReturn_7(){
        Assertions.assertEquals(7, repeatedString("aba", 10));
    }
}
