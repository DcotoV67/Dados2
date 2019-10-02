package com.company;

import java.util.Random;

public class Dado {

    int valor;
    Random random = new Random();

    void tirar(){

        valor = random.nextInt(6) +1;

    }

    void imprimir(){

        System.out.println("Ha salido un: " + valor);

    }
}
