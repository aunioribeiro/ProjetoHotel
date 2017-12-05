package basicas;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBRESERVA")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idReserva;
	private int periodo;
    private String dtReserva;
    private String estado;
     
    
    //RELACIONAMENTOS
   @OneToOne
   @JoinColumn(name = "idHospede")
   private Hospede hospede;
    
   @OneToMany(mappedBy = "reserva")
   private List<Quarto> listaQuarto;
    
   @OneToOne
   @JoinColumn(name = "idOcupacao")        
   private Ocupacao ocupacao;
    
    
    //GETTERS&SETTERS
    public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getDtReserva() {
		return dtReserva;
	}

	public void setDtReserva(String dtReserva) {
		this.dtReserva = dtReserva;
	}

	public Hospede getHospede() {
	return hospede;
	}

	public void setHospede(Hospede hospede) {
	this.hospede = hospede;
	}

	public List<Quarto> getListaQuarto() {
		return listaQuarto;
	}

	public void setListaQuarto(List<Quarto> listaQuarto) {
		this.listaQuarto = listaQuarto;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    

}
