package entidades;

public interface AparelhoTelefonico {

	default void ligar(String numero) {
		System.out.println("Ligacao iniciada");
	}

	void adicionarContato(String numero);

	void removerContato(String numero);

	void favoritarNumero(String numero);

	default void atender() {
		System.out.println("Ligacao atendida.");
	}

	default void desligar() {
		System.out.println("Ligacao encerrada.");
	}

	default void colocarEspera() {
		System.out.println("Ligacao colocada em espera.");
	}

	default void desativarEspera() {
		System.out.println("Ligacao retomada.");
	}

	void ativarCorreioVoz();

	default void ativarVivaVoz() {
		System.out.println("Viva-Voz ativado");
	}

	default void desativarVivaVoz() {
		System.out.println("Viva-Voz ativado");
	}

	void aumentarVolume();

	void diminuirVolume();

	default void silenciar() {
		System.out.println("Volume silenciado.");
	}
}
