package br.com.furiossam.PlataformaSaude.dao;

import java.util.List;

import br.com.furiossam.PlataformaSaude.entity.Laudo;

public class LaudoDAOImpl implements LaudoDAO {
	
	private List<Laudo> listaDeLaudos;

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
		}while(naoEncontrou);
		
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
		}while(naoEncontrou);
				
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
		}while(naoEncontrou);
		
		return laudoRetornado;
	}

}
