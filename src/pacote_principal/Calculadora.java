package pacote_principal;

import java.util.InputMismatchException;
import java.util.Scanner;

// ANOTAÇÕES:
// colocar o looping para a pessoa colocar novamente a quantidade de numeros que ela quiser
// n ficar limitado só a dois valores.
// melhorar esse main, to achando muito estranho ter só essas duas coisas que estão nele.
// pensar em alguma forma de persistir os dados das operações, pois quando o programa
// se encerra, os dados se perdem. E isso não faz muito sentido, eu acho.
// talvez colocar em um arquivo txt Para persistir?**

public class Calculadora {
	private static Scanner s = new Scanner(System.in);
	private static OperacoesCalculadora oc = new OperacoesCalculadora();

	public static void main(String[] args) {
		int escolha = exibirMenu();

		while (escolha != 8) {
			try {
				if (escolha == 7) {
					oc.exibirHistorico();
				} else {
					System.out.println("Digite o primeiro número para realizar a operação:");
					double valor1 = s.nextDouble();

					double valor2 = 0;

					if (escolha != 6) {
						System.out.println("Digite o segundo número para realizar a operação:");
						valor2 = s.nextDouble();
					}

					switch (escolha) {
					case 1:
						oc.somar(valor1, valor2);
						break;
					case 2:
						oc.subtrair(valor1, valor2);
						break;
					case 3:
						oc.multiplicar(valor1, valor2);
						break;
					case 4:
						oc.dividir(valor1, valor2);
						break;
					case 5:
						oc.potencia(valor1, valor2); // obs: o valor1 é a base da potência e o valor2 é o expoente
						break;
					case 6:
						oc.raizQuadrada(valor1);
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					}
				}
				escolha = exibirMenu();
			} catch (InputMismatchException e) {
				System.out.println("Erro: digite um número para realizar a operação.");
				s.nextLine();
				escolha = exibirMenu();
			}
		}
		System.out.println("Encerrando programa...");
	}

	private static int exibirMenu() {
		int escolha;
		try {
			System.out.println("""
					\n(Calculadora)

					Olá! Qual operação deseja realizar?

					1 - Adição
					2 - Subtração
					3 - Multiplicação
					4 - Divisão
					5 - Potência
					6 - Raiz quadrada
					7 - Ver histórico
					8 - Encerrar programa.
					""");
			escolha = s.nextInt();
			s.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Erro: digite o número de uma das opções desejadas.");
			s.nextLine();
			escolha = exibirMenu();
		}
		return escolha;
	}
}
