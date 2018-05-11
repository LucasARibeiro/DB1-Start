package portugues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextoTest {

	@Test
	void testTexto() {
		Texto texto = new Texto("db1");
		Texto texto02 = new Texto("DB1 START");

		assertEquals(3, texto.quantidadeDeCaracteres());
		assertEquals(0, texto.quantidadeDeEspacoEmBranco());
		assertEquals(0, texto.quantidadeDeVogais());

		assertEquals(9, texto02.quantidadeDeCaracteres());
		assertEquals(1, texto02.quantidadeDeEspacoEmBranco());
		assertEquals(1, texto02.quantidadeDeVogais());

	}

}
