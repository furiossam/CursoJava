package br.com.furiossam.PlataformaSaude.service;

import java.util.List;

import br.com.furiossam.PlataformaSaude.dao.AtendimentoDAO;
import br.com.furiossam.PlataformaSaude.dao.AtendimentoDAOImpl;
import br.com.furiossam.PlataformaSaude.entity.Atendimento;

public class AtendimentoServiceImpl implements AtendimentoService {
	
	private AtendimentoDAO dao = new AtendimentoDAOImpl();

	public void cadastrar(Atendimento m) {
		
		dao.cadastrar(m);
		
	}

	public List<Atendimento> listar() {
		
		return dao.listar();
		
	}

	public void editar(Atendimento m) {
		
		dao.editar(m);
		
	}

	public void deletar(long id) {

		dao.deletar(id);
		
	}

	public Atendimento listarPeloBy(long id) {
		
		return dao.listarPeloBy(id);
		
	}

}
