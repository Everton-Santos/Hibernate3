package model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public class Residente {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "medicoCRM")
	@NotNull
	String medicoCRM;
	
	@Column(name = "instituicao_Ensino")
	@NotNull
	String instituicao_Ensino;
	
	@Column(name = "ano_Ingresso")
	@NotNull
	Integer ano_Ingresso;
	
	
	public String getMedicoCRM() {
		return medicoCRM;
	}
	public void setMedicoCRM(String medicoCRM) {
		this.medicoCRM = medicoCRM;
	}
	public String getInstituicao_Ensino() {
		return instituicao_Ensino;
	}
	public void setInstituicao_Ensino(String instituicao_Ensino) {
		this.instituicao_Ensino = instituicao_Ensino;
	}
	public Integer getAno_Ingresso() {
		return ano_Ingresso;
	}
	public void setAno_Ingresso(Integer ano_Ingresso) {
		this.ano_Ingresso = ano_Ingresso;
	}
	
	

}
