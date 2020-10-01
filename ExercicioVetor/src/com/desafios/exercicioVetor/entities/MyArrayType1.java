package com.desafios.exercicioVetor.entities;

import com.desafios.exercicioVetor.abstracted.MyArrayAbs;

import java.util.Arrays;

public class MyArrayType1 extends MyArrayAbs {


    public MyArrayType1(){
        super();
    }

    public MyArrayType1(int initialCapacity) throws IllegalAccessException {
        super(initialCapacity);
    }

    @Override
    public void addValue(int value){
        if(this.size == 0){
            this.size++;
            this.elementData = new Object[this.size];
            this.elementData[this.index] = value;
            this.index++;
        }
        else{
            if(this.index == this.size){
                this.size = this.size * 2;
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


    @Override
    public void getAllElements(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MyArrayType1{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
