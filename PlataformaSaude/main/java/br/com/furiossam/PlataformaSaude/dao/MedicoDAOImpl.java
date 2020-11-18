package br.com.furiossam.PlataformaSaude.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.furiossam.PlataformaSaude.entity.Medico;

public class MedicoDAOImpl implements MedicoDAO{
	
	private List<Medico> listaDeMedicos = new ArrayList<Medico>();

	public void cadastrar(Medico m) {
		
		listaDeMedicos.add(m);

	}

	public List<Medico> listar() {
		
		return listaDeMedicos;
		
	}

	public void editar(Medico m) {
		Medico aux = null;
		boolean naoEncontrou = true;
		int indice = 0;
		
		do{
				aux = listaDeMedicos.get(indice);
				if(aux.getId()==m.getId()) {
					listaDeMedicos.remove(indice);
					listaDeMedicos.add(m);
					naoEncontrou=false;
				}	
				indice++;
		}while(naoEncontrou);
		
	}

	public void deletar(long id) {
		
		boolean naoEncontrou = true;
		int indice = 0;
		
		do{
				if(listaDeMedicos.get(indice).getId()==id) {
					listaDeMedicos.remove(indice);
					naoEncontrou=false;
				}
				indice++;
		}while(naoEncontrou);
				
	}

	public Medico listarPeloBy(long id) {
		boolean naoEncontrou = true;
		int indice = 0;
		Medico medicoRetornado = null;
		
		do{
				if(listaDeMedicos.get(indice).getId()==id) {
					medicoRetornado = listaDeMedicos.get(indice);
					naoEncontrou=false;
				}
				indice++;
		}while(naoEncontrou);
		
		return medicoRetornado;
	}

}
