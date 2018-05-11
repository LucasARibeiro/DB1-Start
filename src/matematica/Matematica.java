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
			verificador.setPar("� par");
			verificador.setImpar("n�o � impar");
			return verificador;
		} else {
			verificador.setPar("n�o � par");
			verificador.setImpar("� impar");
			return verificador;
		}
	}

	public String maiorQueDez() {
		if (numero > 10) {
			return "� maior que 10";

		} else {
			return "n�o � maior que 10";
		}

	}

	public int dobro() {

		int dobro = numero * 2;
		return dobro;

	}

	public String primo() {

		int contador = 0;

		if (numero < 2) {
			return "n � primo";
		} else {

			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				return "� primo";
			} else {
				return "n�o � primo";
			}

		}

	}

}
