package br.com.Lucca.contas;

public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;

    public ContaInvestimento() {
    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    // Metodo para calcular o rendimento
    public double calcularRendimento() {
        return saldo * (taxa / 100) * prazo;
    }

    // Metodo para calcular o saldo após o investimento
    public double saldoComRendimento() {
        return saldo + calcularRendimento();
    }


    public boolean investir(double valor) {
        return deposito(valor);
    }


    public boolean resgatar(double valor) {
        return saque(valor);
    }
}