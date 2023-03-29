package org.example;
// Las clases abstractas nos permiten definir parámetros y métodos pero no podemos instanciarla,
//Podemos pensarlas como clases que están incompletas y por ende no tiene sentido instanciarlas
//Se completan en las clases hijas y solo pueden instalarse las clases hijas
public abstract class Coche {

    //atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;
    //constructores

    public Coche(){}
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }



    //comportamiento
    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120){
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
