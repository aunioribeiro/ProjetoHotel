package negocio;

import basicas.Reserva;
import dados.DAOFabrica;
import dados.ReservaDAO;

public class NegocioReserva {

    private void validarCadastrarReserva(Reserva r) throws Exception {
        if(r.getHospede().getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informe o CPF.");
        }
        
        if(r.getPeriodo() < 0) {
            throw new Exception("Por favor, informe o PERÍODO.");
        }
        
        if(r.getDtReserva().equals("  /  /    ")) {
            throw new Exception("Por favor, informe a DATA.");
        }
        
        if(r.getListaQuarto().isEmpty()) {
            throw new Exception("Por favor, informe o QUARTO.");
        }
    }
    
    private void validarAtualizarReserva(Reserva r) throws Exception {
        if(r.getPeriodo() < 0) {
            throw new Exception("Por favor, informe o PERÍODO.");
        }
        
        if(r.getDtReserva().equals("  /  /    ")) {
            throw new Exception("Por favor, informe a DATA.");
        }
        
        if(r.getListaQuarto().isEmpty()) {
            throw new Exception("Por favor, informe o QUARTO.");
        }        
    }
    
    private void validarRemoverReserva(Reserva r) throws Exception {
        if (r.getIdReserva() <= 0) {
            throw new Exception("Reserva não encontrada.");
        }
    }
    
    private void validarPesquisarReserva(int cod) throws Exception {
        if (cod <= 0) {
            throw new Exception("Reserva não encontrada.");
        }
    }
    
    public void cadastrarReserva(Reserva r) throws Exception {
        validarCadastrarReserva(r);
        DAOFabrica.getReservaDAO().insert(r);
    }
    
    public void atualizarReserva(Reserva r) throws Exception {
        validarAtualizarReserva(r);
        DAOFabrica.getReservaDAO().update(r);
    }
    
    public void removerReserva(Reserva r) throws Exception {
        validarRemoverReserva(r);
        DAOFabrica.getReservaDAO().remove(r);
    }
       
    public Reserva pesquisarReserva(int cod) throws Exception {
        validarPesquisarReserva(cod);
        return DAOFabrica.getReservaDAO().searchByKey(cod);
    }    
}
