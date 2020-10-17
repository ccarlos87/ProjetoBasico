package br.carlosab.tests;

import org.junit.Assert;
import org.junit.Test;

import br.carlosab.core.BaseTest;
import br.carlosab.core.Propriedades;
import br.carlosab.page.ContasPage;
import br.carlosab.page.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest{
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	/* TESTE PARA EXCLUIR CONTA */
	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListarContas();
		contasPage.clicaExcluirConta(Propriedades.NOME_DA_CONTA_ALTERADA);
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemError());
	}

}
