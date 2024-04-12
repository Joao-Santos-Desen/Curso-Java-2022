package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) {
		
		try {
		    //Indicação da conexão com o MySQL através do protocolo JDBC
		    //além do IP do servidor (localhost)
		    //base de dados ou schema (javamysql)
		    //usuário para autenticação (root)
		    //senha do usuário root
		    
		    
		    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost?" +
                    "user=root&password=Rafa@2014");
			
		    
		    Statement stmt = conexao.createStatement();
		    stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		    
		    System.out.println("Banco criado com sucesso!");
		    conexao.close();
		    
		} catch (SQLException ex) {
		    //Caso ocorram erros na tentativa de conexão com o MySQL
		    System.out.println("SQL Exception: " + ex.getMessage());
		    System.out.println("Código do erro: " + ex.getErrorCode());
		}
	}
}
