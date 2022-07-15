package br.com.gabriel.quiz.classes;

public class Pergunta {

	private String pergunta;
	private Alternativa alternativaA;
	private Alternativa alternativaB;
	private AlternativaCorreta alternativaCorreta;
	private Double quantosPontosVale;
	private Boolean acertou;
	
	public Pergunta() {}
	public Pergunta(String pergunta, Alternativa alternativaA, Alternativa alternativaB, AlternativaCorreta alternativaCorreta, Double quantosPontosVale, Boolean acertou) {
		this.pergunta = pergunta;
		this.alternativaA = alternativaA;
		this.alternativaB = alternativaB;
		this.alternativaCorreta = alternativaCorreta;
		this.quantosPontosVale = quantosPontosVale;
		this.acertou = acertou;
	}
	public String getPergunta() {
		return this.pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public Alternativa getAlternativaA() {
		return this.alternativaA;
	}
	public void setAlternativaA(Alternativa alternativaA) {
		this.alternativaA = alternativaA;
	}
	public Alternativa getAlternativaB() {
		return this.alternativaB;
	}
	public void setAlternativaB(Alternativa alternativaB) {
		this.alternativaB = alternativaB;
	}
	public AlternativaCorreta getAlternativaCorreta() {
		return this.alternativaCorreta;
	}
	public void setAlternativaCorreta(AlternativaCorreta alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
	public Double getQuantosPontosVale() {
		return this.quantosPontosVale;
	}
	public void setQuantosPontosVale(Double quantosPontosVale) {
		this.quantosPontosVale = quantosPontosVale;
	}
	public Boolean getAcertou() {
		return this.acertou;
	}
	public void setAcertou(Boolean acertou) {
		this.acertou = acertou;
	}
}
