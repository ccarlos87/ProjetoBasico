package br.carlosab.core;

import static br.carlosab.core.DriverFactory.getDriver;
import static br.carlosab.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.carlosab.page.LoginPage;

public class BaseTest {
	private LoginPage page = new LoginPage();

	@Rule
	public TestName testName = new TestName();
	
	/* O método abaixo "inicializa", contém as ações para login. Por isso, está na classe BaseTest */
	
	@Before
	public void inicializa() {
		page.acessarTelaIniciar();
		page.setEmail("fredd19@gmail.com");
		page.setSenha("pampo2");
		page.clicaEntrar();
	}

	@After
	public void finaliza() throws IOException {
		// método para screenshot numa pasta criada criada no diretório
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + " .jpg"));

		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
