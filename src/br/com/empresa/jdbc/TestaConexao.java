package br.com.empresa.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = new ConnectionFactory().getConnection();
		
		System.out.println("Conexao aberta");
		
		con.close();

	}

}
