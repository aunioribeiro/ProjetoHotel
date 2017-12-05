package basicas;
import basicas.Servico;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBOCUPACAO")
public class Ocupacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idOcupacao;
	private float valorDiaria;
    private String dtEntrada;
    private String dtSaida;
    private String hrEntrada;
    private String hrSaida;
    
    
    
    //RELACIONAMENTOS
   @OneToOne
   @JoinColumn(name = "idQuarto")
   private Quarto quarto;
    
   @OneToOne
   @JoinColumn(name = "idHospede")
   private Hospede hospede;
   
   @ManyToMany
   @JoinTable(name = "OcupacaoServico",
           joinColumns = {@JoinColumn(name = "idOcupacao")},
           inverseJoinColumns = {@JoinColumn(name = "idServico")})
   private List<Servico> listaServico;
    
   
   
   public Ocupacao () {
       this.hospede = new Hospede();
       this.quarto = new Quarto();
       this.listaServico = new ArrayList<>();
   }

    
    
    //GETTERS&SETTERS
	public int getIdOcupacao() {
		return idOcupacao;
	}

	public void setIdOcupacao(int idOcupacao) {
		this.idOcupacao = idOcupacao;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public String getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public String getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(String dtSaida) {
		this.dtSaida = dtSaida;
	}

	public String getHrEntrada() {
		return hrEntrada;
	}

	public void setHrEntrada(String hrEntrada) {
		this.hrEntrada = hrEntrada;
	}

	public String getHrSaida() {
		return hrSaida;
	}

	public void setHrSaida(String hrSaida) {
		this.hrSaida = hrSaida;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public List<Servico> getListaServico() {
		return listaServico;
	}

	public void setListaServico(List<Servico> listaServico) {
		this.listaServico = listaServico;
	}
    
}