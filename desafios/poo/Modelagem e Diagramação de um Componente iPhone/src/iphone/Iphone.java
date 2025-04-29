package iphone;

import java.util.ArrayList;
import java.util.List;

import entidades.AparelhoTelefonico;
import entidades.NavegadorInternet;
import entidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	// Atributos
	private List<String> contatos = new ArrayList<>();
	private String musicaAtual;
	private boolean aleatorioAtivo;
	private List<String> abasNavegador = new ArrayList<>();
	private int abaAtual = -1;
	private int volume = 50;

	// Construtor
	public Iphone() {

	}

	// -- Aparelho Telefonico --
	@Override
	public void adicionarContato(String numero) {
		contatos.add(numero);
		System.out.println("[IPHONE] Contato adicionado: " + numero);
	}

	@Override
	public void removerContato(String numero) {
		contatos.remove(numero);
		System.out.println("[IPHONE] Contato removido: " + numero);
	}

	@Override
	public void favoritarNumero(String numero) {
		System.out.println("[IPHONE] Número favoritado: " + numero);
	}

	@Override
	public void ativarCorreioVoz() {
		System.out.println("[IPHONE] Correio de voz em execucao.");

	}

	@Override
	public void aumentarVolume() {
		volume = volume - 10;
		System.out.println(volume);
	}

	@Override
	public void diminuirVolume() {
		volume = volume - 10;
		System.out.println(volume);
	}

	@Override
	public void silenciar() {
		AparelhoTelefonico.super.silenciar();
	}

	// -- Reprodutor Musical --
	@Override
	public void selecionarMusica(String musica) {
		musicaAtual = musica;
		System.out.println("[IPHONE] Música selecionada: " + musica);
	}

	@Override
	public void tocar() {
		System.out.println(
				"[IPHONE] Tocando música: " + (musicaAtual != null ? musicaAtual : "Nenhuma música selecionada"));
	}

	@Override
	public void pausar() {
		System.out.println("[IPHONE] Música pausada.");
	}

	@Override
	public void avançarFaixa() {
		System.out.println("[IPHONE] Avançando para próxima faixa.");
	}

	@Override
	public void voltarFaixa() {
		System.out.println("[IPHONE] Voltando para faixa anterior.");
	}

	@Override
	public void ativarAleatorio() {
		aleatorioAtivo = true;
		System.out.println("[IPHONE] Modo aleatório = " + aleatorioAtivo);
	}

	@Override
	public void desativarAleatorio() {
		aleatorioAtivo = false;
		System.out.println("[IPHONE] Modo aleatório = " + aleatorioAtivo);
	}

	// -- Navegador Internet--
	@Override
	public void exibiPagina(String URL) {
		System.out.println("[IPHONE] Exibindo página: " + URL);
		if (!abasNavegador.contains(URL)) {
			abasNavegador.add(URL);
		}
		abaAtual = abasNavegador.indexOf(URL);
	}

	@Override
	public void adicionarNovaPagina() {
		String novaPagina = "Nova aba " + (abasNavegador.size() + 1);
		abasNavegador.add(novaPagina);
		abaAtual = abasNavegador.size() - 1;
		System.out.println("[IPHONE] Nova aba adicionada: " + novaPagina);
	}

	@Override
	public void alternarParaAba(int index) {
		if (index >= 0 && index < abasNavegador.size()) {
			abaAtual = index;
			System.out.println("[IPHONE] Alternado para aba: " + abasNavegador.get(index));
		} else {
			System.out.println("[IPHONE] Índice de aba inválido.");
		}
	}

	@Override
	public void fecharPagina(int index) {
		if (index >= 0 && index < abasNavegador.size()) {
			String paginaRemovida = abasNavegador.remove(index);
			System.out.println("[IPHONE] Página fechada: " + paginaRemovida);
			abaAtual = abasNavegador.isEmpty() ? -1 : Math.min(abaAtual, abasNavegador.size() - 1);
		}
	}

	@Override
	public void abrirPagina() {
		adicionarNovaPagina();
	}

	@Override
	public void pesquisar(String termo) {
		System.out.println("[IPHONE] Pesquisando por: " + termo);
		exibiPagina("https://www.google.com/search?q=" + termo.replace(" ", "+"));
	}

	@Override
	public void favoritarPagina() {
		if (abaAtual != -1) {
			System.out.println("[IPHONE] Página favoritada: " + abasNavegador.get(abaAtual));
		}
	}

	@Override
	public void desfavoritarPagina() {
		if (abaAtual != -1) {
			System.out.println("[IPHONE] Página desfavoritada: " + abasNavegador.get(abaAtual));
		}
	}
}
