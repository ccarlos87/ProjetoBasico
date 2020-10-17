package br.carlosab.tests;

import org.junit.Assert;
import org.junit.Test;

import br.carlosab.core.BaseTest;
import br.carlosab.page.ContasPage;
import br.carlosab.page.MenuPage;

public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	/* TESTE PARA INSERIR NOVA CONTA */
	@Test
	public void testInserirConta() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta do Teste outra");
		contasPage.clicaSalvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

	/* TESTE PARA ALTERAR CONTA */
	@Test
	public void testAlterarConta() throws InterruptedException {
		menuPage.acessarTelaListarContas();
		contasPage.clicaAlterarConta("Conta do Teste 2");
		contasPage.setNome("Conta do Teste Alterada");
		contasPage.clicaSalvar();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}

	/* TESTE PARA INSERIR CONTA COM MESMO NOME */
	@Test
	public void testInserirContaMesmoNome() throws InterruptedException {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta do Teste Alterada");
		contasPage.clicaSalvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemError());
	}

	/* TESTE PARA ALTERAR CONTA */
	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListarContas();
		contasPage.clicaExcluirConta("Conta do Teste 2");
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemError());
	}
}
