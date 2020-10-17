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
//****	CADA CLASSE ESTÁ COM OS TESTS POR ORDEM ALFABETICA
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

	/*O MÉTODO ABAIXO IRÁ FAZER O LOGIN NA PAGINA ANTES DAS CLASSES LISTADAS ACIMA*/

	@BeforeClass
	public static void inicializa() {
		page.acessarTelaIniciar();
		page.setEmail("fredd19@gmail.com");
		page.setSenha("pampo2");
		page.clicaEntrar();
	}

	/*O MÉTODO ABAIXO IRÁ FECHAR A PAGINA DEPOIS DA EXECUÇÃO DAS CLASSES LISTADAS ACIMA*/
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
