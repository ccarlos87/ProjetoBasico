package br.carlosab.page;

import br.carlosab.core.BasePage;

public class MenuPage extends BasePage {

	/* MÉTODO PARA ACESSAR A TELA DE INSERIR NOVA CONTA */
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}

	/* MÉTODO PARA ALTERAR CONTA */
	public void acessarTelaListarContas() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	/* MÉTODO PARA ACESSAR A TELA DE MOVIMENTAÇÃO */
	public void acessaTelaMovimentacao() {
		clicarLink("Criar Movimentação");
	}

	/* MÉTODO PARA ACESSAR A TELA DE RESUMO */
	public void acessaTelaResumo() {
		clicarLink("Resumo Mensal");
	}
	
	/* MÉTODO PARA ACESSAR A TELA DE HOME */
	public void acessaTelaHome() {
		clicarLink("Home");
	}

}
