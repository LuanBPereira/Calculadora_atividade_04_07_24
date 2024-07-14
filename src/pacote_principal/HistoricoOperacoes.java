package pacote_principal;

import java.util.ArrayList;
import java.util.List;

public class HistoricoOperacoes {

	private List<Operacao> historico = new ArrayList<>();

	public void adicionarOperacao(String tipoOperacao, double valor1, double valor2, double resultado) {
		if (historico.size() == 5) { //se o tamanho da lista chegar em 5, ela vai remover a primeira operação e colocar uma nova.
            historico.remove(0);
        }
		historico.add(new Operacao(tipoOperacao, valor1, valor2, resultado));
	}

	public void exibirHistorico() {
		if (historico.isEmpty()) {
			System.out.println("Nenhuma operação no histórico.");
		} else {
			System.out.println("Histórico de operações:");
			for (Operacao operacao : historico) {
				System.out.println(operacao.formatarOperacao());
			}
		}
	}
	// criei uma sub-classe, pois pra mim fazia sentido essa classe ser exclusiva
	// do histórico de operações, já que ele vai ser a única classe a utiliza-lá.
	public class Operacao {
		private String tipoOperacao;
		private double valor1;
		private double valor2;
		private double resultado;

		public Operacao(String tipoOperacao, double valor1, double valor2, double resultado) {
			this.tipoOperacao = tipoOperacao;
			this.valor1 = valor1;
			this.valor2 = valor2;
			this.resultado = resultado;
		}

		// função que vai pegar o tipo da operação que foi realizada pelo usuário
		// e vai colocar em um formato especifico a String dependendo da operação.
		public String formatarOperacao() {
			switch (tipoOperacao.toLowerCase()) {
			case "soma":
				return String.format("Soma: %.2f + %.2f = %.2f", valor1, valor2, resultado);
			case "subtração":
				return String.format("Subtração: %.2f - %.2f = %.2f", valor1, valor2, resultado);
			case "multiplicação":
				return String.format("Multiplicação: %.2f * %.2f = %.2f", valor1, valor2, resultado);
			case "divisão":
				return String.format("Divisão: %.2f / %.2f = %.2f", valor1, valor2, resultado);
			case "potência":
				return String.format("Potência: %.2f ^ %.2f = %.2f", valor1, valor2, resultado);
			case "raiz quadrada":
				return String.format("Raiz Quadrada: √%.2f = %.2f", valor1, resultado);
			default:
				return "Operação desconhecida";
			}
		}
	}

}
