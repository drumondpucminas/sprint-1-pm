package com.example;

import java.util.ArrayList;

public class Companhia {

    public Companhia(String nome, int codigo, int valorBagagemInicial, int valorBagagemAdicional, int tarifa) {
        this.nome = nome;
        this.codigo = codigo;
        this.valorBagagemInicial = valorBagagemInicial;
        this.valorBagagemAdicional = valorBagagemAdicional;
        this.tarifa = tarifa;
    }




    
    
    public static Companhia encontrarCompanhiaPorCodigo(int codigo, ArrayList<Companhia> arrayCompanhias) {
        for (Companhia companhia : arrayCompanhias) {
            if (companhia.getCodigo() == codigo) {
                return companhia; // Return the found Companhia
            }
        }
        return null; // Return null if no match is found
    }
    
    private String nome;
    private int codigo;
    private int valorBagagemInicial;
    private int valorBagagemAdicional;
    private int tarifa;

    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValorBagagemInicial() {
        return this.valorBagagemInicial;
    }

    public void setValorBagagemInicial(int valorBagagemInicial) {
        this.valorBagagemInicial = valorBagagemInicial;
    }

    public int getValorBagagemAdicional() {
        return this.valorBagagemAdicional;
    }

    public void setValorBagagemAdicional(int valorBagagemAdicional) {
        this.valorBagagemAdicional = valorBagagemAdicional;
    }

    public int getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    

}
