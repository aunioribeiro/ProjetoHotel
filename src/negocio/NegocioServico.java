package negocio;

import basicas.Servico;
import dados.DAOFabrica;
import dados.ServicoDAO;

public class NegocioServico {

    private void validarCadastrarServico(Servico s) throws Exception {
        if (s.getIdServico() <= 0) {
            throw new Exception("Por favor, informar um CÓDIGO DE SERVIÇO válido.");
        }

        if (s.getDesc().length() > 20) {
            throw new Exception("Por favor, DESCREVA o Serviço com menos de VINTE(20) caracteres.");
        }

        if (s.getDesc().equals("")) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getDesc() == null) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getValor() <= 0) {
            throw new Exception("Por favor, informe um VALOR válido para o serviço.");
        }        
    }
    
    private void validarAtualizarServico(Servico s) throws Exception {
        if (s.getDesc().length() > 20) {
            throw new Exception("Por favor, DESCREVA o Serviço com menos de VINTE(20) caracteres.");
        }

        if (s.getDesc().equals("")) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getDesc() == null) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getValor() <= 0) {
            throw new Exception("Por favor, informe um VALOR válido para o cerviço.");
        }        
    }
    
    private void validarRemoverServico(Servico s) throws Exception {
        if (s.getIdServico() <= 0) {
            throw new Exception("Por favor, informar um CÓDIGO DE SERVIÇO válido.");
        }        
    }
    
     private void validarPesquisarServico(Servico s) throws Exception {
        if (s.getIdServico() <= 0) {
            throw new Exception("Por favor, informar um CÓDIGO DE SERVIÇO válido.");
        }        
    }
     
    private final ServicoDAO ds;
    
    public NegocioServico () {
        this.ds = new ServicoDAO(null);
    }
    
    public void cadastrarServico(Servico s) throws Exception {
        validarCadastrarServico(s);
        DAOFabrica.getServicoDAO().insert(s);
    }
    
    public void atualizarServico(Servico s) throws Exception {
        validarAtualizarServico(s);
        DAOFabrica.getServicoDAO().update(s);
    }
    
    public void removerServico(Servico s) throws Exception {
        validarRemoverServico(s);
        DAOFabrica.getServicoDAO().remove(s);
    }
    
    public Servico pesquisarServico(Servico s) throws Exception {
        validarPesquisarServico(s);
        return DAOFabrica.getServicoDAO().searchByKey(s.getIdServico());
    }   
}
