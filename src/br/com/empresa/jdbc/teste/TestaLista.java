package br.com.empresa.jdbc.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.empresa.jdbc.dao.CustomerDao;
import br.com.empresa.jdbc.modelo.Customer;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cria o dao 
		CustomerDao dao = new CustomerDao();
		
		//lista os contatos com o dao
		List<Customer> customers = dao.getLista();
		
		double media = 0;
		double soma = 0;
		
		//itera e imprime as informações 
		
		for (Customer customer : customers) {
			
			System.out.println("ID: " + customer.getId());
			System.out.println("CPF ou CNPJ: " + customer.getCpf_cnpj());
			System.out.println("Nome: " + customer.getNome());
			System.out.println("Ativo: " + customer.isIs_active());
			System.out.println("Valor total:" + customer.getVl_total());
			
			System.out.println("___________________________________________");
			
			soma = soma + customer.getVl_total();
		}
		
		media = soma/customers.size();
		
		System.out.println("Media final: " + media);

	}

}
