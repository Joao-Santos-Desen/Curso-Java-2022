import br.com.joaosantos.app.calculo.CalculadoraImpl;

module app.calculo {
	requires transitive app.logging;
	exports br.com.joaosantos.app.calculo;
	
//	exports br.com.joaosantos.app.calculo.interno
//		to app.financeiro;
	
	opens br.com.joaosantos.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.joaosantos.app.Calculadora with CalculadoraImpl;
}