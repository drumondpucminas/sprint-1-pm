package com.example;

public class Voo {

    public Voo(int numero, String horarioPartida, String horarioChegada, String data, Companhia companhia) {
        this.companhia = companhia;
        this.numero = numero;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.data = data;
    }
    public Companhia companhia;
    private int numero;
    private String horarioPartida;
    private String horarioChegada;
    private String data;

    public int getTarifa() {
        return companhia.getTarifa();
    }
    
    public Companhia getCompanhiaByVoo() {
        return this.companhia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getHorarioPartida() {
        return this.horarioPartida;
    }

    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getHorarioChegada() {
        return this.horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
   

    
}