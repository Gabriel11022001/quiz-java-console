import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.gabriel.quiz.classes.Alternativa;
import br.com.gabriel.quiz.classes.AlternativaCorreta;
import br.com.gabriel.quiz.classes.Pergunta;

public class Programa {

	public static void apresentarMensagemBrasil() {
		System.out.println("*********       **********          ********              ***********        *         *");
		System.out.println("*         *     *        *         *        *             *                  *         *");
		System.out.println("*        *      *        *        *          *            *                  *         *");
		System.out.println("*********       **********       **************           ***********        *         *");
		System.out.println("*********       *               *              *                    *        *         *");
		System.out.println("*        *      * *            *                *                   *        *         *");
		System.out.println("*         *     *  *          *                  *                  *        *         *");
		System.out.println("*********       *   *        *                    *       ***********        *         *********");
	}
	public static void definirPerguntas(List<Pergunta> perguntas) {
		// Definindo as questões
		Pergunta pergunta1 = new Pergunta();
		Pergunta pergunta2 = new Pergunta();
		Pergunta pergunta3 = new Pergunta();
		Pergunta pergunta4 = new Pergunta();
		Pergunta pergunta5 = new Pergunta();
		// Definindo pontuação para as questões
		pergunta1.setQuantosPontosVale(100.0);
		pergunta2.setQuantosPontosVale(100.0);
		pergunta3.setQuantosPontosVale(200.0);
		pergunta4.setQuantosPontosVale(300.0);
		pergunta5.setQuantosPontosVale(100.0);
		// Definindo as perguntas
		pergunta1.setPergunta("Quem foi o Primeiro Presidente do Brasil?");
		pergunta2.setPergunta("Quantos presidentes o Brasil já teve?");
		pergunta3.setPergunta("Quantos estados tem o Brasil?");
		pergunta4.setPergunta("Qual é o lema do Brasil?");
		pergunta5.setPergunta("Em que ano o Brasil se tornou independente?");
		// Definindo as alternativas
		pergunta1.setAlternativaA(new Alternativa("Deodoro da Fonseca", false));
		pergunta1.setAlternativaB(new Alternativa("Prudente de Moraes", false));
		pergunta2.setAlternativaA(new Alternativa("145", false));
		pergunta2.setAlternativaB(new Alternativa("38", false));
		pergunta3.setAlternativaA(new Alternativa("23", false));
		pergunta3.setAlternativaB(new Alternativa("26", false));
		pergunta4.setAlternativaA(new Alternativa("Ordem e Progresso", false));
		pergunta4.setAlternativaB(new Alternativa("Bondade e Justiça", false));
		pergunta5.setAlternativaA(new Alternativa("1822", false));
		pergunta5.setAlternativaB(new Alternativa("1923", false));
		// Definindo as respostas corretas
		pergunta1.setAlternativaCorreta(new AlternativaCorreta(pergunta1.getAlternativaB().getAlternativa()));
		pergunta2.setAlternativaCorreta(new AlternativaCorreta(pergunta2.getAlternativaB().getAlternativa()));
		pergunta3.setAlternativaCorreta(new AlternativaCorreta(pergunta3.getAlternativaB().getAlternativa()));
		pergunta4.setAlternativaCorreta(new AlternativaCorreta(pergunta4.getAlternativaA().getAlternativa()));
		pergunta5.setAlternativaCorreta(new AlternativaCorreta(pergunta5.getAlternativaA().getAlternativa()));
		perguntas.add(pergunta1);
		perguntas.add(pergunta2);
		perguntas.add(pergunta3);
		perguntas.add(pergunta4);
		perguntas.add(pergunta5);
	}
	// Método para calcular quantas questões o usuário acertou
	public static Integer calcularQuantidadeDeAcertos(List<Pergunta> perguntas) {
		Integer quantidadeAcertos = 0;
		for (Pergunta p : perguntas) {
			if (p.getAcertou()) {
				quantidadeAcertos++;
			}
		}
		return quantidadeAcertos;
	}
	// Método para calcular a pontuação total da pessoa
	public static Double calcularPontuacao(List<Pergunta> perguntas) {
		Double pontuacao = 0.0;
		for (Pergunta p : perguntas) {
			if (p.getAcertou()) {
				pontuacao += p.getQuantosPontosVale();
			}
		}
		return pontuacao;
	}
	public static Double calcularPorcentagemDeAcerto(Integer quantidadeAcertos) {
		return (quantidadeAcertos * 100.0) / 5.0;
	}
	public static void apresentarAlternativasAposResponder(List<Pergunta> perguntas) {
		System.out.println("Resultado:");
		for (Pergunta pergunta : perguntas) {
			System.out.println("=======================================");
			System.out.println(pergunta.getPergunta());
			System.out.println("Resposta: " + pergunta.getAlternativaCorreta().getAlternativaCorreta());
			System.out.println("O que você respondeu:");
			if (pergunta.getAlternativaA().getSelecionouEssa()) {
				System.out.println(pergunta.getAlternativaA().getAlternativa());
			} else {
				System.out.println(pergunta.getAlternativaB().getAlternativa());
			}
			if (pergunta.getAcertou()) {
				System.out.println("ACERTOU!");
			} else {
				System.out.println("ERROU!");
			}
		}
	}
	public static void main(String[] args) {
		apresentarMensagemBrasil();
		List<Pergunta> perguntas = new ArrayList<Pergunta>();
		definirPerguntas(perguntas);
		Integer quantidadeAcertos = 0;
		Double pontuacaoTotal = 0.0;
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Olá, como vai? Vamos testar seus conhecimentos sobre o Brasil!");
			for (Pergunta pergunta : perguntas) {
				String opcao = "";
				while (!opcao.equals("a") && !opcao.equals("b")) {
					System.out.println(pergunta.getPergunta());
					System.out.println("A - " + pergunta.getAlternativaA().getAlternativa());
					System.out.println("B - " + pergunta.getAlternativaB().getAlternativa());
					opcao = entrada.next();
					opcao = opcao.toLowerCase();
					if (!opcao.equals("a") && !opcao.equals("b")) {
						System.out.println("Por gentileza, informe A ou B!");
					}
					Alternativa alternativaQueSelecionou = null;
					if (opcao.equals("a")) {
						pergunta.getAlternativaA().setSelecionouEssa(true);
						alternativaQueSelecionou = pergunta.getAlternativaA();
					} else {
						pergunta.getAlternativaB().setSelecionouEssa(true);
						alternativaQueSelecionou = pergunta.getAlternativaB();
					}
					if (pergunta.getAlternativaCorreta().getAlternativaCorreta().equals(alternativaQueSelecionou.getAlternativa())) {
						pergunta.setAcertou(true);
					} else {
						pergunta.setAcertou(false);
					}
				}
			}
			apresentarAlternativasAposResponder(perguntas);
			quantidadeAcertos = calcularQuantidadeDeAcertos(perguntas);
			System.out.println("Quantidade de acertos: " + quantidadeAcertos);
			pontuacaoTotal = calcularPontuacao(perguntas);
			System.out.println("Porcentagem de acertos: "  + calcularPorcentagemDeAcerto(quantidadeAcertos) + "%");
			System.out.println("Pontuação total: " + pontuacaoTotal + " pontos");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
