package br.com.furiossam.PlataformaSaude.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.furiossam.PlataformaSaude.entity.Atendimento;

public class AtendimentoDAOImpl implements AtendimentoDAO {
	
	private List<Atendimento> listaDeAtendimentos = new ArrayList<Atendimento>();

	public void cadastrar(Atendimento m) {
		
		listaDeAtendimentos.add(m);

	}

	public List<Atendimento> listar() {
		
		return listaDeAtendimentos;
		
	}

	public void editar(Atendimento m) {
		Atendimento aux = null;
		boolean naoEncontrou = true;
		int indice = 0;
		
		do{
				aux = listaDeAtendimentos.get(indice);
				if(aux.getId()==m.getId()) {
					listaDeAtendimentos.remove(indice);
					listaDeAtendimentos.add(m);
					naoEncontrou=false;
				}	
				indice++;
		}while((naoEncontrou)&&(indice<listaDeAtendimentos.size()));
		
	}

	public void deletar(long id) {
		
		boolean naoEncontrou = true;
		int indice = 0;
		
		do{
				if(listaDeAtendimentos.get(indice).getId()==id) {
					listaDeAtendimentos.remove(indice);
					naoEncontrou=false;
				}
				indice++;
		}while((naoEncontrou)&&(indice<listaDeAtendimentos.size()));
				
	}

	public Atendimento listarPeloBy(long id) {
		boolean naoEncontrou = true;
		int indice = 0;
		Atendimento atendimentoRetornado = null;
		
		do{
				if(listaDeAtendimentos.get(indice).getId()==id) {
					atendimentoRetornado = listaDeAtendimentos.get(indice);
					naoEncontrou=false;
				}
				indice++;
		}while((naoEncontrou)&&(indice<listaDeAtendimentos.size()));
		
		return atendimentoRetornado;
	}

	public List<Atendimento> listarAtendimentosPeloIdMedico(long id) {
		
		List<Atendimento> listaRetornada = new ArrayList<Atendimento>();

		for(Atendimento atendimentoAux : listaDeAtendimentos) {
			if(atendimentoAux.getMedico().getId()==id) {
				listaRetornada.add(atendimentoAux);
			}
		}
		
		return listaRetornada;
	}

}
