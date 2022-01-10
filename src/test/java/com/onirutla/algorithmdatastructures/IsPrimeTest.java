package com.onirutla.algorithmdatastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic.IsPrime.isPrime;

public class IsPrimeTest {

    @Test
    void givenInput2_shouldReturn_1() {
        Assertions.assertEquals(1, isPrime(2));
    }

    @Test
    void givenInput3_shouldReturn_1() {
        Assertions.assertEquals(1, isPrime(3));
    }

    @Test
    void givenInput4_shouldReturn_2(){
        Assertions.assertEquals(2, isPrime(4));
    }

    @Test
    void givenInput5_shouldReturn_1() {
        Assertions.assertEquals(1, isPrime(5));
    }

    @Test
    void givenInput7_shouldReturn_1() {
        Assertions.assertEquals(1, isPrime(7));
    }

    @Test
    void givenInput9_shouldReturn_3() {
        Assertions.assertEquals(3, isPrime(9));
    }

    @Test
    void givenInput11_shouldReturn_1() {
        Assertions.assertEquals(1, isPrime(11));
    }

    @Test
    void givenInput12_shouldReturn_2() {
        Assertions.assertEquals(2, isPrime(12));
    }

    @Test
    void givenInput13_shouldReturn_1() {
        Assertions.assertEquals(1, isPrime(13));
    }

    @Test
    void givenInput38_shouldReturn_2() {
        Assertions.assertEquals(2, isPrime(38));
    }

    @Test
    void givenInput50_shouldReturn_2() {
        Assertions.assertEquals(2, isPrime(50));
    }

    @Test
    void givenInput51_shouldReturn_3() {
        Assertions.assertEquals(3, isPrime(51));
    }

    @Test
    void givenInput_10671_shouldReturn_3() {
        Assertions.assertEquals(3, isPrime(10671));
    }

    @Test
    void givenInput_102983_shouldReturn_1(){
        Assertions.assertEquals(1, isPrime(102983));
    }
}
