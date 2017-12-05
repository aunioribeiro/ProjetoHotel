package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import basicas.Ocupacao;
import dados.DAOFabrica;
import dados.OcupacaoDAO;

@ManagedBean
@ViewScoped
public class OcupacaoBean {
	
	private List<Ocupacao> ocupacoes = new ArrayList<Ocupacao>();
	private Ocupacao ocupacao;
	private OcupacaoDAO ocupacaoDAO;
	

	//Construtor
	public OcupacaoBean() {
		this.ocupacaoDAO = DAOFabrica.getOcupacaoDAO();
		this.ocupacao = new Ocupacao();
		
	}

	//Adicionar Ocupacao
	public void adicionaOcupacao() {
        try {
            DAOFabrica.getOcupacaoDAO().insert(this.ocupacao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	//Remover Ocupacao
	public void removeOcupacao() {
		try {
			DAOFabrica.getOcupacaoDAO().remove(this.ocupacao);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	///GETTERS AND SETTERS
	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public List<Ocupacao> getOcupacoes() {
		this.ocupacoes = ocupacaoDAO.getAll();
		return this.ocupacoes;
	}

	public void setOcupacao(List<Ocupacao> ocupacoes) {
		this.ocupacoes = ocupacoes;
	}

	public OcupacaoDAO getOcupacaoDAO() {
		return ocupacaoDAO;
	}

	public void setOcupacaoDAO(OcupacaoDAO ocupacaoDAO) {
		this.ocupacaoDAO = ocupacaoDAO;
	}
	
}
