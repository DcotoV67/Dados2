package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        JuegoDados juegoDados = new JuegoDados();
        int opcion = 0;
        int wins = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ELIGE QUE QUIERES HACER:");
        System.out.println("1: Jugar");
        System.out.println("0: Salir");

        opcion = scanner.nextInt();

        if (opcion != 0 && opcion != 1){
            System.out.println("");
            System.out.println("Opción incorrecta");
        }

        while (opcion == 1) {

            if (opcion == 1) {

                juegoDados.jugar();

                if (juegoDados.igual) {

                    wins++;

                }

                if (wins == 0) {

                    System.out.println("No has ganado ninguna partida");
                    System.out.println("");

                }else {

                    System.out.println("¡Has ganado " + wins + " veces!");
                    System.out.println("");

                }

            }

            System.out.println("ELIGE QUE QUIERES HACER:");
            System.out.println("");
            System.out.println("1: Jugar");
            System.out.println("0: Salir");
            System.out.println("");

            opcion = scanner.nextInt();

            if (opcion != 0 && opcion != 1){
                System.out.println("");
                System.out.println("Opción incorrecta");
            }

        }

        System.out.println("¡Has ganado " + wins + " veces!");

    }

}

