package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		// Criar um programa que receba um número e diga se ele é um número primo utilizando a estrutura switch.
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número para verificar se é primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		
		case 0:
			System.out.println("O número " + numero + " é um número primo.");
			break;
			
		default:
			System.out.println("O número " + numero + " não é um número primo.");
		}

		entrada.close();
	}
}
