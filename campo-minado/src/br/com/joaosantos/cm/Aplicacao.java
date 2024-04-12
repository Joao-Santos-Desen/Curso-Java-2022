package br.com.joaosantos.cm;

import br.com.joaosantos.cm.modelo.Tabuleiro;
import br.com.joaosantos.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(10, 10, 6);
		new TabuleiroConsole(tabuleiro);		
	}
}
