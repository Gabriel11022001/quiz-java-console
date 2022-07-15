package br.com.gabriel.quiz.classes;

public class Alternativa {

	private String alternativa;
	private Boolean selecionouEssa;
	
	public Alternativa() {}
	public Alternativa(String alternativa, Boolean selecionouEssa) {
		this.alternativa = alternativa;
		this.selecionouEssa = selecionouEssa;
	}
	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
	public String getAlternativa() {
		return this.alternativa;
	}
	public Boolean getSelecionouEssa() {
		return this.selecionouEssa;
	}
	public void setSelecionouEssa(Boolean selecionouEssa) {
		this.selecionouEssa = selecionouEssa;
	}
}
