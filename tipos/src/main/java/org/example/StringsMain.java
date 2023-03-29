package org.example;

public class StringsMain {
    public static void main(String[] args) {
        //La clase String

    /*
            length()
            startsWith()
            endsWith()
            indexOf()
            subString(1,5)
            trim()
            equals()
            compareTo()

     */

        String mensaje = " Hola mundo ";

        System.out.println(mensaje.length());
        String mensajeMayus = mensaje.toUpperCase();
        System.out.println(mensajeMayus);


        String otro = "HOLA MUNDO";
        mensajeMayus = mensajeMayus.trim();

        if(mensajeMayus.equals(otro)){
            System.out.println("verdadero");
        }
    }
}
