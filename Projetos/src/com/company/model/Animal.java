package com.company.model;

public class Animal {
    private int codigo = 100;
    private String raca;
    private String sexo;
    private String cor;
    private double peso;
    private String tipo;
    private Consulta  consulta;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Animal(String raca, String sexo, String cor, double peso, String tipo, Consulta consulta) {
        this.codigo++;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
        this.peso = peso;
        this.tipo = tipo;
        this.consulta = consulta;
    }


    /*A lista entra como um metodo, por exemplo: Cadastro uma consulta e ligo ela com o animal X, defino uma lista de consultas
    * para esse animal da seguinte forma:
    * Animal bolinha = new Animal();
    * bolinha.setNome('Bolinha');
    * Consulta consulta = new Consulta();
    * consulta.setAnimal(bolinha);
    *
    * List<Consulta> consultas = new ArrayList<Consulta>();
    * consultas.add(bolinha)
    *
    * Da pra criar um metodo dentro de animal que ele faz esse função usando o this.
    * */
}
