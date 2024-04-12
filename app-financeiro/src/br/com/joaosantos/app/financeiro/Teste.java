package br.com.joaosantos.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.joaosantos.app.Calculadora;

public class Teste {

public static void main(String[] args) {	
				
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();		
		System.out.println(calc.soma(2, 3, 4));
		
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4, 5, 6));
		
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			fieldId.setAccessible(false);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
