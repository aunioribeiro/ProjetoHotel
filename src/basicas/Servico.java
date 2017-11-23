package basicas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBSERVICO")
public class Servico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idServico;
	private double valor;
    private String descricao;
    
    
    
    //RELACIONAMENTOS
   @ManyToMany
   @JoinTable(name = "OcupacaoServico",
		   		joinColumns = {@JoinColumn(name = "idServico")},
		   		inverseJoinColumns = {@JoinColumn(name = "idOcupacao")})
   private List<Ocupacao> listaOcupacao;
   
    
   public Servico () {
       this.listaOcupacao = new ArrayList<>();
   }



    //GETTERS&SETTERS
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDesc() {
		return descricao;
	}

	public void setDesc(String desc) {
		this.descricao = desc;
	}

	public List<Ocupacao> getListaOcupacao() {
		return listaOcupacao;
	}

	public void setListaOcupacao(List<Ocupacao> listaOcupacao) {
		this.listaOcupacao = listaOcupacao;
	}
    
}