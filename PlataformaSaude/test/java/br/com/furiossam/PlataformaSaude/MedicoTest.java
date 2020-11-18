package br.com.furiossam.PlataformaSaude;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.datatransfer.SystemFlavorMap;

import org.junit.Before;
import org.junit.Test;

import br.com.furiossam.PlataformaSaude.entity.Medico;
import br.com.furiossam.PlataformaSaude.service.MedicoService;
import br.com.furiossam.PlataformaSaude.service.MedicoServiceImpl;

public class MedicoTest {

private MedicoService medicoService;
	
	@Before
	public void init() {
		medicoService = new MedicoServiceImpl();

	}
	
	@Test
	public void cadastrar() {
		
		Medico a = new Medico();
		a.setId(1);
		a.setNome("teste1");
		
		medicoService.cadastrar(a);
		
		assertEquals(1, medicoService.listar().size());
		
		medicoService.listar().clear();
		
	}
	
	@Test
	public void listar(){
		Medico a = new Medico();
		a.setNome("teste1");
		
		Medico b = new Medico();
		b.setNome("teste2");
		
		medicoService.cadastrar(a);
		medicoService.cadastrar(b);
		
		assertEquals(2, medicoService.listar().size());
		
		medicoService.listar().clear();
		
	}
	
	@Test
	public void editar() {
		
		Medico a = new Medico();
		a.setId(1);
		a.setNome("teste1");
		
		medicoService.cadastrar(a);
		
		Medico atendimentoPesquisado = medicoService.listarPeloBy(1);
		atendimentoPesquisado.setNome("teste2");
		medicoService.editar(atendimentoPesquisado);
		
		Medico atendimentoEditado = medicoService.listarPeloBy(1);
		
		assertEquals("teste2", atendimentoEditado.getNome());
		
		medicoService.listar().clear();
		
	}
	
	@Test
	public void deletar() {
		
		
		
		Medico a = new Medico();
		a.setId(1);
		a.setNome("teste1");
		
		medicoService.cadastrar(a);
		medicoService.deletar(1);
		
		assertEquals(0, medicoService.listar().size());
		
		medicoService.listar().clear();
		
	}
	
	
	@Test
	public void listarPeloBy() {
		
		Medico a = new Medico();
		a.setId(1);
		a.setNome("teste1");
		
		medicoService.cadastrar(a);
		
		assertNotNull(medicoService.listarPeloBy(1));
		
	}

}
