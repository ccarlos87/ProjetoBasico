package br.carlosab.tests;

import org.junit.Assert;
import org.junit.Test;

import br.carlosab.core.BaseTest;
import br.carlosab.core.DriverFactory;
import br.carlosab.page.MenuPage;
import br.carlosab.page.ResumoPage;

public class ResumoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();

	/* TESTE PARA EXCLUIR MOVIMENTA��O */
	@Test
	public void testExcluirMovimentacao() {
		menuPage.acessaTelaResumo();
		resumoPage.excluirMovimentacao();
		Assert.assertEquals("Movimenta��o removida com sucesso!", resumoPage.obterMensagemSucesso());
	}

	
	/* TESTE PARA APENAS VALIDAR A TELA DE RESUMO */
	@Test
	public void testResumoMensal() {
		menuPage.acessaTelaResumo();
		Assert.assertEquals("", DriverFactory.getDriver().getTitle()); //VALIDANDO � PARTIR DO T�TULO DA P�GINA
	}

}
