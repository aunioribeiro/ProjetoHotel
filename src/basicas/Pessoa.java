package basicas;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPessoa;
    private String cpf;
    private String login;
    private String senha;
	private String nome;
    private String sexo;
    private String dtNascimento;
    
    
    
    //GETTERS&SETTERS
	public int getIdPessoa() {
		return idPessoa;
	}
	
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
     
}
