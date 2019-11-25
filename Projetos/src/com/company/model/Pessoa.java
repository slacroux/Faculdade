package com.company.model;

//import java.util.Date;

public class Pessoa {
    /* Atributos */
	private String nome;
    private String sobrenome;
    private String sexo;
    private String cfp;
    private String dataNascimento;
    private Endereco endereco;

    /* Construtor */
    public Pessoa(String nome, String sobrenome, String sexo, 
    		String cfp, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.cfp = cfp;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
    
    /* Setters/Getters */
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    

}