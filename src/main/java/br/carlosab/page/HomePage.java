package br.carlosab.page;

import br.carlosab.core.BasePage;

public class HomePage extends BasePage {

	/* M�TODO PARA OBTER O SALDO DE UMA CONTA */
	public String obterSaldoConta(String nome) {
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
	}
}
