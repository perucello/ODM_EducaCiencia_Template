package br.com.educaciencia.response.aprovado;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Motivos_Aprovado {
	private String status = "";
	private String regra = "";

	public Motivos_Aprovado() {
		super();
	}

	public Motivos_Aprovado(String status, String regra) {
		super();
		this.status = status;
		this.regra = regra;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegra() {
		return regra;
	}

	public void setRegra(String regra) {
		this.regra = regra;
	}

}