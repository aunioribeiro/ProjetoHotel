package dados;

import javax.persistence.EntityManagerFactory;

import basicas.Reserva;

public class ReservaDAO extends DAOGenerico <Reserva> {
	
	public ReservaDAO(EntityManagerFactory emf) {
		super(emf);
	}

}