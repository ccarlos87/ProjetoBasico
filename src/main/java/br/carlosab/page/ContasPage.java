package br.carlosab.page;

import org.openqa.selenium.By;

import br.carlosab.core.BasePage;

public class ContasPage extends BasePage {

	/* MÉTODO PARA INSERIR NOME PARA NOVA CONTA */
	public void setNome(String nome) {
		escrever("nome", nome);
	}

	/* MÉTODO PARA SALVAR NOVA CONTA */
	public void clicaSalvar() {
		clicarBotaoPorTexto("Salvar");
		//clicarBotao(By.xpath("//button[.='Salvar']"));
	}

	/* MÉTODO PARA VALIDAR MENSAGEM DE SUCESSO PARA NOVA CONTA */
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

	/* MÉTODO PARA CLICAR NO BOTÃO DE EDITAR CONTA */
	public void clicaAlterarConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
				.findElement(By.xpath("//*[@id='tabelaContas']//tr/..//td/..//span[@class='glyphicon glyphicon-edit']"))
				.click();
	}
	
	/* MÉTODO PARA CLICAR NO BOTÃO DE EXCLUIR CONTA */
	public void clicaExcluirConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
		.findElement(By.xpath("//*[@id='tabelaContas']//tr/..//td/..//span[@class='glyphicon glyphicon-remove-circle']"))
		.click();
	}

	/* MÉTODO PARA VALIDAR MENSAGEM DE SUCESSO PARA NOVA CONTA */
	public String obterMensagemError() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}

}
