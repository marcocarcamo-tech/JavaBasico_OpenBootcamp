package org.example;

import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {

        //Capturamos una excepción con try catch
        try{
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }


    /**
     * Método que lee nombres de consola y verifica que tengan longitud igual o mayor que 8
     * caracteres
     * @throws NameFormatException
     */
    private static void leerNombres() throws NameFormatException
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()){
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() <= 8) {
                teclado.close();
                //Creamos nuevo objeto y lo lanzamos
                //El objeto es una excepción
                throw new NameFormatException("El nombre debe contener mínimo 8 caracteres");
            }
        }
        teclado.close();
    }
}
