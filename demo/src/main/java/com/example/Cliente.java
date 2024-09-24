package com.example;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private List<Passagem> passagensCompradas;

    public Cliente(String username, String senha) {
        this.username = username;
        this.senha = senha;
        this.passagensCompradas = new ArrayList<>();
    }

    private String username;
    private String senha;
    private ArrayList<Voo> bilhetes;

    

    public List<Passagem> getPassagensCompradas() {
        return passagensCompradas;
    }

    public void setPassagensCompradas(List<Passagem> passagensCompradas) {
        this.passagensCompradas = passagensCompradas;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Voo> getBilhetes() {
        return this.bilhetes;
    }

    public void setBilhetes(ArrayList<Voo> bilhetes) {
        this.bilhetes = bilhetes;
    }

    public void adicionarPassagemComprada(Passagem passagem) {
        passagensCompradas.add(passagem);
    }
    
    
}