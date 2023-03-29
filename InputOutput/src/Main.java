import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    //La clase input stream, se refiere a un constante flujo de datos.
    //Es una clase abstracta que declara los métodos para leer datos desde una fuente concreta
    //Es la clase base de la mayor parte de los flujos de entrada en java.io
    public static void main(String[] args) {

        try {
            InputStream archivo = new FileInputStream("D:\\Documents\\fichero_prueba\\hola.txt");

            byte[] datos = archivo.readAllBytes();
            String textoArchivo = "";
            for (byte dato:datos
                 ) {

                char datoChar = (char) dato;
                System.out.println(datoChar);
                textoArchivo+=datoChar;
            }
            System.out.println(textoArchivo);


        } catch (FileNotFoundException e) {
            System.out.println("Error, de archivo no encontrado: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Error de IO: " + e.getMessage());
        }



    }
}