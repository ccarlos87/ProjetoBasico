package Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

	/*** M�TODO PARA INDICAR A QUANTIDADE DE DIAS DE DIFEREN�A, � PARTIR DA DATA ATUAL ***/
	public static Date obterDataComDiferencaDias(int qtdDias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, qtdDias);
		return calendar.getTime();
	}

	/*** M�TODO FORMATAR A DATA DO M�TODO ACIMA CONFORME O PADR�O DDMMYYYY ***/
	public static String obterDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		return format.format(data);
	}
}
