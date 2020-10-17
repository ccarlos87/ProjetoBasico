package br.carlosab.page;

import org.openqa.selenium.By;

import br.carlosab.core.BasePage;

public class ContasPage extends BasePage {

	/* M�TODO PARA INSERIR NOME PARA NOVA CONTA */
	public void setNome(String nome) {
		escrever("nome", nome);
	}

	/* M�TODO PARA SALVAR NOVA CONTA */
	public void clicaSalvar() {
		clicarBotaoPorTexto("Salvar");
		//clicarBotao(By.xpath("//button[.='Salvar']"));
	}

	/* M�TODO PARA VALIDAR MENSAGEM DE SUCESSO PARA NOVA CONTA */
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

	/* M�TODO PARA CLICAR NO BOT�O DE EDITAR CONTA */
	public void clicaAlterarConta(String string) {
		obterCelula("Conta", string, "A��es", "tabelaContas")
				.findElement(By.xpath("//*[@id='tabelaContas']//tr/..//td/..//span[@class='glyphicon glyphicon-edit']"))
				.click();
	}
	
	/* M�TODO PARA CLICAR NO BOT�O DE EXCLUIR CONTA */
	public void clicaExcluirConta(String string) {
		obterCelula("Conta", string, "A��es", "tabelaContas")
		.findElement(By.xpath("//*[@id='tabelaContas']//tr/..//td/..//span[@class='glyphicon glyphicon-remove-circle']"))
		.click();
	}

	/* M�TODO PARA VALIDAR MENSAGEM DE SUCESSO PARA NOVA CONTA */
	public String obterMensagemError() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}

}
