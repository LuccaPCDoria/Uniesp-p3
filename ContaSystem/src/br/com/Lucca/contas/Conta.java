package br.com.Lucca.contas;

public class Conta {
    protected int numero;
    protected double saldo;

    public Conta() {
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean saque(double val){
        if (val > 0 && val <= saldo){
            saldo -= val;
            return true;
        }
        return false;
    }
    public boolean deposito(double val){
        if (val > 0){
            saldo += val;
            return true;
        }
        return false;
    }
}
