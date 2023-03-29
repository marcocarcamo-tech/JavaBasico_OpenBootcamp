package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List lista = new ArrayList<>();

        List<String> nombres =  new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        nombres.add("Nombre 5");

        System.out.println(nombres);

        //iteración con foreach
        for (String nombre:nombres) {
            System.out.println(nombre);
        }

        //iteración con for
        for (int i=0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }

        List <Coche> coches =  new ArrayList<>();

        coches.add( new Coche("civic"));
        coches.add( new Coche("accord"));
        coches.add( new Coche("prius"));
        coches.add( new Coche("lobo"));
        coches.add( new Coche("spark"));
        coches.add( new Coche("cr-v"));

        System.out.println(coches);

        for (Coche coche: coches) {
            System.out.println(coche);
        }
    }

}
