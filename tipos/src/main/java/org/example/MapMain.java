package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();

        personas.put("01", "Jorge González");
        personas.put("02", "Jaime López");
        personas.put("03", "Luis Gutierrez");

        System.out.println(personas);

        for(String key: personas.keySet()){
            System.out.println(key);
        }

        for(String value: personas.values()){
            System.out.println(value);
        }

        for(Map.Entry<String, String> entry: personas.entrySet()){
            System.out.println(entry);
        }
    }

}
