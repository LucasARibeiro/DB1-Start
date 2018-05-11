package matematica;

public class Matematica {

	private int numero;
	private String par;
	private String impar;

	public Matematica() {

	}

	public Matematica(int numero) {
		this.numero = numero;

	}

	public int getNumero() {
		return numero;
	}

	public String getPar() {
		return par;
	}

	public String getImpar() {
		return impar;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPar(String par) {
		this.par = par;
	}

	public void setImpar(String impar) {
		this.impar = impar;
	}

	public Matematica parOuImpar() {
		Matematica verificador = new Matematica(numero);
		if (numero % 2 == 0) {
			verificador.setPar("é par");
			verificador.setImpar("não é impar");
			return verificador;
		} else {
			verificador.setPar("não é par");
			verificador.setImpar("é impar");
			return verificador;
		}
	}

	public String maiorQueDez() {
		if (numero > 10) {
			return "é maior que 10";

		} else {
			return "não é maior que 10";
		}

	}

	public int dobro() {

		int dobro = numero * 2;
		return dobro;

	}

	public String primo() {

		int contador = 0;

		if (numero < 2) {
			return "n é primo";
		} else {

			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				return "é primo";
			} else {
				return "não é primo";
			}

		}

	}

}
