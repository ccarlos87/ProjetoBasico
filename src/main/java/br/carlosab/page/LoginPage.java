package br.carlosab.page;

import br.carlosab.core.BasePage;
import br.carlosab.core.DriverFactory;

public class LoginPage extends BasePage {

	public void acessarTelaIniciar() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/login");
	}

	public void setEmail(String email) {
		escrever("email", email);
	}

	public void setSenha(String senha) {
		escrever("senha", senha);
	}

	public void clicaEntrar() {
		clicarBotaoPorTexto("Entrar");
		// clicarBotao(By.xpath("//button[.='Entrar']"));

	}

}
