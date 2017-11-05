package br.com.empresa.jdbc.teste;

import br.com.empresa.jdbc.dao.CustomerDao;
import br.com.empresa.jdbc.modelo.Customer;

// testa inserção de dados na tabela
public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		customer.setId(1547);
		customer.setCpf_cnpj(212542542);
		customer.setIs_active(true);
		customer.setNome("Ragnar Lothbrok");
		customer.setVl_total(652);
		
		CustomerDao dao = new CustomerDao();
		dao.adiciona(customer);
		
		System.out.println("Dados gravados com sucesso!");

	}

}
