package dados;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import basicas.Hospede;

public class HospedeDAO extends DAOGenerico <Hospede>{
	
	public HospedeDAO(EntityManagerFactory emf) {
		super(emf);
	}

	
	private List<Hospede> hospedes = new ArrayList<Hospede>();
	
	public List<Hospede> listarTodos(){
		if (hospedes.size() == 0) {
			hospedes.add(new Hospede());
		}	 
		
		return hospedes;
	}
}