package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
//		dia = 01;
//		mes = 01;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return (dia + "/" + mes + "/" + ano);
	}
	
	String obterDataFormatadaProf() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano); // Método mais usual para qualquer plataforma.
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatadaProf()); // Método só fuciona em terminal.
	}	
}
