package dados;

import javax.persistence.EntityManagerFactory;

import basicas.Ocupacao;

public class OcupacaoDAO extends DAOGenerico <Ocupacao> {
	
	public OcupacaoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}