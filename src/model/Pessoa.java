package model;

import java.sql.Date;

public class Pessoa {
	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private String uf;
	private String telefone;
	private EstadoCivilEnum estadoCivil;
	private Date dataNascimento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public EstadoCivilEnum getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", uf=" + uf
				+ ", telefone=" + telefone + ", estadoCivil=" + estadoCivil + ", dataNascimento=" + dataNascimento
				+ "]";
	}
	
	
	
	
}
