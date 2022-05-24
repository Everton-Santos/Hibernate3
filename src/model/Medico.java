package model;

public class Medico {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "CRM")
	@NotNull
	String CRM;
	
	@Column(name = "nome")
	@NotNull
	String nome;
	
	@Column(name = "telefone_Celular")
	@NotNull
	String telefone_Celular;
	
	@Column(name = "especialidade")
	@NotNull
	String especialidade;
	
	
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone_Celular() {
		return telefone_Celular;
	}
	public void setTelefone_Celular(String telefone_Celular) {
		this.telefone_Celular = telefone_Celular;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
