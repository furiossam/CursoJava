package br.com.furiossam.PlataformaSaude.service;

import java.util.List;

import br.com.furiossam.PlataformaSaude.dao.MedicoDAO;
import br.com.furiossam.PlataformaSaude.dao.MedicoDAOImpl;
import br.com.furiossam.PlataformaSaude.entity.Medico;

public class MedicoServiceImpl implements MedicoService{
	
	private MedicoDAO dao = new MedicoDAOImpl();

	public void cadastrar(Medico m) {

		dao.cadastrar(m);
		
	}

	public List<Medico> listar() {
		
		return dao.listar();
		
	}

	public void editar(Medico m) {
		
		dao.editar(m);
		
	}

	public void deletar(long id) {

		dao.deletar(id);
		
	}

	public Medico listarPeloBy(long id) {
		
		return dao.listarPeloBy(id);
		
	}

}
