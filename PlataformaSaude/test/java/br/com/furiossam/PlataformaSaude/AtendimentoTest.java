package br.com.furiossam.PlataformaSaude;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import br.com.furiossam.PlataformaSaude.entity.Atendimento;
import br.com.furiossam.PlataformaSaude.entity.Medico;
import br.com.furiossam.PlataformaSaude.service.AtendimentoService;
import br.com.furiossam.PlataformaSaude.service.AtendimentoServiceImpl;


public class AtendimentoTest {
	
	private AtendimentoService atendimentoService;
	
	@Before
	public void init() {
		atendimentoService = new AtendimentoServiceImpl();
	}
	
	@Test
	public void cadastrar() {
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		
		assertEquals(1, atendimentoService.listar().size());
		
		atendimentoService.listar().clear();
		
	}
	
	@Test
	public void cadastrarErro() {
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		
		assertNotEquals(2, atendimentoService.listar().size());
		
		atendimentoService.listar().clear();
		
	}
	
	@Test
	public void listar(){
		Atendimento a = new Atendimento();
		a.setNomeProcedimento("teste1");
		
		Atendimento b = new Atendimento();
		b.setNomeProcedimento("teste2");
		
		atendimentoService.cadastrar(a);
		atendimentoService.cadastrar(b);
		
		assertEquals(2, atendimentoService.listar().size());
		
		atendimentoService.listar().clear();
		
	}
	
	
	@Test
	public void listarErro(){
		Atendimento a = new Atendimento();
		a.setNomeProcedimento("teste1");
		
		Atendimento b = new Atendimento();
		b.setNomeProcedimento("teste2");
		
		atendimentoService.cadastrar(a);
		atendimentoService.cadastrar(b);
		
		assertNotEquals(1, atendimentoService.listar().size());
		
		atendimentoService.listar().clear();
		
	}
	
	@Test
	public void editar() {
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		
		Atendimento atendimentoPesquisado = atendimentoService.listarPeloBy(1);
		atendimentoPesquisado.setNomeProcedimento("teste2");
		atendimentoService.editar(atendimentoPesquisado);
		
		Atendimento atendimentoEditado = atendimentoService.listarPeloBy(1);
		
		assertEquals("teste2", atendimentoEditado.getNomeProcedimento());
		
		atendimentoService.listar().clear();
		
	}
	
	@Test
	public void editarErro() {
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		
		Atendimento atendimentoPesquisado = atendimentoService.listarPeloBy(1);
		atendimentoPesquisado.setNomeProcedimento("teste2");
		atendimentoService.editar(atendimentoPesquisado);
		
		Atendimento atendimentoEditado = atendimentoService.listarPeloBy(1);
		
		assertNotEquals("teste1", atendimentoEditado.getNomeProcedimento());
		
		atendimentoService.listar().clear();
		
	}
	
	@Test
	public void deletar() {
		
		
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		atendimentoService.deletar(1);
		
		assertEquals(0, atendimentoService.listar().size());
		
		atendimentoService.listar().clear();
		
	}
	
	@Test
	public void deletarErro() {
		
		
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		atendimentoService.deletar(1);
		
		assertNotEquals(2, atendimentoService.listar().size());
		
		atendimentoService.listar().clear();
		
	}
	
	@Test
	public void listarPeloBy() {
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		
		assertNotNull(atendimentoService.listarPeloBy(1));
		
	}
	
	@Test
	public void listarPeloByErro() {
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		
		atendimentoService.cadastrar(a);
		
		assertEquals(null,atendimentoService.listarPeloBy(3));
		
	}
	
	@Test
	public void listarAtendimentosPeloIdMedico() {
		
		Medico medicoA = new Medico();
		medicoA.setId(1);
		medicoA.setNome("medicoA");
		
		
		Medico medicoB = new Medico();
		medicoB.setId(2);
		medicoB.setNome("medicoB");
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		a.setMedico(medicoA);
		
		atendimentoService.cadastrar(a);
		List<Atendimento> listaParaTeste = new ArrayList<Atendimento>();
		
		listaParaTeste = atendimentoService.listarAtendimentosPeloIdMedico(1);
		
		assertEquals(1, listaParaTeste.size());
		
		
		
		
	}
	
	@Test
	public void listarAtendimentosPeloIdMedicoErro() {
		
		Medico medicoA = new Medico();
		medicoA.setId(1);
		medicoA.setNome("medicoA");
		
		
		Medico medicoB = new Medico();
		medicoB.setId(2);
		medicoB.setNome("medicoB");
		
		Atendimento a = new Atendimento();
		a.setId(1);
		a.setNomeProcedimento("teste1");
		a.setMedico(medicoA);
		
		atendimentoService.cadastrar(a);
		List<Atendimento> listaParaTeste = new ArrayList<Atendimento>();
		
		listaParaTeste = atendimentoService.listarAtendimentosPeloIdMedico(1);
		
		assertNotEquals(3, listaParaTeste.size());
		
		
		
		
	}
}
