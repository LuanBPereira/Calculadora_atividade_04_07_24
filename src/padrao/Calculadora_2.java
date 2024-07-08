 package padrao;

import java.util.Scanner;

public class Calculadora_2 {
	static Scanner s = new Scanner(System.in);
	static Calculadora_2 c = new Calculadora_2();
	
	public static void main(String[] args) {
		int escolha;
		 do {
	         escolha = c.exibirMenu();
	
	         switch (escolha) {
	             case 1 -> c.somar();
	             case 2 -> c.subtrair();
	             case 3 -> c.multiplicar();
	             case 4 -> c.dividir();
	             case 5 -> System.out.println("Encerrando programa...");
	             default -> System.out.println("Escolha inválida! Tente novamente.");
	         }
	     } while (escolha != 5);
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
		
		return s.nextInt();
	}
	
	public double lerNumero(String mensagem) {
		System.out.println(mensagem);
		return s.nextDouble();
	}
	
	public boolean verificarSeDesejaContinuar() {
		System.out.println("Deseja continuar a operação? S/N");
		String continuar = s.next();
		return continuar.equalsIgnoreCase("S");
	}
	
	public double somar() {
		double resultado = lerNumero("Digite o primeiro número para realizar a operação:");
		resultado += lerNumero("Digite outro número para somar:");
		System.out.println("\nResultado: " + resultado);
		
		 while (verificarSeDesejaContinuar()) {
	            resultado += lerNumero("Digite o outro número para continuar a soma.");
	            System.out.println("\nResultado da soma no momento: " + resultado);
	        }
	        System.out.println("\nResultado final da soma: " + resultado);
	     
	        return resultado;
	}

	public double subtrair() {
		double resultado = lerNumero("Digite o primeiro número para realizar a operação:");
		resultado -= lerNumero("Digite outro número para subtrair:");
		System.out.println("\nResultado: " + resultado);
		
		 while (verificarSeDesejaContinuar()) {
	            resultado += lerNumero("Digite o outro número para continuar a subtração.");
	            System.out.println("\nResultado da subtração no momento: " + resultado);
	        }
	        System.out.println("\nResultado final da subtração: " + resultado);
	        
	        return resultado;
	}
	
	public double multiplicar() {
		double resultado = lerNumero("Digite o primeiro número para realizar a operação:");
		resultado *= lerNumero("Digite outro número para multiplicar:");
		System.out.println("\nResultado: " + resultado);
		
		 while (verificarSeDesejaContinuar()) {
	            resultado += lerNumero("Digite o outro número para continuar a multiplicação.");
	            System.out.println("\nResultado da multiplicação no momento: " + resultado);
	        }
	        System.out.println("\nResultado final da multiplicação: " + resultado);
	        
	        return resultado;
	}
	
	public double dividir() {
		double resultado = lerNumero("Digite o primeiro número para realizar a operação:");
		resultado /= lerNumero("Digite outro número para dividir:");
		System.out.println("\nResultado: " + resultado);
		
		 while (verificarSeDesejaContinuar()) {
	            resultado += lerNumero("Digite o outro número para continuar a divisão.");
	            System.out.println("\nResultado da divisão no momento: " + resultado);
	        }
	        System.out.println("\nResultado final da divisão: " + resultado);
	        
	        return resultado;
	}
}
