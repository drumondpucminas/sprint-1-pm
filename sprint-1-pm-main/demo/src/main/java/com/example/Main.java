package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Companhia Azul = new Companhia("Azul", "1391021981", "Moreira", 150, 50, 3000);
        Companhia Gol = new Companhia("Gol","213123121", "Arthur", 150, 50, 3000);

        ArrayList<Companhia> arrayCompanhias = new ArrayList<Companhia>();
        arrayCompanhias.add(Azul);
        arrayCompanhias.add(Gol);
        Companhia searched = Companhia.encontrarCompanhiaPorNome("Gol", arrayCompanhias);
        System.out.println(searched.getNome());


        Voo saoPaulo = new Voo(5362, "14:00", "15:00", "20/07/2024", Azul);

    }
}