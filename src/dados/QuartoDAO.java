package dados;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import basicas.Quarto;

public class QuartoDAO extends DAOGenerico <Quarto> {
	
	public QuartoDAO(EntityManagerFactory emf) {
		super(emf);
	}
	
	
	private List<Quarto> quartos = new ArrayList<Quarto>();
	
	public void salvar(Quarto quarto) {
		this.quartos.add(quarto);
	}
	
	public List<Quarto> listarTodos(){
		if (quartos.size() == 0) {
			quartos.add(new Quarto(1, "Livre", 2, 100));
			quartos.add(new Quarto(2, "Livre", 2, 200));
			quartos.add(new Quarto(3, "Livre", 2, 300));
		}
		return quartos;
	}

}