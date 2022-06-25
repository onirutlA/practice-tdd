package com.onirutla.algorithmdatastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.onirutla.algorithmdatastructures.algorithm.BonusCoklat.bonusCoklat;

public class BonusCoklatTest {

    @Test
    void given30_shouldReturn_37() {
        Assertions.assertEquals(37, bonusCoklat(30));
    }

    @Test
    void given35_shouldReturn_43() {
        Assertions.assertEquals(43, bonusCoklat(35));
    }

    @Test
    void given38_shouldReturn_46() {
        Assertions.assertEquals(46, bonusCoklat(38));
    }

    @Test
    void given40_shouldReturn_48() {
        Assertions.assertEquals(49, bonusCoklat(40));
    }

    @Test
    void given49_shouldReturn_59() {
        Assertions.assertEquals(59, bonusCoklat(49));
    }

    @Test
    void given50_shouldReturn_62() {
        Assertions.assertEquals(62, bonusCoklat(50));
    }

}


