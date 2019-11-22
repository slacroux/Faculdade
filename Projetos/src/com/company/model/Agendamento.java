package com.company.model;

import java.util.Date;

public class Agendamento {
    private int codigo = 100;
    private Date dataAgendamento;
    private Atendente  atendente;
    private Consulta consulta;
    private Animal animal;

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Agendamento(Date dataAgendamento, Atendente atendente, Consulta consulta, Animal animal) {
        this.codigo++;
        this.dataAgendamento = dataAgendamento;
        this.atendente = atendente;
        this.consulta = consulta;
        this.animal = animal;
    }


}
