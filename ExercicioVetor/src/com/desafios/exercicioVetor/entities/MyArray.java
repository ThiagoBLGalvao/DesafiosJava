package com.desafios.exercicioVetor.entities;

import java.util.Arrays;

public class MyArray {
    private static final Object[] EMPTY_DATA = new Object[0];
    private int size;
    Object[] elementData;
    private int index = 0;

    public MyArray(){
        this.elementData = EMPTY_DATA;
        this.size = 0;
    }
    public MyArray(int initialCapacity) throws IllegalAccessException {
        if(initialCapacity > 0){
            this.elementData = new Object[initialCapacity];
            this.size = initialCapacity;
        }
        else{
            if(initialCapacity != 0){
                throw new IllegalAccessException("This initial capacity: " + initialCapacity + "is illegal ");
            }
            else{
                this.elementData = EMPTY_DATA;
                this.size = initialCapacity;
            }
        }
    }

    public void addValue(int value){
        if(this.size == 0){
            this.size++;
            this.elementData = new Object[this.size];
            this.elementData[index] = value;
            this.index++;
        }
        else{
            this.size = this.size * 2;
            this.elementData = Arrays.copyOf(this.elementData, this.size);
            this.elementData[index] = value;
        }
    }

    public void removeElementByIndex(int indexOf){
        if(indexOf <= this.index && indexOf >= 0){
            this.elementData[indexOf] = null;
        }
        else{
            throw new IllegalArgumentException("Index out of range!");
        }
    }

    public void getAllElements(){
        System.out.println("[");
        for (Object o: this.elementData) {
            System.out.println(o + ",");
        }
        System.out.println("]");
    }
}
