package com.company;

public class SmartWatch extends SmartDevice{

    private String forma;

    private boolean acelerómetro;

    //constructores

    public SmartWatch(){};

    public SmartWatch(String marca, String modelo, Double precio, String forma, boolean acelerómetro) {
        super(marca, modelo, precio);
        this.forma = forma;
        this.acelerómetro = acelerómetro;
    }

    //getters y setters

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public boolean isAcelerómetro() {
        return acelerómetro;
    }

    public void setAcelerómetro(boolean acelerómetro) {
        this.acelerómetro = acelerómetro;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", precio=" + getPrecio() + '\'' +
                ", forma='" + forma + '\'' +
                ", acelerómetro=" + acelerómetro +
                '}';
    }
}
