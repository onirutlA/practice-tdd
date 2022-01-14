package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.AngryProfessor.angryProfessor;

public class AngryProfessorTest {

    @Test
    void example_test_case_shouldReturn_NO() {
        int k = 3;
        List<Integer> a = new ArrayList<>(Arrays.asList(-2, -1, 0, 1, 2));

        Assertions.assertEquals("NO", angryProfessor(k, a));
    }

    @Test
    void test_case0_shouldReturn_YES() {
        int k = 3;
        List<Integer> a = new ArrayList<>(Arrays.asList(-1, -3, 4, 2));

        Assertions.assertEquals("YES", angryProfessor(k, a));
    }

    @Test
    void test_case1_shouldReturn_NO() {
        int k = 2;
        List<Integer> a = new ArrayList<>(Arrays.asList(-1, -3, 4, 2));

        Assertions.assertEquals("NO", angryProfessor(k, a));
    }
}
