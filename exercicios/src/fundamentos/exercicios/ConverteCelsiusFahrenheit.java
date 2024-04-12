package fundamentos.exercicios;

import java.util.Scanner;

public class ConverteCelsiusFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		final double FATOR = 9.0 / 5.0;
		final double AJUSTE = 32;
		
		double fahrenheit = (celsius * FATOR) + AJUSTE;
		System.out.println("O resultado em Fahrenheit é " + fahrenheit + "ºF.");
					
		entrada.close();
	}
}
