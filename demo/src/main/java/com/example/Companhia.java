package com.example;

import java.util.ArrayList;

public class Companhia {

    public Companhia(String nome, String cnpj, String razaoSocial,  int valorBagagemInicial, int valorBagagemAdicional, int tarifa) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.valorBagagemInicial = valorBagagemInicial;
        this.valorBagagemAdicional = valorBagagemAdicional;
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        // 
        return "Companhia: " +nome+" CNPJ: "+cnpj;
    }
    
    
    private String nome;
    private String cnpj;
    private String razaoSocial;
    private int valorBagagemInicial;
    private int valorBagagemAdicional;
    private int tarifa;

    public static Companhia encontrarCompanhiaPorNome(String nome, ArrayList<Companhia> arrayCompanhias) {
        for (Companhia companhia : arrayCompanhias) {
            if (companhia.getNome().equalsIgnoreCase(nome)) {
                return companhia; // Return the found Companhia
            }
        }
        return null; // Return null if no match is found
    }

    

    

    public String getNome() {
        return this.nome;
    }

    
    public String getRazaoSocial () {
        return this.razaoSocial;
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
