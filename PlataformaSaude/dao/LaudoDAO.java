package br.com.furiossam.PlataformaSaude.dao;

import java.util.List;

import br.com.furiossam.PlataformaSaude.entity.Laudo;

public interface LaudoDAO {
	
	public void cadastrar(Laudo m);
	
	public List<Laudo> listar();
	
	public void editar(Laudo m);
	
	public void deletar(long id);
	
	public Laudo listarPeloBy(long id);
}
