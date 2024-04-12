package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) sentença; ou {} Determina se executa ou não.
		// while(...) sentença; ou {} Repete bloco de código.
		// for(...; ...; ...;) (inicialização da variável; expressão; modificação da variável;) sentença; ou {}
		
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.println("Você precisa falar "
					+ "\nas palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
