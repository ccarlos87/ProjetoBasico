package br.carlosab.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.carlosab.core.BaseTest;
import br.carlosab.core.DriverFactory;
import br.carlosab.page.MenuPage;
import br.carlosab.page.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();

	/* TESTE PARA EXCLUIR MOVIMENTAÇÃO */
	@Test
	public void test1_ExcluirMovimentacao() {
		menuPage.acessaTelaResumo();
		resumoPage.excluirMovimentacao();
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
	}

	
	/* TESTE PARA APENAS VALIDAR A TELA DE RESUMO */
	@Test
	public void test2_ResumoMensal() {
		menuPage.acessaTelaResumo();
		Assert.assertEquals("", DriverFactory.getDriver().getTitle()); //VALIDANDO À PARTIR DO TÍTULO DA PÁGINA
	}

}
