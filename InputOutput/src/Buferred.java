import java.io.*;

public class Buferred {

    public static void main(String[] args) {
        try {
            InputStream archivo = new FileInputStream("D:\\Documents\\fichero_prueba\\hola.txt");
            BufferedInputStream archivoBuffer = new BufferedInputStream(archivo);// leemos indirectamente el contenido del archivo


            int dato = archivoBuffer.read();
            while(dato != -1){
                System.out.println(((char)dato));
                dato = archivoBuffer.read();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error, de archivo no encontrado: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Error de IO: " + e.getMessage());
        }
    }
}
