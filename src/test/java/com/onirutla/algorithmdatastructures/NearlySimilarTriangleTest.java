package com.onirutla.algorithmdatastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.onirutla.algorithmdatastructures.NearlySimilarTriangle.nearlySimilarRectangles;

public class NearlySimilarTriangleTest {
    @Test
    void testCase0_shouldReturn_3() {

        Long[] sides0 = new Long[]{4L, 8L};
        Long[] sides1 = new Long[]{15L, 30L};
        Long[] sides2 = new Long[]{25L, 50L};

        List<List<Long>> sides = List.of(Arrays.asList(sides0), Arrays.asList(sides1), Arrays.asList(sides2));


        Assertions.assertEquals(3, nearlySimilarRectangles(sides));
    }

    @Test
    void testCase1_shouldReturn_0() {

        Long[] sides0 = new Long[]{2L, 1L};
        Long[] sides1 = new Long[]{10L, 7L};
        Long[] sides2 = new Long[]{9L, 5L};
        Long[] sides3 = new Long[]{6L, 9L};
        Long[] sides4 = new Long[]{7L, 3L};

        List<List<Long>> sides = List.of(Arrays.asList(sides0), Arrays.asList(sides1), Arrays.asList(sides2), Arrays.asList(sides3), Arrays.asList(sides4));

        Assertions.assertEquals(0, nearlySimilarRectangles(sides));
    }
}

