package dados;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import basicas.Hospede;
import bean.HospedeBean;

public class HospedeDAO extends DAOGenerico <Hospede>{
	
	public HospedeDAO(EntityManagerFactory emf) {
		super(emf);
	}

}