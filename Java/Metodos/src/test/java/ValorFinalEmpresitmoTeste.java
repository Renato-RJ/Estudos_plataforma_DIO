import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import metodos.ValorFinalEmprestimo;

public class ValorFinalEmpresitmoTeste {
	@Test
	public void verificaCalculoFinalEmprestimoFaixa1() {
		Assertions.assertEquals(104.04, ValorFinalEmprestimo.valorFinal(100.00, 2));
	}
	@Test
	public void verificaCalculoFinalEmprestimoFaixa2() {
		Assertions.assertEquals(1592.05, ValorFinalEmprestimo.valorFinal(1500.00, 4));
	}
	@Test
	public void verificaCalculoFinalEmprestimoFaixa3() {
		Assertions.assertEquals(9454.03, ValorFinalEmprestimo.valorFinal(8000.00, 14));
	}

}
