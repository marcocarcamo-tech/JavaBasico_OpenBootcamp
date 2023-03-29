package com.company;

public class Funciones {

    public static void main(String[] args) {

        //Invocación de la función
        holaMundo("Marco");
        holaMundo("Willy");

        String hola = devolverHolaMundo();
        System.out.println(hola);

    }

    //Definición de una función estática
    /*
    Modificadores
    Private: nos indica que una función solo es accesible desde la clase en la que
    que se encuentra definida

    Protected: Solo las clases que sean hijas o que estén en el mismo paquete, podrán acceder a la función
     */

    //Sobrecarga de métodos: aplicamos sobrecarga a la función holaMundo

    private static void holaMundo(){
        System.out.println("Hola mundo!!! ");
    }
    private static void holaMundo(String name){
        System.out.println("Hola " + name);
    }

    private static String devolverHolaMundo(){

        return "Hola Mundo desde función devolverHolaMundo";
    }

    private static int sum (int num1, int num2) {

        return num1 + num2;
    }

}
