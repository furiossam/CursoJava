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
		}while(naoEncontrou);
		
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
		}while(naoEncontrou);
				
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
		}while(naoEncontrou);
		
		return atendimentoRetornado;
	}

}
