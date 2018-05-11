package matematica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatematicaTest {

	@Test
	void testMatematica() {

		Matematica valor01 = new Matematica(11);
		Matematica valor02 = new Matematica(2);

		assertEquals(22, valor01.dobro());
		assertEquals("n�o � par", valor01.parOuImpar().getPar());
		assertEquals("� impar", valor01.parOuImpar().getImpar());
		assertEquals("� maior que 10", valor01.maiorQueDez());
		assertEquals("� primo", valor01.primo());

		assertEquals(4, valor02.dobro());
		assertEquals("� par", valor02.parOuImpar().getPar());
		assertEquals("n�o � impar", valor02.parOuImpar().getImpar());
		assertEquals("n�o � maior que 10", valor02.maiorQueDez());
		assertEquals("� primo", valor02.primo());
	}

}
