package com.company.controller;
import com.company.model.Consulta;

public interface Cadastro {
    void cadastraConsulta (Consulta consulta);
    void removeConsulta (Consulta consulta);
    void atualizaConsulta (Consulta consulta);
}
