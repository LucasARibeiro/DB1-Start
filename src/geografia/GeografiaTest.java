package geografia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeografiaTest {

	@Test
	void testGeografia() {

		Cidade cidade01 = new Cidade("Curitiba");
		Cidade cidade02 = new Cidade("Maringá");
		Cidade cidade03 = new Cidade("Porto Alegre");

		assertEquals("é capital", cidade01.gerenciar().getCapital());
		assertEquals("Pertence ao PR", cidade01.gerenciar().getEstado());

		assertEquals("não é capital", cidade02.gerenciar().getCapital());
		assertEquals("Pertence ao PR", cidade02.gerenciar().getEstado());

		assertEquals("é capital", cidade03.gerenciar().getCapital());
		assertEquals("Pertence ao RS", cidade03.gerenciar().getEstado());
	}

}
