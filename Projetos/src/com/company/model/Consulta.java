package com.company.model;

import java.util.Date;

public class Consulta {
    private int codigo = 100;
    private Date dataConsulta;
    private String observacao;
    private Animal animal; //Ou mantem aqui ou mantem no Agendamento.
    private String prontuario;
    private Veterinario veterinario;

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Consulta(Date dataConsulta, String observacao, Animal animal, String prontuario, Veterinario veterinario) {
        this.codigo++;
        this.dataConsulta = dataConsulta;
        this.observacao = observacao;
        this.animal = animal;
        this.prontuario = prontuario;
        this.veterinario = veterinario;
    }
}
