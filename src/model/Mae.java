package model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public class Mae {

	@Id
	@ManyToOne
	@JoinColumn(name = "id_Mae")
	@NotNull
	Integer id_Mae;
	
	@Column(name = "nome")
	@NotNull
	String nome;
	
	@Column(name = "logradouro_Endereco")
	@NotNull
	String logradouro_Endereco;
	
	@Column(name = "numero_Endereco")
	@NotNull
	Integer numero_Endereco;
	
	@Column(name = "cep_Endereco")
	@NotNull
	String cep_Endereco;
	
	@Column(name = "complemento_Endereco")
	@NotNull
	String complemento_Endereco;
	
	@Column(name = "telefone")
	@NotNull
	String telefone;
	
	@Column(name = "data_nasc")
	@NotNull
	Date data_nasc;
	
	
	public Integer getId_Mae() {
		return id_Mae;
	}
	public void setId_Mae(Integer id_Mae) {
		this.id_Mae = id_Mae;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro_Endereco() {
		return logradouro_Endereco;
	}
	public void setLogradouro_Endereco(String logradouro_Endereco) {
		this.logradouro_Endereco = logradouro_Endereco;
	}
	public Integer getNumero_Endereco() {
		return numero_Endereco;
	}
	public void setNumero_Endereco(Integer numero_Endereco) {
		this.numero_Endereco = numero_Endereco;
	}
	public String getCep_Endereco() {
		return cep_Endereco;
	}
	public void setCep_Endereco(String cep_Endereco) {
		this.cep_Endereco = cep_Endereco;
	}
	public String getComplemento_Endereco() {
		return complemento_Endereco;
	}
	public void setComplemento_Endereco(String complemento_Endereco) {
		this.complemento_Endereco = complemento_Endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	
}
