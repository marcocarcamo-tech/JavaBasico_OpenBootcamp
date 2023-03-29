package com.company;

public class PrecioMain {
    public static void main(String[] args) {

        Double cantidad = 100d;
        System.out.println("El precio con iva incluido es de: $" + cantidad  + " es de $ "+ getPrecioConIva(cantidad));

    }

    public static double getPrecioConIva(Double precio) {

        //Suponiendo un iva del 16%
        Double iva = precio * 0.16;
        return precio + iva;
    }
}
