package br.carlosab.tests;

import org.junit.Assert;
import org.junit.Test;

import br.carlosab.core.BaseTest;
import br.carlosab.page.HomePage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();

	@Test
	public void testSaldoConta(){
		Assert.assertEquals("222.00", page.obterSaldoConta("conta teste"));
	}
}
