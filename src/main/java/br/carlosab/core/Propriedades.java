package br.carlosab.core;

public class Propriedades {

	// classe para execução de vários testes com 1 pagina do browser aberta

	public static boolean FECHAR_BROWSER = false; // --->>> o "false" não fechará a aba do navegador

	/* todo campo que tiver o nome "Conta Alterada", será acrescido pela descrição
	 de um número, assim, não é necessário ficar trocando a descrição do campo sempre */
	public static String NOME_DA_CONTA_ALTERADA = "Conta Alterada" + System.nanoTime();

}
