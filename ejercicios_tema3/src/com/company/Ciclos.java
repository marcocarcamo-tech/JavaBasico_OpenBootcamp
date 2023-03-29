package com.company;

import java.lang.invoke.StringConcatFactory;

public class Ciclos {
    public static void main(String[] args) {
        String[] mensajeArray = {"Hola,", "este", "es", "un", "mensaje", "de", "texto", "en", "un", "array" };
        String mensaje = "";

        for (int i = 0; i < mensajeArray.length; i++) {

            mensaje += mensajeArray[i] + " ";
        }

        System.out.println(mensaje);
    }

}
