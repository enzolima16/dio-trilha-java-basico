package entidades;

public interface NavegadorInternet {
	void exibiPagina(String URL);

	void adicionarNovaPagina();

	void alternarParaAba(int index);

	void fecharPagina(int index);

	void abrirPagina();

	default void voltarPagina() {
		System.out.println("Retrocedendo a pagina.");
	}

	default void avancarPagina() {
		System.out.println("Avançando a pagina.");
	}

	void pesquisar(String termo);

	void favoritarPagina();

	void desfavoritarPagina();

}
