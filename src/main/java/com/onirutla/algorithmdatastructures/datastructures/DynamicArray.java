package com.onirutla.algorithmdatastructures.datastructures;

import java.util.Arrays;

public class DynamicArray<E> {

    private static final Integer DEFAULT_CAPACITY = 16;

    private int size;
    private int capacity;
    private Object[] elements;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(Integer capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    private int newCapacity(int capacity) {
        this.capacity = capacity;
        return this.capacity;
    }

    public void pushBack(E element) {
        if (this.capacity == this.size) {
            growSize(this.size * 2);
        }

        this.elements[this.size] = element;
        this.size++;
    }

    private void growSize(int capacity) {
        Object[] temp = new Object[newCapacity(capacity)];

        for (int i = 0; i < this.size; i++)
            temp[i] = this.elements[i];

        this.elements = temp;
    }

    public void add(final int index, E element) {
        if (this.size == this.capacity)
            growSize(this.size + 1);

        for (int i = this.size - 1; i >= index; i--)
            this.elements[i + 1] = this.elements[i];

        this.elements[index] = element;
        ++this.size;
    }

    public void pop() {
        this.elements[this.size - 1] = null;
        this.size--;
    }

    public void removeAt(final int index) {
        if (this.size > 0) {
            for (int i = index; i < this.size - 1; i++) {
                this.elements[i] = this.elements[i + 1];
            }
        }
        this.elements[this.size - 1] = null;
        --this.size;
    }

    public void set(final int index, E element) {
        this.elements[index] = element;
    }

    public E get(final int index) {
        return (E) this.elements[index];
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.elements[i] = null;
        }
        this.size = 0;
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public int indexOf(E element) {
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.elements[i])) return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            if (i != this.size - 1) {
                sb.append(this.elements[i]);
                sb.append(", ");
            } else
                sb.append(this.elements[i]);
        }
        return sb.toString();
    }
}

