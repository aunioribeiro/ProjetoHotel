package negocio;

import basicas.Ocupacao;
import dados.DAOFabrica;
import dados.OcupacaoDAO;

public class NegocioOcupacao {

	private void validarCadastrarOcupacao(Ocupacao o) throws Exception {
        if (o.getHospede().getCpf() == null) {
            throw new Exception("Por favor, informe o CPF.");
        }
        
        if (o.getDtEntrada().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE ENTRADA válida.");
        }
        
        if (o.getDtSaida().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE SAÍDA válida.");
        }        

        if (o.getHrEntrada().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE ENTRADA válida.");
        }

        if (o.getHrSaida().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE SAÍDA válida.");
        }
        
        if (o.getQuarto().getNum() <= 0) {
            throw new Exception("Por favor, informe um QUARTO válido.");
        }
        
        if (o.getValorDiaria() <= 0) {
            throw new Exception("Por favor, informe um VALOR DE DIÁRIA válido.");
        }
    }
    
    private void validarAtualizarOcupacao(Ocupacao o) throws Exception {
         if (o.getDtEntrada().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE ENTRADA válida.");
        }
        
        if (o.getDtSaida().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE SAÍDA válida.");
        }        

        if (o.getHrEntrada().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE ENTRADA válida.");
        }

        if (o.getHrSaida().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE SAÍDA válida.");
        }
        
        if (o.getQuarto().getNum() <= 0) {
            throw new Exception("Por favor, informe um QUARTO válido.");
        }
    }
    
    private void validarRemoverOcupacao(Ocupacao o) throws Exception {
        if(o.getIdOcupacao() <= 0) {
            throw new Exception("Ocupacão não encontrada.");
        }
    }
    
    public void cadastrarOcupacao(Ocupacao o) throws Exception {
        validarCadastrarOcupacao(o);
        DAOFabrica.getOcupacaoDAO().insert(o);
    }
    
    public void atualizarOcupacao(Ocupacao o) throws Exception {
        validarAtualizarOcupacao(o);
        DAOFabrica.getOcupacaoDAO().update(o);
    }
    
    public void removerOcupacao(Ocupacao o) throws Exception {
        validarRemoverOcupacao(o);
        DAOFabrica.getOcupacaoDAO().remove(o);
    }    
}
