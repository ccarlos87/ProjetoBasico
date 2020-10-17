package br.carlosab.page;

import org.openqa.selenium.By;

import br.carlosab.core.BasePage;

public class ResumoPage extends BasePage {

	/** MÉTODO PARA CLICAR NO BOTÃO EXCUIR REGISTRO DE MOVIMENTAÇÃO **/
	public void excluirMovimentacao() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
}
