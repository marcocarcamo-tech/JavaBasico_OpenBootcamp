import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapGenerator {

    /*
    Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
    excepciones, un HashMap y un ArrayList, LinkedList o array.
     */

    /*
    Este programa lee un archivo de texto que contiene palabras. Luego lee las palabras dentro del documento y
    las pasa a un mapa, asignándoles una clave. Finalmente el mapa se imprime a un archivo nuevo indicando la ruta.
     */

    public static void main(String[] args) {

        //Read File
        Character[] fileCharacters = GetFileChars("D:\\Documents\\fichero_prueba\\hola.txt");
        System.out.println(Arrays.toString(fileCharacters));


        //Group characters into words
        groupInWords(fileCharacters);
        List<String> wordsInFile= groupInWords(fileCharacters);

        //Save words in a map and assign them a key
        HashMap<Integer, String> wordsMap = new HashMap<Integer, String>();

        Integer key = 1000;

        for(int i = 0; i < wordsInFile.size(); i++){
            key++;
            wordsMap.put(key, wordsInFile.get(i));
        }

        System.out.println(wordsMap);

        //Print HashMap in external file

        try {
            PrintStream printer = new PrintStream("D:\\Documents\\fichero_prueba\\holaMapa.txt");

            printer.write(String.valueOf(wordsMap).getBytes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static Character[] GetFileChars(String inputPath) {
        Character[] characters = new Character[100];
        try {
            InputStream inputFile = new FileInputStream(inputPath);

            BufferedInputStream inputFileBuffer = new BufferedInputStream(inputFile);

            byte[] data = inputFileBuffer.readAllBytes();

            //Transform into characters
            for (int i = 0; i < data.length; i++) {
                char character = (char) data[i];
                characters[i] = character;
            }
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        return characters;
    }

    public static List groupInWords (Character[] fileCharacters){
        List<String> wordsInFile= new ArrayList<>();

        String word = "";
        for(int i = 0; i < fileCharacters.length; i++){
            if(fileCharacters[i] == null){
                wordsInFile.add(word);
                break;
            } else if (fileCharacters[i] != ' '){
                word += fileCharacters[i];
            } else if (fileCharacters[i] == ' '){
                wordsInFile.add(word);
                word = "";
            }
        }

        System.out.println(wordsInFile);
        return wordsInFile;
    }
}
