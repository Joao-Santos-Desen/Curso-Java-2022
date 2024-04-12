package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(19, 05, 2014);
//		d1.dia = 23;
//		d1.mes = 06;
//		d1.ano = 1980;
		
		var d2 = new Data();
//		d2.dia = 19;
//		d2.mes = 05;
//		d2.ano = 2014;
		
				
		System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
		System.out.printf("%d/%d/%d\n\n", d2.dia, d2.mes, d2.ano);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		System.out.println();
		
		System.out.println(d1.obterDataFormatadaProf());
		System.out.println(d2.obterDataFormatadaProf());
		
		System.out.println();
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
