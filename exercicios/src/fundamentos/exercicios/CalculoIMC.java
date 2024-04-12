package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu peso em quilos: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Informe sua altura em metros: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é de: " + imc);
		
		System.out.println("Menor que 18,5 = Abaixo do peso\nEntre 18,5 e 24,9 = Peso normal\nEntre 25 e 29,9 = Sobrepeso\nEntre 30 e 24,9 = Obesidade I\nEntre 35 e 40 = Obesidade II e II");
		
		entrada.close();
	}
}
