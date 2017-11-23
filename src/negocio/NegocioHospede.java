package negocio;

import javax.persistence.EntityManagerFactory;

import basicas.Hospede;
import dados.DAOFabrica;
import dados.HospedeDAO;

public class NegocioHospede {

    private void validarCadastrarHospede(Hospede h) throws Exception {
     //   if(h.getCpf().trim().length() < 14) {
     //       throw new Exception("Por favor, informar o CPF.");
     //   }
        
        if(h.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Por favor, informar o CPF");
        }
        
        if(h.getNome().trim().equals("")) {
            throw new Exception("Por favor, informar o NOME.");
        }
        
        if(h.getEmail().trim().length() < 5) {
            throw new Exception("Por favor, informar E-MAIL");
        }
        
        if(h.getTelefone().equals("")) {
            throw new Exception("Por favor, informar TELEFONE.");
        } 
    }
    
    private void validarAtualizarHospede(Hospede h) throws Exception {
        if(h.getNome().trim().equals("")) {
            throw new Exception("Por favor, informar o NOME.");
        }

        if(h.getEmail().trim().length() < 5) {
            throw new Exception("Por favor, informar E-MAIL");
        }
        
        if(h.getTelefone().trim().length() < 16) {
            throw new Exception("Por favor, informar TELEFONE.");
        }       
    }
    
    private void validarRemoverHospede(Hospede h) throws Exception {
        if(h.getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informar o CPF.");
        }
        
        if(h.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Hósspede não encontrado!");
        }
        
        if(h.getCpf() == null) {
            throw new Exception("Hóspede não encotrado!");
        }
    }
    
    private void validarPesquisarHospede(String cpf) throws Exception {
        Hospede h = new Hospede();
        
        if(h.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Hósspede não encontrado!");
        }
        
        if(h.getCpf() == null) {
            throw new Exception("Hóspede não encotrado!");
        }        
    }
    
    public void cadastrarHospede(Hospede h) throws Exception {
        validarCadastrarHospede(h);
        DAOFabrica.getHospedeDAO().insert(h);
    }

    public void atualizarHospede(Hospede h) throws Exception {
        validarAtualizarHospede(h);
        DAOFabrica.getHospedeDAO().update(h);
    }

    public void removerHospede(Hospede h) throws Exception {
        validarRemoverHospede(h);
        DAOFabrica.getHospedeDAO().remove(h);
    }

    public Hospede pesquisarHospede(String cpf) throws Exception {
        validarPesquisarHospede(cpf);
        return DAOFabrica.getHospedeDAO().searchByKey(cpf);
    }
}
