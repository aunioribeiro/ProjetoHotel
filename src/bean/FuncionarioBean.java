package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import basicas.Funcionario;
import dados.DAOFabrica;
import dados.FuncionarioDAO;

@ManagedBean
@ViewScoped
public class FuncionarioBean {
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private Funcionario funcionario;
	private FuncionarioDAO funcionarioDAO;
	

	//Construtor
	public FuncionarioBean() {
		this.funcionarioDAO = DAOFabrica.getFuncionarioDAO();
		this.funcionario = new Funcionario();
		
	}

	//Adicionar Funcionário
	public void adicionaFuncionario() {
        try {
            DAOFabrica.getFuncionarioDAO().insert(this.funcionario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	//Remover Hóspede
	public void removeFuncionario() {
		try {
			DAOFabrica.getFuncionarioDAO().remove(this.funcionario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	///GETTERS AND SETTERS
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setHospede(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Funcionario> getFuncionarios() {
		this.funcionarios = funcionarioDAO.getAll();
		return this.funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public FuncionarioDAO getFuncionarioDAO() {
		return funcionarioDAO;
	}

	public void setFuncionarioDAO(FuncionarioDAO funcionarioDAO) {
		this.funcionarioDAO = funcionarioDAO;
	}
	
}
