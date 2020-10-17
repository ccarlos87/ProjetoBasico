package suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.carlosab.core.DriverFactory;
import br.carlosab.page.LoginPage;
import br.carlosab.tests.ContaTest;
import br.carlosab.tests.MovimentacaoTest;
import br.carlosab.tests.RemoverMovimentacaoContaTest;
import br.carlosab.tests.ResumoTest;
import br.carlosab.tests.SaldoTest;

//****	ORDEM DAS CLASSES A SEREM EXECUTADAS DENTRO DA SUITE
//****	CADA CLASSE EST� COM OS TESTS POR ORDEM ALFABETICA
@RunWith(Suite.class)
@SuiteClasses({

		ContaTest.class,
		MovimentacaoTest.class,
		RemoverMovimentacaoContaTest.class,
		SaldoTest.class,
		ResumoTest.class

})

public class SuiteGeral {

	private static LoginPage page = new LoginPage();

	/*O M�TODO ABAIXO IR� FAZER O LOGIN NA PAGINA ANTES DAS CLASSES LISTADAS ACIMA*/

	@BeforeClass
	public static void inicializa() {
		page.acessarTelaIniciar();
		page.setEmail("fredd19@gmail.com");
		page.setSenha("pampo2");
		page.clicaEntrar();
	}

	/*O M�TODO ABAIXO IR� FECHAR A PAGINA DEPOIS DA EXECU��O DAS CLASSES LISTADAS ACIMA*/
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
