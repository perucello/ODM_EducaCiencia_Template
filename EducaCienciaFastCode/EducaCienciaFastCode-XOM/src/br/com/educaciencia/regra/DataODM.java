package br.com.educaciencia.regra;

import java.time.LocalDate;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class DataODM {
	LocalDate dataODM = dataPesquisaODM();

	public DataODM() {
		super();
	}

	public DataODM(LocalDate dataODM) {
		super();
		this.dataODM = dataODM;
	}

	public LocalDate getDataODM() {
		return dataODM;
	}

	public void setDataODM(LocalDate dataODM) {
		this.dataODM = dataODM;
	}

	public LocalDate dataPesquisaODM() {

		String data_atual;
		LocalDate data_hoje = LocalDate.now();

		return data_hoje;

	}

}
