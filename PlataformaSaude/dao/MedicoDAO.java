package br.com.furiossam.PlataformaSaude.dao;

import java.util.List;

import br.com.furiossam.PlataformaSaude.entity.Medico;

public interface MedicoDAO {
	
public void cadastrar(Medico m);
	
	public List<Medico> listar();
	
	public void editar(Medico m);
	
	public void deletar(long id);
	
	public Medico listarPeloBy(long id);

}
