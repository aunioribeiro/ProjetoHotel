package negocio;

import java.util.ArrayList;

import basicas.Hospede;
import basicas.Quarto;
import dados.DAOFabrica;
import dados.QuartoDAO;

public class NegocioQuarto {

    private void validarCadastrarQuarto(Quarto q) throws Exception {
        if (q.getNum()< 0) {
            throw new Exception("Por Favor, informe um número de quarto maior que ZERO.");
        }

        if (q.getDescricao().length() > 20) {
            throw new Exception("Por Favor, descreva o quarto com menos de VINTE caracteres.");
        }

        if ((q.getPreco() < 0) || (q.getPreco() < 20))  {
            throw new Exception("Por Favor, informe um VALOR válido.");
        }

        if (q.getAndar() < 0) {
            throw new Exception("Por Favor, Informe o ANDAR.");
        }        
    }
    
    private void validarAtualizarQuarto(Quarto q) throws Exception {
        if (q.getNum()<= 0) {
            throw new Exception("Por Favor, informe um número de quarto maior que ZERO.");
        }

        if (q.getDescricao().length() > 20) {
            throw new Exception("Por Favor, descreva o quarto com menos de VINTE caracteres.");
        }

        if ((q.getPreco() < 0) || (q.getPreco() < 20))  {
            throw new Exception("Por Favor, informe um VALOR válido.");
        }

        if (q.getAndar() < 0) {
            throw new Exception("Por Favor, Informe o ANDAR.");
        } 
    }
    
    private void validarRemoverQuarto(Quarto q) throws Exception {
        if (q.getNum()< 0) {
            throw new Exception("Por Favor, informe um número de quarto maior que ZERO.");
        }        
    }

    public void cadastrarQuarto(Quarto q) throws Exception {
        validarCadastrarQuarto(q);
        DAOFabrica.getQuartoDAO().insert(q);
    }
    
    public void atualizarQuarto(Quarto q) throws Exception {
        validarAtualizarQuarto(q);
        DAOFabrica.getQuartoDAO().update(q);
    }
    
    public void removerQuarto(Quarto q) throws Exception {
        validarRemoverQuarto(q);
        DAOFabrica.getQuartoDAO().remove(q);
    }   
    
    public ArrayList<Quarto> listarQuarto(ArrayList<Quarto> listaQuarto) throws Exception {
		return listaQuarto = (ArrayList<Quarto>) DAOFabrica.getQuartoDAO().getAll();
    }
}
