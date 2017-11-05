package br.com.empresa.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.empresa.jdbc.ConnectionFactory;
import br.com.empresa.jdbc.modelo.Customer;

public class CustomerDao {

	// conexão com o banco de dados
	private Connection connection;

	public CustomerDao() {

		this.connection = new ConnectionFactory().getConnection();
	}

	// adiciona cliente ao banco de dados
	public void adiciona(Customer customer) {

		String sql = "INSERT INTO tb_customer_account " + "(id_customer,cpf_cnpj,nm_customer,is_active,vl_total)"
				+ " values (?,?,?,?,?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, customer.getId());
			stmt.setLong(2, customer.getCpf_cnpj());
			stmt.setString(3, customer.getNome());
			stmt.setBoolean(4, customer.isIs_active());
			stmt.setDouble(5, customer.getVl_total());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

	public List<Customer> getLista() {

		try {

			List<Customer> customers = new ArrayList<Customer>();

			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM tb_customer_account "
					+ "WHERE vl_total >= 560 AND id_customer BETWEEN 1500 AND  2700 " + "ORDER BY vl_total DESC");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Customer customer = new Customer();
				customer.setId(rs.getLong("id_customer"));
				customer.setCpf_cnpj(rs.getLong("cpf_cnpj"));
				customer.setNome(rs.getString("nm_customer"));
				customer.setIs_active(rs.getBoolean("is_active"));
				customer.setVl_total(rs.getDouble("vl_total"));
				
				customers.add(customer);
			}
			rs.close();
			stmt.close();
			return customers;
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}

	}

}
