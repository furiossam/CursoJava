package br.com.furiossam.PlataformaSaude.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.furiossam.PlataformaSaude.entity.Atendimento;
import br.com.furiossam.PlataformaSaude.entity.Laudo;

public class LaudoDAOImpl implements LaudoDAO {
	
	private List<Laudo> listaDeLaudos = new ArrayList<Laudo>();

	public void cadastrar(Laudo m) {
		
		listaDeLaudos.add(m);

	}

	public List<Laudo> listar() {
		
		return listaDeLaudos;
		
	}

	public void editar(Laudo m) {
		Laudo aux = null;
		boolean naoEncontrou = true;
		int indice = 0;
		
		do{
				aux = listaDeLaudos.get(indice);
				if(aux.getId()==m.getId()) {
					listaDeLaudos.remove(indice);
					listaDeLaudos.add(m);
					naoEncontrou=false;
				}	
				indice++;
		}while((naoEncontrou)&&(indice<listaDeLaudos.size()));
		
	}

	public void deletar(long id) {
		
		boolean naoEncontrou = true;
		int indice = 0;
		
		do{
				if(listaDeLaudos.get(indice).getId()==id) {
					listaDeLaudos.remove(indice);
					naoEncontrou=false;
				}
				indice++;
		}while((naoEncontrou)&&(indice<listaDeLaudos.size()));
				
	}

	public Laudo listarPeloBy(long id) {
		boolean naoEncontrou = true;
		int indice = 0;
		Laudo laudoRetornado = null;
		
		do{
				if(listaDeLaudos.get(indice).getId()==id) {
					laudoRetornado = listaDeLaudos.get(indice);
					naoEncontrou=false;
				}
				indice++;
		}while((naoEncontrou)&&(indice<listaDeLaudos.size()));
		
		return laudoRetornado;
	}

	public List<Laudo> listarLaudosPeloIdMedico(long id) {
		List<Laudo> listaRetornada = new ArrayList<Laudo>();

		for(Laudo laudoAux : listaDeLaudos) {
			if(laudoAux.getMedico().getId()==id) {
				listaRetornada.add(laudoAux);
			}
		}
		
		return listaRetornada;
	}

}
