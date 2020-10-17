package br.carlosab.tests;

import org.junit.Assert;
import org.junit.Test;

import br.carlosab.core.BaseTest;
import br.carlosab.core.Propriedades;
import br.carlosab.page.HomePage;
import br.carlosab.page.MenuPage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menuPage = new MenuPage();

	@Test
	public void testSaldoConta() {
		menuPage.acessaTelaHome();
		Assert.assertEquals("200.00", page.obterSaldoConta(Propriedades.NOME_DA_CONTA_ALTERADA));
	}
}
