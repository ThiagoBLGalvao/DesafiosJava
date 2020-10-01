package com.desafios.exercicioVetor.entities;

import java.util.Arrays;

public class MyArrayType3 {
    private static final Object[] EMPTY_DATA = new Object[0];
    private int size;
    Object[] elementData;
    private int index = 0;

    public MyArrayType3(){
        this.elementData = EMPTY_DATA;
        this.size = 0;
    }
    public MyArrayType3(int initialCapacity) throws IllegalAccessException {
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
            this.elementData[this.index] = value;
            this.index++;
        }
        else{
            if(this.index == this.size){
                this.size = (int) this.size + (this.size /  2);
                this.elementData = Arrays.copyOf(this.elementData, this.size);
                this.elementData[this.index] = value;
                this.index++;
            }
            else{
                this.elementData[this.index] = value;
                this.index++;
            }

        }
    }

    public void removeElementByIndex(int indexOf){
        if(indexOf <= this.index && indexOf >= 0){
            for(int i = indexOf; i < this.index; i++ ){
                this.elementData[i] = this.elementData[i + 1];
            }
            this.index--;

        }
        else{
            throw new IllegalArgumentException("Index out of range!");
        }
    }

    public void getAllElements(){
        System.out.println(toString());
        ;
    }

    public void getElementeByIndex(int indexOf){
        if(indexOf < this.size){
            System.out.println(this.elementData[indexOf]);
        }
        else{
            System.out.println("Index out of range!");
        }
    }

    @Override
    public String toString() {
        return "MyArrayType2{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
