package br.com.furiossam.PlataformaSaude.service;

import java.util.List;

import br.com.furiossam.PlataformaSaude.entity.Atendimento;
import br.com.furiossam.PlataformaSaude.entity.Laudo;

public interface AtendimentoService {
	
	public void cadastrar(Atendimento m);
	
	public List<Atendimento> listar();
	
	public void editar(Atendimento m);
	
	public void deletar(long id);
	
	public Atendimento listarPeloBy(long id);
	
	public List<Atendimento> listarAtendimentosPeloIdMedico(long id);

}
