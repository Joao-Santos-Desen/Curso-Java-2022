package fundamentos.exercicios;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A da equação: ");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de B da equação: ");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de C da equação: ");
		int c = entrada.nextInt();
		
		int delta = (b * b) - 4 * a * c;
		
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("Os resultados da equação são: " + x1 + " e " + x2);
		
		entrada.close();
	}
}
