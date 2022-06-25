package com.onirutla.algorithmdatastructures.datastructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @Test
    void initialDynamicArraySize_shouldReturnZero() {
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(0, array.size());
    }

    @Test
    void insertItemToArray_shouldBeInserted() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        assertEquals(1, array.get(0));
        assertEquals(2, array.get(1));
    }

    @Test
    void insertItemToArrayOverInitialCapacity_shouldNotReturnOutOfBoundException() {
        // initial capacity is ten / 10
        DynamicArray<Integer> array = new DynamicArray<>();
        for (int i = 0; i < 20; i++) {
            array.add(i);
            assertEquals(i, array.get(i));
        }
        assertEquals(20, array.size());
    }


    @Test
    void insertTwoItemToArray_shouldReturnSizeEqualsTwo() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        assertEquals(2, array.size());
    }

    @Test
    void onClearMethodCalled_shouldClearTheArray() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.clear();
        assertEquals(0, array.size());
        assertNull(array.get(0));
    }

    @Test
    void insertedItem_shouldReturnString() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        assertEquals("1, 2, 3", array.toString());
    }

    @Test
    void givenEmptyDynamicArray_shouldReturnIsEmptyTrue() {
        DynamicArray<Integer> array = new DynamicArray<>();
        assertTrue(array.isEmpty());
    }
}