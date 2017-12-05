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
	Quarto q2 = new Quarto();
	Quarto q3 = new Quarto();
	Quarto q4 = new Quarto();
	Quarto q5 = new Quarto();
	Quarto q6 = new Quarto();
	Quarto q7 = new Quarto();
	Quarto q8 = new Quarto();
	Quarto q9 = new Quarto();
	
	
	q1.setAndar(01);
	q1.setDescricao("Livre");
	q1.setNum(1001);
	q1.setPreco(100);
	
	q2.setAndar(01);
	q2.setDescricao("Livre");
	q2.setNum(1002);
	q2.setPreco(150);
	
	q3.setAndar(01);
	q3.setDescricao("Livre");
	q3.setNum(1003);
	q3.setPreco(200);
	
	q4.setAndar(01);
	q4.setDescricao("Livre");
	q4.setNum(1004);
	q4.setPreco(250);
	
	q5.setAndar(01);
	q5.setDescricao("Livre");
	q5.setNum(1005);
	q5.setPreco(300);
	
	q6.setAndar(02);
	q6.setDescricao("Livre");
	q6.setNum(1006);
	q6.setPreco(350);
	
	q7.setAndar(02);
	q7.setDescricao("Livre");
	q7.setNum(1007);
	q7.setPreco(400);
	
	q8.setAndar(02);
	q8.setDescricao("Livre");
	q8.setNum(1008);
	q8.setPreco(450);
	
	q9.setAndar(02);
	q9.setDescricao("Livre");
	q9.setNum(1009);
	q9.setPreco(500);
	
	Fachada f = new Fachada();
	f.cadastrarQuarto(q5);
} catch (Exception e) {
	System.out.println("1");
	System.out.println(e.getMessage());
}
	

	
	}
}