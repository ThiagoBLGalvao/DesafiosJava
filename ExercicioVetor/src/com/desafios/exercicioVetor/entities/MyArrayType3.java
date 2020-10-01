package com.desafios.exercicioVetor.entities;

import com.desafios.exercicioVetor.abstracted.MyArrayAbs;

import java.util.Arrays;

public class MyArrayType3 extends MyArrayAbs {
    private static final int LIMIT = 15;

    public MyArrayType3(){
        super();
    }
    public MyArrayType3(int initialCapacity) throws IllegalAccessException {
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
                verifySpace();
                this.elementData[this.index] = value;
                this.index++;
            }
            else{
                this.elementData[this.index] = value;
                this.index++;
            }

        }
    }

    private void verifySpace(){
        if(this.size * 2 <= LIMIT){
            growSpaceTwoTimes();
        }else{
            if(this.size + 1 <= LIMIT){
                growSpaceByOne();
            }
            else{
                throw new OutOfMemoryError("Out of memory!!");
            }
        }
    }

    private void growSpaceByOne(){
        this.size++;
        this.elementData = Arrays.copyOf(this.elementData, this.size);
    }

    private void growSpaceTwoTimes(){
        this.size = this.size *  2;
        this.elementData = Arrays.copyOf(this.elementData, this.size);
    }



    public void getAllElements(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MyArrayType3{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
