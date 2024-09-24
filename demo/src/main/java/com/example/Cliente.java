package com.example;
import java.util.ArrayList;

public class Cliente {

    public Cliente(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    private String username;
    private String senha;
    private ArrayList<Voo> bilhetes;

    

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
    
    
}