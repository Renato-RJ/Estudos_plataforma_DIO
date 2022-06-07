import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import metodos.OperacoesBasicas;

public class OperacoesBasicasTeste {
	@Test
	void soma() {
		Assertions.assertEquals(3.5, OperacoesBasicas.soma(1.5, 2.0));
	}
	@Test
	void subtracao() {
		Assertions.assertEquals(-0.5, OperacoesBasicas.subtracao(1.5, 2.0));
	}
	@Test
	void multiplicacao() {
		Assertions.assertEquals(10.0, OperacoesBasicas.multiplicacao(5.0, 2.0));
	}
	@Test
	void divisao() {
		Assertions.assertEquals(3.0, OperacoesBasicas.divisao(27.0, 9.0));
	}

}
