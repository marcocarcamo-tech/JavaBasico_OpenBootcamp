package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Asignación con la instrucción new
        int[] notas = new int[10];

        //Asignación directa
        int[] notas2 = {8,10,5,9,8,7,5,6};

        //Modificando una posición
        notas[0] = 8;
        notas[1] = 9;


        //leer el valor y mostrar en pantalla
        System.out.println(notas[0]);

        Arrays.sort(notas);
        //Recorrer array
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        //recorrer con foreach

        for (int item:notas2){
            System.out.println(item);
        }


        System.out.println(Arrays.binarySearch(notas, 8));

    }
}