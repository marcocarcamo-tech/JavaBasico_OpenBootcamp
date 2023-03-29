package com.company;

//continue salta el código subsecuente y va directamente a la siguiente iteración
//break rompe el flujo de la siguiente iteración
public class WhileLoop {
    public static void main(String[] args) {
        boolean check = true;

        int count = 0;
        while(count < 10){
            if(count == 6){
                continue;
            }
            System.out.println("Hola Mundo " + count);
            count++;


        }
        System.out.println("fin");
    }
}
