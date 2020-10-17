package br.carlosab.page;

import br.carlosab.core.BasePage;

public class MenuPage extends BasePage {

	/* M�TODO PARA ACESSAR A TELA DE INSERIR NOVA CONTA */
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}

	/* M�TODO PARA ALTERAR CONTA */
	public void acessarTelaListarContas() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	/* M�TODO PARA ACESSAR A TELA DE MOVIMENTA��O */
	public void acessaTelaMovimentacao() {
		clicarLink("Criar Movimenta��o");
	}

	/* M�TODO PARA ACESSAR A TELA DE RESUMO */
	public void acessaTelaResumo() {
		clicarLink("Resumo Mensal");
	}
	
	/* M�TODO PARA ACESSAR A TELA DE HOME */
	public void acessaTelaHome() {
		clicarLink("Home");
	}

}
