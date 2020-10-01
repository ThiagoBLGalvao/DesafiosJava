package com.desafios.exercicioVetor;


import com.desafios.exercicioVetor.abstracted.MyArrayAbs;
import com.desafios.exercicioVetor.entities.MyArrayType1;
import com.desafios.exercicioVetor.entities.MyArrayType2;
import com.desafios.exercicioVetor.entities.MyArrayType3;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        MyArrayAbs array3 = new MyArrayType3();

        array3.addValue(123);
        array3.addValue(23);
        array3.addValue(30);
        array3.addValue(42);
        array3.addValue(70);

        array3.getAllElements();

    }
}
