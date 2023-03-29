package com.company;

public class SmartPhone extends SmartDevice{

    private int cantidadMemoria;

    private int numCamaras;

    //constructores

    public SmartPhone (){

    }

    public SmartPhone(String marca, String modelo, Double precio, int cantidadMemoria, int numCamaras) {
        super(marca, modelo, precio);
        this.cantidadMemoria = cantidadMemoria;
        this.numCamaras = numCamaras;
    }

    //getters y setters

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public int getNumCamaras() {
        return numCamaras;
    }

    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", precio=" + getPrecio() + '\'' +
                ", cantidadMemoria=" + cantidadMemoria +
                ", numCamaras=" + numCamaras +
                '}';
    }
}
