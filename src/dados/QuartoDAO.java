package dados;

import javax.persistence.EntityManagerFactory;

import basicas.Quarto;

public class QuartoDAO extends DAOGenerico <Quarto> {
	
	public QuartoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}