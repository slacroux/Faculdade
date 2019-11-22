package com.company.model;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String cfp;
    private Date dataNascimento;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa(String nome, String sobrenome, String sexo, String cfp, Date dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.cfp = cfp;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

}