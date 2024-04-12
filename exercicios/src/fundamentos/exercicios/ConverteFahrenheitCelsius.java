package fundamentos.exercicios;

import java.util.Scanner;

public class ConverteFahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado em Celsius é " + celsius + "ºC.");
					
		entrada.close();
	}
}
