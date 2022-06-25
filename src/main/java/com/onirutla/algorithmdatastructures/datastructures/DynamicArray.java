package com.onirutla.algorithmdatastructures.datastructures;

public class DynamicArray<T> {

    private static final Integer INITIAL_CAPACITY = 10;

    // For counting index that has been assigned
    private Integer insertedItemCount = 0;

    private Object[] array;

    public DynamicArray() {
        array = new Object[INITIAL_CAPACITY];
    }

    public DynamicArray(Integer capacity) {
        array = new Object[capacity];
    }

    /*Dynamic array should allow to assign item to an array
     *
     * */
    // TODO implement add method
    public void add(T t) {
        if (array.length == insertedItemCount) {
            Object[] tempArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        if (insertedItemCount < array.length) {
            array[insertedItemCount] = t;
            insertedItemCount++;
        }

    }


    // TODO implement clear method
    public void clear() {
        for (int i = 0; i < insertedItemCount; i++) {
            array[i] = null;
        }
        insertedItemCount = 0;
    }

    // TODO implement get method
    public Object get(Integer index) {
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < insertedItemCount; i++) {
            if (i != insertedItemCount - 1) {
                sb.append(array[i]);
                sb.append(", ");
            } else {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

    // TODO implement isEmpty method
    public Boolean isEmpty() {
        return insertedItemCount == 0;
    }

    // TODO implement size method
    public Integer size() {
        return insertedItemCount;
    }

}

