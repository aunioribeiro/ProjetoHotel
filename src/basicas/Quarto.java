package basicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBQUARTO")
public class Quarto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idQuarto;
	private int num;
    private String descricao;
    private int andar;
    private double preco;
    
    public Quarto() {
    	
    }
    
    public Quarto(int num, String descricao, int andar, double preco) {
    	
    	this.num = num;
    	this.descricao = descricao;
    	this.andar = andar;
    	this.preco = preco;
    }
    
    //RELACIONAMENTOS
   @ManyToOne
   @JoinColumn(name = "idReserva")
   private Reserva reserva;
    
    
    
    //GETTERS&SETTERS
	public int getIdQuarto() {
		return idQuarto;
	}
	
	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getAndar() {
		return andar;
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
    
}