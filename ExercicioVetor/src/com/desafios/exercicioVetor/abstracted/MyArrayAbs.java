package com.desafios.exercicioVetor.abstracted;

public abstract class MyArrayAbs {
    protected static final Object[] EMPTY_DATA = new Object[0];
    protected int size = 0;
    protected Object[] elementData;
    protected int index = 0;

    public MyArrayAbs(){
        this.elementData = EMPTY_DATA;
    }
    public MyArrayAbs(int initialCapacity) throws IllegalAccessException {
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

    public abstract void getAllElements();

    public abstract void addValue(int value);

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

    public void getElementeByIndex(int indexOf){
        if(indexOf < this.size){
            System.out.println(this.elementData[indexOf]);
        }
        else{
            System.out.println("Index out of range!");
        }
    }
}
