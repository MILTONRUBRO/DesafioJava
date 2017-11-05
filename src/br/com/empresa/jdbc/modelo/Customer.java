package br.com.empresa.jdbc.modelo;

//JavaBean para representar a entidade do banco

public class Customer {
	
	private long id;
	private String nome;
	private long cpf_cnpj;
	private boolean is_active;
	private double vl_total;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(long cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public double getVl_total() {
		return vl_total;
	}
	public void setVl_total(double vl_total) {
		this.vl_total = vl_total;
	}

}
