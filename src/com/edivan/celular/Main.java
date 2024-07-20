package com.edivan.celular;

public class Main {

	public static void main(String[] args) {
		Iphone tel = new Iphone();
		
		tel.selecionarMusica("Shivers");
		tel.tocar();
		tel.pausar();
		
		tel.exibirPagina();
		tel.adicionarAba();
		tel.atualizarPagina();
		
		tel.ligar("12345678");
		tel.atender();
		tel.correioVoz();

	}

}
