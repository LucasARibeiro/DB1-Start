package geografia;

public class Cidade {

	private String cidade;
	private String estado;
	private String capital;

	public Cidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Cidade gerenciar() {
		Cidade pertence = new Cidade(cidade);

		if (cidade == "Curitiba") {
			pertence.setCapital("� capital");
			pertence.setEstado("Pertence ao PR");
			return pertence;

		} else if (cidade == "Maring�") {
			pertence.setCapital("n�o � capital");
			pertence.setEstado("Pertence ao PR");
			return pertence;

		} else if (cidade == "Londrina") {
			pertence.setCapital("n�o � capital");
			pertence.setEstado("Pertence ao PR");
			return pertence;

		} else if (cidade == "Pinhais") {
			pertence.setCapital("n�o � capital");
			pertence.setEstado("Pertence ao PR");
			return pertence;

		} else if (cidade == "Chapec�") {
			pertence.setCapital("n�o � capital");
			pertence.setEstado("Pertence ao PR");
			return pertence;

		} else if (cidade == "Joinvile") {
			pertence.setCapital("n�o � capital");
			pertence.setEstado("Pertence ao SC");
			return pertence;

		} else if (cidade == "Blumenau") {
			pertence.setCapital("n�o � capital");
			pertence.setEstado("Pertence ao SC");
			return pertence;

		} else if (cidade == "Florianopolis") {
			pertence.setCapital("� capital");
			pertence.setEstado("Pertence ao SC");
			return pertence;

		} else if (cidade == "Porto Alegre") {
			pertence.setCapital("� capital");
			pertence.setEstado("Pertence ao RS");
			return pertence;

		} else if (cidade == "Gramado") {
			pertence.setCapital("n�o � capital");
			pertence.setEstado("Pertence ao RS");
			return pertence;
		}
		System.out.println("O valor informado n�o faz parte do cenario");
		return pertence;
	}

}
