package org.example;

public class TryCatchMain {
    public static void main(String[] args) {

        try {
            int result = 5/0; //Instrucción que podría ser problemática
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
            //Este código se ejecuta siempre
            //Se usa para cierre de recursos
            //Limpiar entorno
        }



        System.out.println("fin"); // A pesar de que el error no se corrija,
        // el programa llegará al final
    }
}
