package tech.Luccapcdoria.Pessoa;

import java.security.ProtectionDomain;
import java.time.LocalDate;

public class Cliente extends Pessoa{
    protected String codigo;
    protected String profissao;

    public Cliente(String nome, LocalDate dataNascimento, String endereco, String telsContato, String codigo, String profissao) {
        super(nome, dataNascimento, endereco, telsContato);
        this.codigo = codigo;
        this.profissao = profissao;
    }
}
