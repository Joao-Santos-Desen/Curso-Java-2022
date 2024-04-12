package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();
		
		double quadrado = num * num;
		double cubo = num * num * num;
		
		System.out.println("O número elevado ao quadrado é: " + quadrado);
		System.out.println("O número elevado ao cubo é: " + cubo);
		
		
		entrada.close();
	}
}
