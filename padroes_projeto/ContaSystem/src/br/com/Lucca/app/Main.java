package br.com.Lucca.app;

import br.com.Lucca.contas.Conta;
import br.com.Lucca.contas.ContaEspecial;

public class Main{
    public static void main(String[] args) {
        Conta conta = new Conta(101, 500.0);
        System.out.println("Conta comum:");
        System.out.println("Saldo inicial: " + conta.getSaldo());
        System.out.println("Saque de 200: " + conta.saque(200));
        System.out.println("Saldo após saque: " + conta.getSaldo());
        System.out.println("Depósito de 150: " + conta.deposito(150));
        System.out.println("Saldo final: " + conta.getSaldo());

        System.out.println("Digite o saldo da conta: ");

        ContaEspecial contaEspecial = new ContaEspecial( 100.0);
        System.out.println("Conta Especial");
        System.out.println("Saldo inicial: " + contaEspecial.getSaldoEspecial());
        System.out.println("Saque de 200: " + contaEspecial.saque(200));
        System.out.println("Saldo após saque: " + contaEspecial.getSaldo());
        System.out.println("Depósito de 150: " + contaEspecial.deposito(150));
        System.out.println("Saldo final: " + contaEspecial.getSaldo());


    }
}