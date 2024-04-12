package jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao1 {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jbdc:mysql://localhost:3306";
		final String usuario = "root";
		final String senha = "Rafa@2014";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);		
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
}
}
