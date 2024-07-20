package com.edivan.celular;

public class Iphone implements Ligacao, Navegador, ReprodutorMusica {

	@Override
	public void tocar() {
		System.out.println("A música está sendo tocada");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada!");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("A música " + musica + " foi escolhida");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Página exibida");
	}

	@Override
	public void adicionarAba() {
		System.out.println("Nova aba aberta!");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada!");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Ligação atendida");
	}

	@Override
	public void correioVoz() {
		System.out.println("Você tem x mensagens no correio de voz");
	}

}
