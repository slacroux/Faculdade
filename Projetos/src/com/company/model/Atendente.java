package com.company.model;

import java.util.Date;

public class Atendente extends Funcionario {

    public Atendente(String cargo, Date dataAdmissao, Date dataDemissao) {
        super(cargo, dataAdmissao, dataDemissao);
    }

    public Atendente(String cargo, Date dataAdmissao) {
        super(cargo, dataAdmissao);
    }
}

