package gui;

import java.util.ArrayList;
import java.util.List;

import basicas.*;
import dados.DAOFabrica;
import negocio.Fachada;

public class Start {

	public static void main(String[] args) {
		
		//private List<Quarto> quartos = new ArrayList<Quarto>();
		
		
		try {
			Quarto q = new Quarto();

			q.setAndar(8);
			q.setDescricao("88888");
			q.setNum(9999);
			q.setPreco(999);

			//Fachada f = new Fachada();
			//f.cadastrarQuarto(q);
			DAOFabrica.getQuartoDAO().update(q);
		} catch (Exception e) {
			System.out.println("1");
			System.out.println(e.getMessage());
		}
		
	}
}