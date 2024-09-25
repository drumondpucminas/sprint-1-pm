package com.example;

public class Funcionario {
    private String nome;
    private String cpf;
    private String email;
    private String login;
    private String senha;

    // Construtor
    public Funcionario(String nome, String cpf, String email, String login, String senha) {
        this.nome = nome;
        this.cpf = validarCpf(cpf) ? cpf : "CPF inválido";
        this.email = validarEmail(email) ? email : "Email inválido";
        this.login = login;
        this.senha = senha;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (validarCpf(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido!");
        }
    }

    public void setEmail(String email) {
        if (validarEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email inválido!");
        }
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Validação de CPF
    private boolean validarCpf(String cpf) {
        // Validação simples de CPF (apenas verifica se tem 11 dígitos)
        return cpf != null && cpf.matches("\\d{11}");
    }

    // Validação de Email
    private boolean validarEmail(String email) {
        // Validação simples de email usando regex
        return email != null && email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

    // Validação de login
    public boolean validarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    // Exibição dos dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Login: " + login);
    }
}

