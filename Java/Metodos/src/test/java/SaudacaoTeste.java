import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.time.LocalTime;

import metodos.Saudacao;

public class SaudacaoTeste {
	@Test
	public void validaBomDia() {
		Assertions.assertEquals("Bom dia!", Saudacao.saudar(LocalTime.of(11, 0)));
	}
	@Test
	public void validaBoaTarde() {
		Assertions.assertEquals("Boa Tarde!", Saudacao.saudar(LocalTime.of(12, 5)));
	}
	@Test
	public void validaBoaNoite() {
		Assertions.assertEquals("Boa Noite!", Saudacao.saudar(LocalTime.of(01, 50)));
	}
}
