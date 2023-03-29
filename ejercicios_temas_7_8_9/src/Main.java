import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        System.out.println(reverse("texto en reversa"));

        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String nombres[] = {"Javier", "Marco", "José", "Regina", "Carmen"};

        for (String nombre: nombres){
            System.out.println(nombre);
        }

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int matriz[][] = {{1 ,2, 3},{4, 5, 6},{7, 8, 9}};

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Valor: " + matriz[i][j] + " posición: ["+i+"]"+"["+j+"]");

            }
        }

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<String> ciudades = new Vector<>();
        System.out.println(ciudades.capacity());


        ciudades.add("Ciudad de México");
        ciudades.add("Nueva York");
        ciudades.add("Tokio");
        ciudades.add("Seul");
        ciudades.add("Sidney");

        ciudades.remove(1);
        ciudades.remove(1);

        System.out.println(ciudades);


        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        /*
        La capacidad por defecto, es de diez valores, por lo que al sobrepasar esta capacidad, se crea una copia del vector y se añaden 10 más a la copia,
        este proceso se repetiría hasta llegar a 1000, en este caso el proceso se repetiría 100 veces, lo cual crearía 100 vectores en memoria,
        haciendo este proceso más lento e ineficiente de lo que debería.
         */

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> platillos =  new ArrayList<>();

        platillos.add("Sushi");
        platillos.add("Enchiladas");
        platillos.add("Fetuccini");
        platillos.add("Curry");

        LinkedList<String> platillos_linked = new LinkedList<>();

        for (String platillo:platillos){
            platillos_linked.add(platillo);
        }

        for(int i = 0; i < platillos.size(); i++){
            System.out.println("ArrayList value: " + platillos.get(i) + "\nLinkedList value: " +platillos_linked.get(i));
        }


        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> numeros =  new ArrayList<>();

        for (int i =0; i <10;i++){
            numeros.add(i+1);
        }
        System.out.println(numeros);

        for (int i =0; i< numeros.size();i++){
            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
                i--;
                continue;
            }
            System.out.println(numeros.get(i));
        }


        //7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".


        try {
            dividePorCero(5);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }


        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

        String ruta_entrada = "D:\\Documents\\fichero_prueba\\hola.txt";
        String ruta_salida = "D:\\Documents\\fichero_prueba\\backup\\hola.txt";

        copiarFichero(ruta_entrada, ruta_salida);

    }
    public static void copiarFichero (String fileIn, String fileOut) {


        try {
            InputStream fichero = new FileInputStream(fileIn);
            PrintStream fichero_copia = new PrintStream(fileOut);

            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            int dato = ficheroBuffer.read();
            fichero_copia.write(dato);
            while(dato != -1){
                System.out.println((char)dato);
                dato = ficheroBuffer.read();
                fichero_copia.write(dato);
            }


        } catch (IOException e) {
            System.out.println("Excepción de entrada y salida: " + e.getMessage());
        }
    }

    public static int dividePorCero (int divisor) throws ArithmeticException{
        int dividendo = 0;
        if(dividendo == 0){
            throw new ArithmeticException("Esto no puede hacerse");
        }
        int division = divisor/dividendo;

        return division;
    }
    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    public static String reverse (String texto) {
        String reversedText = "";
        for (int i = 0; i < texto.length(); i++){
            char current = texto.charAt(i);
            reversedText = current + reversedText;
        }

        return reversedText;
    }
}