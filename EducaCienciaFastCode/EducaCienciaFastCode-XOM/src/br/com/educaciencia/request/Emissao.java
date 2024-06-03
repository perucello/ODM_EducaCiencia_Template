package br.com.educaciencia.request;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Emissao {

	String dataEmissao; // YYYY-mm-dd - padrao Americano

	public Emissao() {
		super();
	}

	public Emissao(String dataEmissao) {
		super();
		this.dataEmissao = dataEmissao;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

}
