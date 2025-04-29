package entidades;

public interface ReprodutorMusical {
	void tocar();
	
	void pausar();
	
	void selecionarMusica(String musica);
	
	void avançarFaixa();
	
	void voltarFaixa();
	
	void ativarAleatorio();
	
	void desativarAleatorio();
	
	default void ativarRepeticaoFaixa() {
		System.out.println("Repeticao ativada.");
	}
	
	default void desativarRepeticaoFaixa() {
		System.out.println("Repeticao desativada.");
	}
	
	void aumentarVolume();
	
	void diminuirVolume();
	
	default void silenciar() {
		System.out.println("Volume silenciado.");
	}
}
