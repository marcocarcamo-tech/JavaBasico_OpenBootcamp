package com.company;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD= new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado patricia = new Empleado("Patricia", 30, 40000, true);
        Empleado roberto = new Empleado("Roberto", 30, 40000, true);

        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(patricia);
        empleadoCRUD.guardar(roberto);


        System.out.println(empleadoCRUD.findAll());

    }
}