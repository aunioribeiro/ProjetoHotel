package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import basicas.Quarto;
import dados.DAOFabrica;
import dados.QuartoDAO;

@ManagedBean
@ViewScoped
public class QuartoBean {
	
	private List<Quarto> quartos = new ArrayList<Quarto>();
	private Quarto quarto;
	private QuartoDAO quartoDAO;
	

	//Construtor
	public QuartoBean() {
		this.quartoDAO = DAOFabrica.getQuartoDAO();
		this.quarto = new Quarto();
		
	}

	//Adicionar Quarto
	public void adicionaQuarto() {
        try {
            DAOFabrica.getQuartoDAO().insert(this.quarto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	//Remover Hóspede
	public void removeQuarto() {
		try {
			DAOFabrica.getQuartoDAO().remove(this.quarto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	///GETTERS AND SETTERS
	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public List<Quarto> getQuartos() {
		this.quartos = quartoDAO.getAll();
		return this.quartos;
	}

	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}

	public QuartoDAO getQuartoDAO() {
		return quartoDAO;
	}

	public void setQuartoDAO(QuartoDAO quartoDAO) {
		this.quartoDAO = quartoDAO;
	}
	
}
