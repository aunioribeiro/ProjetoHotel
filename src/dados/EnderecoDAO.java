package dados;

import javax.persistence.EntityManagerFactory;

import basicas.Endereco;

public class EnderecoDAO extends DAOGenerico <Endereco>{
	
	public EnderecoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}