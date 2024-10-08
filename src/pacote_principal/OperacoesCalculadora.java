package pacote_principal;

import java.util.Scanner;

public class OperacoesCalculadora {
	
    private HistoricoOperacoes historico = new HistoricoOperacoes();
    private Scanner s = new Scanner(System.in);

    public double somar(double valor1, double valor2) {
        double soma = valor1 + valor2;
        System.out.println("O resultado da soma é: " + soma);
        historico.adicionarOperacao("Soma", valor1, valor2, soma);
        return soma;
    }

    public double subtrair(double valor1, double valor2) {
        double subtracao = valor1 - valor2;
        System.out.println("O resultado da subtração é: " + subtracao);
        historico.adicionarOperacao("Subtração", valor1, valor2, subtracao);
        return subtracao;
    }

    public double multiplicar(double valor1, double valor2) {
        double multiplicacao = valor1 * valor2;
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        historico.adicionarOperacao("Multiplicação", valor1, valor2, multiplicacao);
        return multiplicacao;
    }

    public double dividir(double valor1, double valor2) {
        double divisao = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + divisao);
        historico.adicionarOperacao("Divisão", valor1, valor2, divisao);
        return divisao;
    }

    public double potencia(double valor1, double valor2) {
        double resultado = Math.pow(valor1, valor2);
        System.out.println("O resultado da potência é: " + resultado);
        historico.adicionarOperacao("Potência", valor1, valor2, resultado);
        return resultado;
    }

    public double raizQuadrada(double valor1) {
    	double resultado = Math.sqrt(valor1);
    	while(valor1 < 0) {
    		 System.out.println("Erro: número precisa ser maior que 0");
    		 System.out.println("Digite o primeiro número para realizar a operação:");
    		 resultado = Math.sqrt(valor1 = s.nextDouble());
     	}
        System.out.println("O resultado da raiz quadrada é: " + resultado);
        historico.adicionarOperacao("Raiz Quadrada", valor1, 0, resultado);
       
        return resultado;
    }

    public void exibirHistorico() {
        historico.exibirHistorico();
    }
}

