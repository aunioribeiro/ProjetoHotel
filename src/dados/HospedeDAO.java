package dados;

import javax.persistence.EntityManagerFactory;

import basicas.Hospede;

public class HospedeDAO extends DAOGenerico <Hospede>{
	
	public HospedeDAO(EntityManagerFactory emf) {
		super(emf);
	}

}