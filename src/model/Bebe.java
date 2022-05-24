package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "bebe_medico")
	@NotNull
	String cpf;
	
	@Column(name = "nome")
	@NotNull
	String nome;
	
	@Column(name = "dataNascimento")
	@NotNull
	LocalDate dataNascimento;
	
	@Column(name = "peso")
	@NotNull
	double peso;
	
	@Column(name = "altura")
	@NotNull
	double altura;
	
	@Column(name = "nomeMae")
	@NotNull
	String nomeMae;
	
	@Column(name = "nomeMedico")
	@NotNull
	String nomeMedico;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	
	
}
