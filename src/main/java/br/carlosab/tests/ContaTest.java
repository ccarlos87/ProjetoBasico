package br.carlosab.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.carlosab.core.BaseTest;
import br.carlosab.core.Propriedades;
import br.carlosab.page.ContasPage;
import br.carlosab.page.MenuPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING) //------>>> ANOTAÇÃO PARA QUE OS TESTES DESTA CLASSE, SEJAM EXECUTADOS EM ORDEM ALFABETICA
public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	/* TESTE PARA INSERIR NOVA CONTA */
	@Test
	public void test1_InserirConta() {					//--->>> NOME DOS MÉTODOS ALTERADOS PARA EXECUÇÃO EM ORDEM ALFABETICA
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta do Teste");
		contasPage.clicaSalvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

	/* TESTE PARA ALTERAR CONTA */
	@Test
	public void test2_AlterarConta() throws InterruptedException {
		menuPage.acessarTelaListarContas();
		contasPage.clicaAlterarConta("Conta do Teste");
		contasPage.setNome(Propriedades.NOME_DA_CONTA_ALTERADA);
		contasPage.clicaSalvar();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}

	/* TESTE PARA INSERIR CONTA COM MESMO NOME */
	@Test
	public void test3_InserirContaMesmoNome() throws InterruptedException {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome(Propriedades.NOME_DA_CONTA_ALTERADA);
		contasPage.clicaSalvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemError());
	}

	
}
