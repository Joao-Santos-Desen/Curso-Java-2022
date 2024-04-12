package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base da triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double resultado = (base * altura) / 2;
		
		System.out.println("A área do triângulo é: " + resultado);
		
		entrada.close();
	}
}
