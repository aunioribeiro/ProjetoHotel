package negocio;

import basicas.Funcionario;
import dados.DAOFabrica;
import dados.FuncionarioDAO;

public class NegocioFuncionario {

    private void validarCadastrarFuncionario(Funcionario f) throws Exception {
        if(f.getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informar o CPF.");
        }
        
        if(f.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Por favor, informar o CPF");
        }
        
        if(f.getNome().trim().equals("")) {
            throw new Exception("Por favor, informar o NOME.");
        }

        if(f.getCargo().equals("") || f.getCargo() == null) {
            throw new Exception("Por favor, informar CARGO.");
        }
        
        if(f.getSalario() <= 0) {
            throw new Exception("Por favor, informar SALÁRIO.");
        }
        
        if(f.getEndereco() == null) {
            throw new Exception("Por favor, informar o ENDEREÇO.");
        }
    }
    
    private void validarAtualizarFuncionario(Funcionario f) throws Exception {
        if(f.getCargo().equals("") || f.getCargo() == null) {
            throw new Exception("Por favor, informar CARGO.");
        }
        
        if(f.getSalario() <= 0) {
            throw new Exception("Por favor, informar SALÁRIO.");
        }
        
        if(f.getEndereco() == null) {
            throw new Exception("Por favor, informar o ENDEREÇO.");
        }        
    }
    
    private void validarRemoverFuncionario(Funcionario f) throws Exception {
        if(f.getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informar o CPF.");
        }
        
        if(f.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Por favor, informar o CPF");
        }        
    }

    public void cadastrarFuncionario(Funcionario f) throws Exception {
        validarCadastrarFuncionario(f);
        DAOFabrica.getFuncionarioDAO().insert(f);
    }
    
    public void atualizarFuncionario(Funcionario f) throws Exception {
        validarAtualizarFuncionario(f);
        DAOFabrica.getFuncionarioDAO().update(f);
    }
    
    public void removerFuncionario(Funcionario f) throws Exception {
        validarRemoverFuncionario(f);
        DAOFabrica.getFuncionarioDAO().remove(f);
    } 
}
