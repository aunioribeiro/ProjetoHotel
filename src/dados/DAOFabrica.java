package dados;


import dados.DAOFabrica;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import basicas.Quarto;

public abstract class DAOFabrica {

	
	private static final EntityManagerFactory factory;
	
	static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOFabrica.class.getName()).log(Level.SEVERE, null, ex);
        }
        factory = Persistence.createEntityManagerFactory("hotelPersistence");
    }
	
	public static EnderecoDAO getEnderecoDAO(){
		EnderecoDAO dao = new EnderecoDAO(factory);
		return dao;
	}
		
	public static FuncionarioDAO getFuncionarioDAO(){
		FuncionarioDAO dao = new FuncionarioDAO(factory);
		return dao;
	}
	
	public static HospedeDAO getHospedeDAO(){
		HospedeDAO dao = new HospedeDAO(factory);
		return dao;
	}
	
	public static OcupacaoDAO getOcupacaoDAO(){
		OcupacaoDAO dao = new OcupacaoDAO(factory);
		return dao;
	}
	
	public static QuartoDAO getQuartoDAO(){
		QuartoDAO dao = new QuartoDAO(factory);
		return dao;
	}
	
	public static ReservaDAO getReservaDAO(){
		ReservaDAO dao = new ReservaDAO(factory);
		return dao;
	}
	
	public static ServicoDAO getServicoDAO(){
		ServicoDAO dao = new ServicoDAO(factory);
		return dao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static List<Quarto> listartodos() {
		throw new UnsupportedOperationException("Erro!!!!!!!!!!!!!!!!!!!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}