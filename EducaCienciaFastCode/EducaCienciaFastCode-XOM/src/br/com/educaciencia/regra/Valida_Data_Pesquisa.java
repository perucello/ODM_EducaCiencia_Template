package br.com.educaciencia.regra;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Valida_Data_Pesquisa {
	
	/** Data da pesquisa */
	String data = getData();

	public Valida_Data_Pesquisa() {
		super();
	}

	public Valida_Data_Pesquisa(String data) {
		super();
		this.data = data;
	}

	public String getData() {
		
		/** ajustado */
		Calendar calendario = Calendar.getInstance();
		Date data = calendario.getTime();
		DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
		
		/** retorno para response */
		return dataFormatada.format(data);
	}

	public void setData(String data) {
		this.data = data;
	}

}
