package start;

import geografia.Cidade;
import matematica.Matematica;
import portugues.Texto;

public class App {
	public static void main(String[] args) {

		Texto texto = new Texto("DB1");
		Texto texto02 = new Texto("DB1 START");
		Matematica valor = new Matematica(11);
		Matematica valor02 = new Matematica(2);
		Cidade cidade = new Cidade("Curitiba");
		Cidade cidade02 = new Cidade("Maringá");
		Cidade cidade03 = new Cidade("Porto Alegre");

		System.out.println(texto.getTexto() + ", " + texto.quantidadeDeCaracteres() + " Caracteres, "
				+ texto.quantidadeDeEspacoEmBranco() + " espaços em branco, " + texto.quantidadeDeVogais()
				+ " vogais ");
		System.out.println(texto02.getTexto() + ", " + texto02.quantidadeDeCaracteres() + " Caracteres, "
				+ texto02.quantidadeDeEspacoEmBranco() + " espaço em branco, " + texto02.quantidadeDeVogais()
				+ " vogal");

		System.out.println(valor.getNumero() + ", " + valor.parOuImpar().getPar() + ", " + valor.parOuImpar().getImpar()
				+ ", " + valor.maiorQueDez() + ", " + "O dobro de " + valor.getNumero() + " é " + valor.dobro() + ", "
				+ valor.primo());

		System.out.println(valor02.getNumero() + ", " + valor02.parOuImpar().getPar() + ", "
				+ valor02.parOuImpar().getImpar() + ", " + valor02.maiorQueDez() + ", " + "O dobro de "
				+ valor02.getNumero() + " é " + valor02.dobro() + ", " + valor02.primo());

		System.out.println(
				cidade.getCidade() + ", " + cidade.gerenciar().getEstado() + ", " + cidade.gerenciar().getCapital());
		System.out.println(cidade02.getCidade() + ", " + cidade02.gerenciar().getEstado() + ", "
				+ cidade02.gerenciar().getCapital());
		System.out.println(cidade03.getCidade() + ", " + cidade03.gerenciar().getEstado() + ", "
				+ cidade03.gerenciar().getCapital());
	}

}
