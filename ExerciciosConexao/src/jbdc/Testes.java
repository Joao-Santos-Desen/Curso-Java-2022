//package jbdc;
//
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Testes {
//
//	
//	
//	public static void main(String[] args) {
//			
//			try {
//			    //Indicação da conexão com o MySQL através do protocolo JDBC
//			    //além do IP do servidor (localhost)
//			    //base de dados ou schema (javamysql)
//			    //usuário para autenticação (root)
//			    //senha do usuário root
//			    DriverManager.getConnection("jdbc:mysql://localhost?" +
//			                                "user=root&password=Rafa@2014");
//			    
//			    System.out.println("Conexão realizada com sucesso.");
//			    
//			} catch (SQLException ex) {
//			    //Caso ocorram erros na tentativa de conexão com o MySQL
//			    System.out.println("SQL Exception: " + ex.getMessage());
//			    System.out.println("Código do erro: " + ex.getErrorCode());
//			}
//		}
//	}


