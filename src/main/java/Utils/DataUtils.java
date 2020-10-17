package Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

	/*** MÉTODO PARA INDICAR A QUANTIDADE DE DIAS DE DIFERENÇA, À PARTIR DA DATA ATUAL ***/
	public static Date obterDataComDiferencaDias(int qtdDias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, qtdDias);
		return calendar.getTime();
	}

	/*** MÉTODO FORMATAR A DATA DO MÉTODO ACIMA CONFORME O PADRÃO DDMMYYYY ***/
	public static String obterDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		return format.format(data);
	}
}
