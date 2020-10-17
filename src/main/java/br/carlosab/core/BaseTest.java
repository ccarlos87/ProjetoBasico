package br.carlosab.core;

import static br.carlosab.core.DriverFactory.getDriver;
import static br.carlosab.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();
	
	/* O m�todo abaixo "inicializa", cont�m as a��es para login. Por isso, est� na classe BaseTest */

	@After
	public void finaliza() throws IOException {
		// m�todo para screenshot numa pasta criada criada no diret�rio
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + " .jpg"));

		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
