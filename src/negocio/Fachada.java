package negocio;

import basicas.Funcionario;
import basicas.Hospede;
import basicas.Ocupacao;
import basicas.Quarto;
import basicas.Reserva;
import basicas.Servico;


public class Fachada {
	
	private NegocioHospede nh;
	private NegocioFuncionario nf;
	private NegocioOcupacao no;
	private NegocioQuarto nq;
	private NegocioReserva nr;
	private NegocioServico ns;
	
	public Fachada() {
		this.nh = new NegocioHospede();
		this.nf = new NegocioFuncionario();
		this.no = new NegocioOcupacao();
		this.nq = new NegocioQuarto();
		this.nr = new NegocioReserva();
		this.ns = new NegocioServico();
	}
	
	//Hospede
    public void cadastrarHospede(Hospede h) throws Exception {
    		this.nh.cadastrarHospede(h);
    }

    public void atualizarHospede(Hospede h) throws Exception {
    		this.nh.atualizarHospede(h);
    }

    public void removerHospede(Hospede h) throws Exception {
    		this.nh.removerHospede(h);
    }

    public Hospede pesquisarHospede(String cpf) throws Exception {
       return this.nh.pesquisarHospede(cpf);
    }
    
    //Funcionário
    public void cadastrarFuncionario(Funcionario f) throws Exception {
    		this.nf.cadastrarFuncionario(f);
    }
    
    public void atualizarFuncionario(Funcionario f) throws Exception {
    		this.nf.atualizarFuncionario(f);
    }
    
    public void removerFuncionario(Funcionario f) throws Exception {
    		this.nf.removerFuncionario(f);
    }
    
    //Ocupação
    public void cadastrarOcupacao(Ocupacao o) throws Exception {
    		this.no.cadastrarOcupacao(o);
    }
    
    public void atualizarOcupacao(Ocupacao o) throws Exception {
    		this.no.atualizarOcupacao(o);
    }
    
    public void removerOcupacao(Ocupacao o) throws Exception {
    		this.no.removerOcupacao(o);
    	}
    
    //Quarto
    public void cadastrarQuarto(Quarto q) throws Exception {
    		this.nq.cadastrarQuarto(q);
    }
    
    public void atualizarQuarto(Quarto q) throws Exception {
    		this.nq.atualizarQuarto(q);
    }
    
    public void removerQuarto(Quarto q) throws Exception {
    		this.nq.removerQuarto(q);
    }
    
    //Resereva
    public void cadastrarReserva(Reserva r) throws Exception {
    		this.nr.cadastrarReserva(r);
    }
    
    public void atualizarReserva(Reserva r) throws Exception {
    		this.nr.atualizarReserva(r);
    }
    
    public void removerReserva(Reserva r) throws Exception {
    		this.nr.removerReserva(r);
    }
       
    public Reserva pesquisarReserva(int cod) throws Exception {
    		return this.nr.pesquisarReserva(cod);
    }
    
    //Serviço
    public void cadastrarServico(Servico s) throws Exception {
    		this.ns.cadastrarServico(s);
    }
    
    public void atualizarServico(Servico s) throws Exception {
    		this.ns.atualizarServico(s);
    }
    
    public void removerServico(Servico s) throws Exception {
    		this.ns.removerServico(s);
    }
    
    public Servico pesquisarServico(Servico s) throws Exception {
    		return this.ns.pesquisarServico(s);
    }    
}
    
