package basicas;

import java.util.Objects;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="TBHOSPEDE")
public class Hospede extends Pessoa {
    
    private String email;
    private String telefone;
    
    
    
    //GETTERS&SETTERS
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return true;
    }
	
}