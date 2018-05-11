package matematica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatematicaTest {

	@Test
	void testMatematica() {

		Matematica valor01 = new Matematica(11);
		Matematica valor02 = new Matematica(2);

		assertEquals(22, valor01.dobro());
		assertEquals("não é par", valor01.parOuImpar().getPar());
		assertEquals("é impar", valor01.parOuImpar().getImpar());
		assertEquals("é maior que 10", valor01.maiorQueDez());
		assertEquals("é primo", valor01.primo());

		assertEquals(4, valor02.dobro());
		assertEquals("é par", valor02.parOuImpar().getPar());
		assertEquals("não é impar", valor02.parOuImpar().getImpar());
		assertEquals("não é maior que 10", valor02.maiorQueDez());
		assertEquals("é primo", valor02.primo());
	}

}
