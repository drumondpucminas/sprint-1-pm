package com.example;

public class Aeroporto {
    private String nome;
    private String sigla;  // 3 letras
    private String cidade;
    private String estado;
    private String pais;

    // Construtor
    public Aeroporto(String nome, String sigla, String cidade, String estado, String pais) {
        this.nome = nome;
        this.sigla = validarSigla(sigla) ? sigla : "Sigla inválida";
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        if (validarSigla(sigla)) {
            this.sigla = sigla;
        } else {
            System.out.println("Sigla inválida! Deve ter 3 letras.");
        }
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Validação da sigla
    private boolean validarSigla(String sigla) {
        return sigla != null && sigla.matches("[A-Z]{3}");
    }

    // Exibir informações do aeroporto
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sigla: " + sigla);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("País: " + pais);
    }
}

