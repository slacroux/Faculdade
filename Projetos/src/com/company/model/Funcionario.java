package com.company.model;

//import java.util.Date;

/* Transformar em abstract */
public class Funcionario extends Pessoa {
	/* Atributos */
	private int codigo = 100;
    private String cargo;
    private String dataAdmissao;// TODO: Arrumar de String para Data depois do ajuste de conversão
    private String dataDemissao;// TODO: Arrumar de String para Data depois do ajuste de conversão

    /* Construtores */
    public Funcionario() {
    	super();
    }
    
    public Funcionario(Pessoa pes, String cargo, String dataAdmissao, String dataDemissao) {
		super(pes.getNome(), pes.getSobrenome(), pes.getSexo(), 
	    		pes.getCfp(), pes.getDataNascimento(), pes.getEndereco());
		this.codigo = hashCode(); // TODO: Descobrir se isso esta certo mesmo
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
	}
    
    public Funcionario(String cargo, String dataAdmissao, String dataDemissao) {
        this.codigo++;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }
    
	Funcionario(String cargo, String dataAdmissao) {
        this.codigo++;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }
    
    /* Getters/Setters */
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

	// TODO: Acho que não precisa de todos os atributos pra gerar o Hascode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((dataAdmissao == null) ? 0 : dataAdmissao.hashCode());
		result = prime * result + ((dataDemissao == null) ? 0 : dataDemissao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (codigo != other.codigo)
			return false;
		if (dataAdmissao == null) {
			if (other.dataAdmissao != null)
				return false;
		} else if (!dataAdmissao.equals(other.dataAdmissao))
			return false;
		if (dataDemissao == null) {
			if (other.dataDemissao != null)
				return false;
		} else if (!dataDemissao.equals(other.dataDemissao))
			return false;
		return true;
	}
    
	// TODO: Criar método herdado em Atendente e Veterinário
    public void atende() {
    	
    }
	
}
