package padrao;

import java.util.Scanner;

public class Calculadora_2 {
	static Scanner s = new Scanner(System.in);
	static Calculadora_2 c = new Calculadora_2();
	
	public static void main(String[] args) {
		int escolha = c.exibirMenu();
		
		while(!(escolha >=5)) {
			
			
			switch(escolha) {
			case 1 -> c.somar();
			case 2 -> c.subtrair();
			case 3 -> c.multiplicar();
			case 4 -> c.dividir();
			
			}
			break;
		}
		
	}
	
	public int exibirMenu() {
		System.out.println("""
				(Calculadora)
				
				Olá! Qual operação deseja realizar?
				
				1 - Adição
				2 - Subtração
				3 - Multiplicação
				4 - Divisão
				5 - Encerrar programa.
				""");
		
		int escolha = s.nextInt();
		return escolha;
	}
	
	public double somar() {
		System.out.println("Digite o primeiro numero para realizar a operação:");
		double valor1 = s.nextDouble();
		System.out.println("Digite o outro numero para somar:");
		double valor2 = s.nextDouble();
		double soma = valor1 + valor2;
		System.out.println("\nResultado: " + soma +
				"\nDeseja continuar a operação? S/N");
		String continuar = s.next();
		
			while(continuar.equalsIgnoreCase("S")) {
				System.out.println("\nDigite o outro numero para continuar a soma.");
				double valor3 = s.nextDouble();
				soma += (valor3);
				System.out.println("\nResultado da soma no momento: " + soma + "\nDeseja continuar a operação? S/N");
				continuar = s.next();
				
				if(continuar.equalsIgnoreCase("N")){
					break;
				}
			}
		System.out.println("\nResultado final da soma: " + soma);
		return soma;
	}

	public double subtrair() {
		System.out.println("Digite o primeiro numero para realizar a operação:");
		double valor1 = s.nextDouble();
		System.out.println("Digite o outro numero para somar:");
		double valor2 = s.nextDouble();
		double soma = valor1 + valor2;
		System.out.println("\nResultado: " + soma +
				"\nDeseja continuar a operação? S/N");
		String continuar = s.next();
		
			while(continuar.equalsIgnoreCase("S")) {
				System.out.println("\nDigite o outro numero para continuar a soma.");
				double valor3 = s.nextDouble();
				soma += (valor3);
				System.out.println("\nResultado da soma no momento: " + soma + "\nDeseja continuar a operação? S/N");
				continuar = s.next();
				
				if(continuar.equalsIgnoreCase("N")){
					break;
				}
			}
		System.out.println("\nResultado final da soma: " + soma);
		return soma;
	}
	
	public double multiplicar() {
		System.out.println("Digite o primeiro numero para realizar a operação:");
		double valor1 = s.nextDouble();
		System.out.println("Digite o outro numero para somar:");
		double valor2 = s.nextDouble();
		double multiplicacao = valor1 * valor2;
		System.out.println("\nResultado: " + multiplicacao +
				"\nDeseja continuar a operação? S/N");
		String continuar = s.next();
		
			while(continuar.equalsIgnoreCase("S")) {
				System.out.println("\nDigite o outro numero para continuar a soma.");
				double valor3 = s.nextDouble();
				multiplicacao *= (valor3);
				System.out.println("\nResultado da soma no momento: " + multiplicacao + "\nDeseja continuar a operação? S/N");
				continuar = s.next();
				
				if(continuar.equalsIgnoreCase("N")){
					break;
				}
			}
		System.out.println("\nResultado final da soma: " + multiplicacao);
		return multiplicacao;
	}
	
	public double dividir() {
		System.out.println("Digite o primeiro numero para realizar a operação:");
		double valor1 = s.nextDouble();
		System.out.println("Digite o outro numero para somar:");
		double valor2 = s.nextDouble();
		double divisao = valor1 / valor2;
		System.out.println("\nResultado: " + divisao +
				"\nDeseja continuar a operação? S/N");
		String continuar = s.next();
		
			while(continuar.equalsIgnoreCase("S")) {
				System.out.println("\nDigite o outro numero para continuar a soma.");
				double valor3 = s.nextDouble();
				divisao /= (valor3);
				System.out.println("\nResultado da soma no momento: " + divisao + "\nDeseja continuar a operação? S/N");
				continuar = s.next();
				
				if(continuar.equalsIgnoreCase("N")){
					break;
				}
			}
		System.out.println("\nResultado final da soma: " + divisao);
		return divisao;
	}
}
