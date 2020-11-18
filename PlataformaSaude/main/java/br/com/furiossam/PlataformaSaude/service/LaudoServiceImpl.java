package br.com.furiossam.PlataformaSaude.service;

import java.util.List;

import br.com.furiossam.PlataformaSaude.dao.LaudoDAO;
import br.com.furiossam.PlataformaSaude.dao.LaudoDAOImpl;
import br.com.furiossam.PlataformaSaude.entity.Laudo;

public class LaudoServiceImpl implements LaudoService {
	
	private LaudoDAO dao = new LaudoDAOImpl();

	public void cadastrar(Laudo m) {
		
		dao.cadastrar(m);
		
	}

	public List<Laudo> listar() {
		
		return dao.listar();
	}

	public void editar(Laudo m) {
		
		dao.editar(m);
	}

	public void deletar(long id) {
		
		dao.deletar(id);
		
	}

	public Laudo listarPeloBy(long id) {
		
		return dao.listarPeloBy(id);
		
	}

	public List<Laudo> listarLaudosPeloIdMedico(long id) {
		
		return dao.listarLaudosPeloIdMedico(id);
	}

}
