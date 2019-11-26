package com.company.model;

public class Atendente extends Funcionario {

	public String turno;	
	
	/* Construtor */
	public Atendente(Pessoa pes, String cargo, String dataAdmissao, String dataDemissao, String turno) {
		super(pes, cargo, dataAdmissao, dataDemissao);
		this.turno = turno;
	}
	
	
//	public Atendente(String cargo, Date dataAdmissao, Date dataDemissao) {
//        super(cargo, dataAdmissao, dataDemissao);
//    }
//
//    public Atendente(String cargo, Date dataAdmissao) {
//        super(cargo, dataAdmissao);
//    }
    
	

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
    
	public void realizaAgendamento() {
    	
    }
	
	public void atende() {
		
	}
	
}

