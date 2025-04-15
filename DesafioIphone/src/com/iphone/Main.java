package com.iphone;

import com.iphone.models.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		
		// TESTANDO FUNCIONALIDADES DO PLAYER
		meuIphone.getMusicPlayer().tocarMusica();
		meuIphone.getMusicPlayer().pausarMusica();
		meuIphone.getMusicPlayer().selecionarMusica();
		
		//TESTANDO FUNCIONALIDADES DO TELEFONE
		meuIphone.getPhone().ligar();
		meuIphone.getPhone().atender();
		meuIphone.getPhone().encerrarChamada();
		
		//TESTANDO FUNCIONALIDADES DO NAVEGADOR 
		meuIphone.getBrowser().exibirPagina();
		meuIphone.getBrowser().addNovaGuia();
		meuIphone.getBrowser().atualizarGuia();
		
	}

}
