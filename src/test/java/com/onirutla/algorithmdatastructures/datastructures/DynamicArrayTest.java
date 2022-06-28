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
        array.pushBack(1);
        array.pushBack(2);
        assertEquals(1, array.get(0));
        assertEquals(2, array.get(1));
    }

    @Test
    void insertItemToArrayOverInitialCapacity_shouldNotReturnOutOfBoundException() {
        // initial capacity is ten / 10
        DynamicArray<Integer> array = new DynamicArray<>();
        for (int i = 0; i < 20; i++) {
            array.pushBack(i);
            assertEquals(i, array.get(i));
        }
        assertEquals(20, array.size());
    }


    @Test
    void insertTwoItemToArray_shouldReturnSizeEqualsTwo() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.pushBack(1);
        array.pushBack(2);
        assertEquals(2, array.size());
    }

    @Test
    void onClearMethodCalled_shouldClearTheArray() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.pushBack(1);
        array.pushBack(2);
        array.clear();
        assertEquals(0, array.size());
        assertNull(array.get(0));
    }

    @Test
    void insertedItem_shouldReturnString() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.pushBack(1);
        array.pushBack(2);
        array.pushBack(3);
        assertEquals("1, 2, 3", array.toString());
    }

    @Test
    void givenEmptyDynamicArray_shouldReturnIsEmptyTrue() {
        DynamicArray<Integer> array = new DynamicArray<>();
        assertTrue(array.isEmpty());
    }

    @Test
    void insertItemAtGivenIndex_itemShouldBeInserted() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.pushBack(1);
        array.pushBack(3);
        array.add(1, 2);
        assertEquals("1, 2, 3", array.toString());
    }

    @Test
    void givenArray_1_3_4_thenInsertItemAtIndex1_arrayShouldBe_1_2_3_4() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.pushBack(1);
        array.pushBack(3);
        array.pushBack(4);
        array.add(1, 2);
        assertEquals("1, 2, 3, 4", array.toString());
    }

    @Test
    void givenArray_1_2_3_4_thenPop_arrayShouldBe_1_2_3() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.pushBack(1);
        array.pushBack(2);
        array.pushBack(3);
        array.pushBack(4);
        array.pop();
        assertEquals("1, 2, 3", array.toString());
    }

    @Test
    void givenArray_1_2_3_4_thenRemoveAtIndex2_arrayShouldBe_1_2_4() {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.pushBack(1);
        array.pushBack(2);
        array.pushBack(3);
        array.pushBack(4);
        array.removeAt(2);
        assertEquals("1, 2, 4", array.toString());
    }
}