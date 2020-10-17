package br.carlosab.tests;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Utils.DataUtils;
import br.carlosab.core.BaseTest;
import br.carlosab.page.MenuPage;
import br.carlosab.page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	MovimentacaoPage movimentacaoPage = new MovimentacaoPage();

	/* TESTE PARA CRIAR MOVIMENTAÇÃO NUMA CONTA */
	@Test
	public void testInserirMovimentacao() {
		menuPage.acessaTelaMovimentacao();
		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(new Date()));		//APLICA A DATA ATUAL NO CAMPO DE DATA
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(new Date()));		//APLICA A DATA ATUAL NO CAMPO DE DATA
		movimentacaoPage.setDescricao("Descrição teste");
		movimentacaoPage.setInteressado("Algum interessado");
		movimentacaoPage.setValor("200");
		movimentacaoPage.setConta("Conta do Teste Alterada");
		movimentacaoPage.setStaturPago();
		movimentacaoPage.salvar();
		Assert.assertEquals("Movimentação adicionada com sucesso!", movimentacaoPage.obterMensagemSucesso());

	}

	/*
	 * TESTE PARA PARA VALIDAR MENSAGENS DE ERRO DOS CAMPOS DE PREENCHIMENTO
	 * OBRIGATORIOS
	 */
	@Test
	public void testCamposObrigatorios() {
		menuPage.acessaTelaMovimentacao();
		movimentacaoPage.salvar();
		List<String> erros = movimentacaoPage.obterErros();
		// Assert.assertEquals("Data da Movimentação é obrigatório", erros.get(0));
		// Assert.assertTrue(erros.contains("Data da Movimentação é obrigatório"));
		Assert.assertTrue(erros.containsAll(Arrays.asList("Data da Movimentação é obrigatório",
				"Data do pagamento é obrigatório", "Descrição é obrigatório", "Interessado é obrigatório",
				"Valor é obrigatório", "Valor deve ser um número")));
		Assert.assertEquals(6, erros.size());
	}

	// TESTE QUE REALIZEI DE MANEIRA SIMPLES
	@Test
	public void testInserirMovimentacaoComDataFutura() {
		menuPage.acessaTelaMovimentacao();
		movimentacaoPage.setDataMovimentacao("15/11/2020");
		movimentacaoPage.setDataPagamento("15/10/2020");
		movimentacaoPage.setDescricao("Descrição teste");
		movimentacaoPage.setInteressado("Algum interessado");
		movimentacaoPage.setValor("200");
		movimentacaoPage.setConta("Conta do Teste Alterada");
		movimentacaoPage.setStaturPago();
		movimentacaoPage.salvar();
		Assert.assertEquals("Data da Movimentação deve ser menor ou igual à data atual",
				movimentacaoPage.obterMensagemError());
	}

	// TESTE REALIZADO PELO PROFESSOR COM NOVOS MÉTODOS
	@Test
	public void testInserirMovimentacaoDataFutura() {
		menuPage.acessaTelaMovimentacao();

		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);

		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDescricao("Descrição teste");
		movimentacaoPage.setInteressado("Algum interessado");
		movimentacaoPage.setValor("200");
		movimentacaoPage.setConta("Conta do Teste Alterada");
		movimentacaoPage.setStaturPago();
		movimentacaoPage.salvar();
		List<String> erros = movimentacaoPage.obterErros();
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação deve ser menor ou igual à data atual")));
		Assert.assertEquals(1, erros.size());
	}
	
	
}
