package br.carlosab.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.carlosab.core.BasePage;
import br.carlosab.core.DriverFactory;

public class MovimentacaoPage extends BasePage {

	public void setDataMovimentacao(String data) {
		escrever("data_transacao", data);
	}

	public void setDataPagamento(String data) {
		escrever("data_pagamento", data);
	}

	public void setDescricao(String descricao) {
		escrever("descricao", descricao);
	}

	public void setInteressado(String interessado) {
		escrever("interessado", interessado);
	}

	public void setValor(String valor) {
		escrever("valor", valor);
	}

	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}

	public void setStaturPago() {
		clicaRadio("status_pago");
	}

	public void salvar() {
		clicarBotaoPorTexto("Salvar");
	}

	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

	/***** MÉTODO PARA OBTER A LISTA DE ERROS EXIBIDA *****/
	public List<String> obterErros() {
		List<WebElement> erros = DriverFactory.getDriver().findElements(By.xpath("//div[@class='alert alert-danger']"));
		List<String> retorno = new ArrayList<String>();
		for (WebElement erro : erros) {
			retorno.add(erro.getText());
		}
		return retorno;

	}
	
	public String obterMensagemError() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}

}
