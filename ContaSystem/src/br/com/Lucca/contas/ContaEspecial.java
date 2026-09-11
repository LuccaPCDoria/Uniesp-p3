package br.com.Lucca.contas;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoEspecial(){
        return saldo + limite;
    }

    @Override
    public boolean saque(double val){
        if (val > 0 && val <= getSaldoEspecial()){
            saldo -= val;
            return true;
        }
        return false;
    }
}