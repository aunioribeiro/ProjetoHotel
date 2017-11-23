package dados;

import javax.persistence.EntityManagerFactory;

import basicas.Funcionario;

public class FuncionarioDAO extends DAOGenerico <Funcionario>{
	
	public FuncionarioDAO(EntityManagerFactory emf) {
		super(emf);
	}

}