
package padrao;

import java.util.Scanner;

public class Calculadora {
	static Scanner s = new Scanner(System.in);
	static Calculadora c = new Calculadora();
	static int escolha;

	public static void main(String[] args) {
		System.out.println("""
				(Calculadora)
				
				Olá! Qual operação deseja realizar?
				
				1 - Adição
				2 - Subtração
				3 - Multiplicação
				4 - Divisão
				5 - Encerrar programa.
				""");
		escolha = s.nextInt();
		c.obterEscolhaUsuario(escolha);
	}
	
	public void obterEscolhaUsuario(int escolha) {
		while(!(escolha >=5)) {
			
			System.out.println("Digite o primeiro numero para realizar a operação:");
			double valor1 = s.nextDouble();
			System.out.println("Digite o segundo numero para realizar a operação:");
			double valor2 = s.nextDouble();
		
			switch(escolha) {
			case 1 -> somar(valor1, valor2);
			case 2 -> subtrair(valor1, valor2);
			case 3 -> multiplicar(valor1, valor2);
			case 4 -> dividir(valor1, valor2);
			}
			break;
		}
	}
	
	public double somar(double valor1, double valor2) {
		double soma = valor1 + valor2;
		System.out.println("O resultado da soma é: " + soma);
		return soma;
	}
	
	public double subtrair(double valor1, double valor2) {
		double subtracao = valor1 - valor2;
		System.out.println("O resultado da soma é: " + subtracao);
		return subtracao;
	}
	
	public double multiplicar(double valor1, double valor2) {
		double multiplicacao = valor1 * valor2;
		System.out.println("O resultado da soma é: " + multiplicacao);
		return multiplicacao;
	}
	
	public double dividir(double valor1, double valor2) {
		double divisao = valor1 / valor2;
		System.out.println("O resultado da soma é: " + divisao);
		return divisao;
	}
	
}
