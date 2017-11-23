package bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import basicas.Hospede;
import dados.DAOFabrica;


@ManagedBean
@ViewScoped
public class HospedeBean {
	
	private Hospede hospede = new Hospede();

	public void adicionaHospede() {
        try {
            DAOFabrica.getHospedeDAO().insert(this.hospede);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

}
