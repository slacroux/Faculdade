package com.company.model;

import java.util.Date;

public class Funcionario {
    private int codigo = 100;
    private String cargo;
    private Date dataAdmissao;
    private Date dataDemissao;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }


    Funcionario(String cargo, Date dataAdmissao, Date dataDemissao) {
        this.codigo++;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }

    Funcionario(String cargo, Date dataAdmissao) {
        this.codigo++;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }
}
