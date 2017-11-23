package basicas;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBFUNCIONARIO")
public class Funcionario extends Pessoa {
    
    private double salario;
    private String cargo;
    
    
    
    //RELACIONAMENTOS
   @OneToOne
   @JoinColumn(name = "idEndereco")
   private Endereco endereco;
    
    
    
    //GETTERS&SETTERS
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
    public Endereco getEndereco() {
    		return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
    		this.endereco = endereco;
    }
}