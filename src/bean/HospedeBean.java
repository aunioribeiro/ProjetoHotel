package bean;

import javax.faces.bean.*;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import basicas.Hospede;
import dados.DAOFabrica;
import dados.HospedeDAO;

@ManagedBean
@ViewScoped
public class HospedeBean {
	
	private Hospede hospede;
	private List<Hospede> hospedes;
	private HospedeDAO hospedeDAO;
	

	//Construtor
	public HospedeBean() {
		this.hospedeDAO = DAOFabrica.getHospedeDAO();
		this.hospede = new Hospede();
		
	}

	//Adicionar Hóspede
	public void adicionaHospede() {
        try {
            DAOFabrica.getHospedeDAO().insert(this.hospede);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	//Remover Hóspede
	public void removeHospede() {
		try {
			DAOFabrica.getHospedeDAO().remove(this.hospede);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	///GETTERS AND SETTERS
	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public List<Hospede> getHospedes() {
		this.hospedes = hospedeDAO.getAll();
		return this.hospedes;
	}

	public void setHospedes(List<Hospede> hospedes) {
		this.hospedes = hospedes;
	}

	public HospedeDAO getHospedeDAO() {
		return hospedeDAO;
	}

	public void setHospedeDAO(HospedeDAO hospedeDAO) {
		this.hospedeDAO = hospedeDAO;
	}
	
}
