package com.company;

public class JuegoDados {

    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    Dado dado3 = new Dado();

    boolean igual = false;

    public boolean jugar () {

        dado1.tirar();
        dado2.tirar();
        dado3.tirar();

        System.out.println("");
        dado1.imprimir();
        dado2.imprimir();
        dado3.imprimir();
        System.out.println("");

        if ( dado1.valor == dado2.valor && dado1.valor == dado3.valor){

            igual = true;

        }else {

            igual = false;

        }

        return igual;

    }
}
