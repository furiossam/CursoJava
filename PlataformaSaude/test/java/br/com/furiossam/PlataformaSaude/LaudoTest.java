package br.com.furiossam.PlataformaSaude;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.furiossam.PlataformaSaude.entity.Laudo;
import br.com.furiossam.PlataformaSaude.service.LaudoService;
import br.com.furiossam.PlataformaSaude.service.LaudoServiceImpl;

public class LaudoTest {
	
private LaudoService laudoService;
	
	@Before
	public void init() {
		laudoService = new LaudoServiceImpl();
	}
	
	@Test
	public void cadastrar() {
		
		Laudo a = new Laudo();
		a.setId(1);
		a.setTexto("teste1");
		
		laudoService.cadastrar(a);
		
		assertEquals(1, laudoService.listar().size());
		
		laudoService.listar().clear();
		
	}
	
	@Test
	public void listar(){
		Laudo a = new Laudo();
		a.setTexto("teste1");
		
		Laudo b = new Laudo();
		b.setTexto("teste2");
		
		laudoService.cadastrar(a);
		laudoService.cadastrar(b);
		
		assertEquals(2, laudoService.listar().size());
		
		laudoService.listar().clear();
		
	}
	
	@Test
	public void editar() {
		
		Laudo a = new Laudo();
		a.setId(1);
		a.setTexto("teste1");
		
		laudoService.cadastrar(a);
		
		Laudo atendimentoPesquisado = laudoService.listarPeloBy(1);
		atendimentoPesquisado.setTexto("teste2");
		laudoService.editar(atendimentoPesquisado);
		
		Laudo atendimentoEditado = laudoService.listarPeloBy(1);
		
		assertEquals("teste2", atendimentoEditado.getTexto());
		
		laudoService.listar().clear();
		
	}
	
	@Test
	public void deletar() {
		
		
		
		Laudo a = new Laudo();
		a.setId(1);
		a.setTexto("teste1");
		
		laudoService.cadastrar(a);
		laudoService.deletar(1);
		
		assertEquals(0, laudoService.listar().size());
		
		laudoService.listar().clear();
		
	}
	
	
	@Test
	public void listarPeloBy() {
		
		Laudo a = new Laudo();
		a.setId(1);
		a.setTexto("teste1");
		
		laudoService.cadastrar(a);
		
		assertNotNull(laudoService.listarPeloBy(1));
		
	}

}
