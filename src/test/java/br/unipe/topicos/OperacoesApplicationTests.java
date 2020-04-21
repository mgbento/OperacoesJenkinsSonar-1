package br.unipe.topicos;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import br.unipe.topicos.service.OperacoesService;

@SpringBootTest
class OperacoesApplicationTests {

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void somaTeste() {
		OperacoesService op = new OperacoesService();
		double resultado =op.somar(1,3);
		Assertions.assertEquals(4, resultado);
	}
	
	@Test
	public void subtracaoTeste() {
		OperacoesService op = new OperacoesService();
		double resultado =op.subtrair(3,3);
		Assertions.assertEquals(0, resultado);
	}

}
