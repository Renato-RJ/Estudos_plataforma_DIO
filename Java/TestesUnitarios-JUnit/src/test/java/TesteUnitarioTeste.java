
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import testesunitarios.TesteUnitario;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)		//Anotação que define a ordem do teste.
public class TesteUnitarioTeste {
	@Order(2)
	@Test
	void validaCalculo() {
		Assertions.assertEquals(7, TesteUnitario.soma(5, 2));
	}
	@Order(1)
	@Test
	void eMaior() {
		Assertions.assertTrue(TesteUnitario.maior(5,  2));
	}
}
