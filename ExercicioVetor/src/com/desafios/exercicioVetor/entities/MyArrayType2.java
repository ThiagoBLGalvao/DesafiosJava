package com.desafios.exercicioVetor.entities;

import com.desafios.exercicioVetor.abstracted.MyArrayAbs;

import java.util.Arrays;

public class MyArrayType2 extends MyArrayAbs {

    public MyArrayType2(int initialCapacity) throws IllegalAccessException {
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
                this.size = (int) (this.size + (this.size * 0.5));
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

    @Override
    public void getAllElements(){
        System.out.println(toString());
        ;
    }



    @Override
    public String toString() {
        return "MyArrayType2{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
