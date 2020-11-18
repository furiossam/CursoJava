package br.com.furiossam.PlataformaSaude.service;

import java.util.List;

import br.com.furiossam.PlataformaSaude.entity.Medico;

public interface MedicoService {
	
	public void cadastrar(Medico m);
	
	public List<Medico> listar();
	
	public void editar(Medico m);
	
	public void deletar(long id);
	
	public Medico listarPeloBy(long id);

}
