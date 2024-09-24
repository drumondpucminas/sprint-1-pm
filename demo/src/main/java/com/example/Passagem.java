package com.example;

import java.util.List;

public class Passagem {
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;
    private Companhia companhia;
    private int bagagemAdicional = companhia.getValorBagagemAdicional();
    private int bagagemInicial = companhia.getValorBagagemInicial();
    private String data;
    private String codigoVoo;
    private String horario;
    private int tarifaBasica;
    private int tarifaBusiness;
    private int tarifaPremium;
    private String moeda = "BRL";
    private double taxaAgencia;
    private List<Voo> voos;

    public Passagem(Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino, String data, String horario, String codigoVoo, Companhia companhia, int tarifaBasica, int tarifaBusiness, int tarifaPremium, int bagagemInicial, int bagagemAdicional, double taxaAgencia, String moeda) {
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.data = data;
        this.horario = horario;
        this.codigoVoo = codigoVoo;
        this.companhia = voos.get(0).getCompanhiaByVoo();
        this.tarifaBasica = tarifaBasica;
        this.tarifaBusiness = tarifaBusiness;
        this.tarifaPremium = tarifaPremium;
        this.bagagemInicial = bagagemInicial;
        this.bagagemAdicional = bagagemAdicional;
        this.taxaAgencia = taxaAgencia;
        this.moeda = moeda;
    }

    public Aeroporto getAeroportoOrigem() {
        return aeroportoOrigem;
    }
    public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }
    public Aeroporto getAeroportoDestino() {
        return aeroportoDestino;
    }
    public void setAeroportoDestino(Aeroporto aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }
    public Companhia getCompanhia() {
        return companhia;
    }
    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCodigoVoo() {
        return codigoVoo;
    }
    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public int getTarifaBasica() {
        return tarifaBasica;
    }
    public void setTarifaBasica(int tarifaBasica) {
        this.tarifaBasica = tarifaBasica;
    }
    public int getTarifaBusiness() {
        return tarifaBusiness;
    }
    public void setTarifaBusiness(int tarifaBusiness) {
        this.tarifaBusiness = tarifaBusiness;
    }
    public int getTarifaPremium() {
        return tarifaPremium;
    }
    public void setTarifaPremium(int tarifaPremium) {
        this.tarifaPremium = tarifaPremium;
    }
    public String getMoeda() {
        return moeda;
    }
    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }
    public int getBagagemAdicional() {
        return bagagemAdicional;
    }

    public void setBagagemAdicional(int bagagemAdicional) {
        this.bagagemAdicional = bagagemAdicional;
    }

    public int getBagagemInicial() {
        return bagagemInicial;
    }

    public void setBagagemInicial(int bagagemInicial) {
        this.bagagemInicial = bagagemInicial;
    }

    public double getTaxaAgencia() {
        return taxaAgencia;
    }

    public void setTaxaAgencia(double taxaAgencia) {
        this.taxaAgencia = taxaAgencia;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Voo voo : voos) {
            valorTotal += voo.getTarifa();
        }
        return valorTotal;
    }

    public double calcularRemuneracaoAgencia(String classePassagem) {
        double valorTarifa = 0.0;
        switch (classePassagem.toLowerCase()) {
            case "basica":
                valorTarifa = this.tarifaBasica;
                break;
            case "business":
                valorTarifa = this.tarifaBusiness;
                break;
            case "premium":
                valorTarifa = this.tarifaPremium;
                break;
            default:
                break;
        }

        double remuneracao = valorTarifa * this.taxaAgencia;
        return remuneracao;
    }

    public void comprarPassagem(Cliente cliente, String classePassagem) {
        double valorTotal = calcularValorTotal();
        
        double remuneracao = calcularRemuneracaoAgencia(classePassagem);
        
        System.out.println("Compra de passagem realizada com sucesso para: " + cliente.getUsername());
        System.out.println("Classe da passagem: " + classePassagem);
        System.out.println("Valor total: " + valorTotal + " " + moeda);
        System.out.println("Remuneração da agência: " + remuneracao + " " + moeda);

        cliente.adicionarPassagemComprada(this);
    }

    public void emitirBilhete(Cliente cliente, String documento) {
        if(moeda.equalsIgnoreCase("$") && moeda.equalsIgnoreCase("€")) {
            System.out.println("Bilhete emitido para : " + cliente.getUsername() + " com o Passaporte :  " + documento);
            System.out.println("Origem: " + aeroportoOrigem + " - Destino: " + aeroportoDestino);
            System.out.println("Valor total da passagem: " + calcularValorTotal() + " " + moeda);
        } else {
            System.out.println("Bilhete emitido para " + cliente.getUsername() + " com o RG/CPF :  " + documento);
            System.out.println("Origem: " + aeroportoOrigem + " - Destino: " + aeroportoDestino);
            System.out.println("Valor total da passagem: " + calcularValorTotal() + " " + moeda);
        }    
    }
}

