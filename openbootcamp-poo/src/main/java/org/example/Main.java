package org.example;

public class Main {
    public static void main(String[] args) {

        String coche = "alfa romeo";

//        Coche cocheObj = new Coche();
//
//        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 1430.45, 5.4);
//
//        cocheObj2.acelerar(50);
//
//        System.out.println(cocheObj2);
//
//        cocheObj2.peso = 1350.8;
//
//        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul","toyota","prius", 1000d, 4.99, "ejemplo de motor");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);


    }
}