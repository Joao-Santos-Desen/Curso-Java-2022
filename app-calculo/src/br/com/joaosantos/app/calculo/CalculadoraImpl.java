package br.com.joaosantos.app.calculo;

import br.com.joaosantos.app.Calculadora;
import br.com.joaosantos.app.calculo.interno.OperacoesAritmeticas;
import br.com.joaosantos.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "abc";

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
	public String getId() {
		return id;
	}
}
