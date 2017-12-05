package gui;

import basicas.*;
import negocio.Fachada;

public class Start {

	public static void main(String[] args) {
		
		/*try {
			Hospede h = new Hospede();
			
			h.setCpf("222-222-222.22");
			h.setDtNascimento("10/10/2000");
			h.setEmail("aaa@aaa");
			h.setLogin("aaa");
			h.setNome("AAA");
			h.setSenha("aaa");
			h.setSexo("F");
			h.setTelefone("(99) 9.9999-9999");
			
			Fachada f = new Fachada();
			f.cadastrarHospede(h);
		} catch (Exception e) {
			System.out.println("1");
			System.out.println(e.getMessage());
		}
	}*/
	
	
		try {
		
	Quarto q1 = new Quarto();
	
	q1.setAndar(01);
	q1.setDescricao("Livre");
	q1.setNum(1001);
	q1.setPreco(100);
	
	Fachada f = new Fachada();
	f.cadastrarQuarto(q1);
} catch (Exception e) {
	System.out.println("1");
	System.out.println(e.getMessage());
}
	

	
	}
}