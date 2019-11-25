package com.company.model;

// import java.util.Date;

public class Veterinario extends Funcionario {
    /* Atributos */
	private String email;
    private String telefoneEmergencia;
    private String crmv;

    /* Construtor */
    public Veterinario() {
    	super();
    }
    
    public Veterinario(Pessoa pessoa, Funcionario func, String email, String telefoneEmergencia,
			String crmv) {
    	super(pessoa, func.getCargo(), func.getDataAdmissao(), func.getDataDemissao());
		this.email = email;
		this.telefoneEmergencia = telefoneEmergencia;
		this.crmv = crmv;
	}

//	public Veterinario(String cargo, Date dataAdmissao, Date dataDemissao) {
//        super(cargo, dataAdmissao, dataDemissao);
//    }
//
//    public Veterinario(String cargo, Date dataAdmissao) {
//        super(cargo, dataAdmissao);
//    }
    
    /* Setters/Getters */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(String telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    
}
