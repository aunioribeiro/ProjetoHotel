package dados;

import javax.persistence.EntityManagerFactory;

import basicas.Servico;

public class ServicoDAO extends DAOGenerico <Servico> {
	
	public ServicoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}