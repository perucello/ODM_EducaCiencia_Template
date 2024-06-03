package br.com.educaciencia.response;

import java.util.ArrayList;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Regra {

	String regra = "";
	ArrayList<Motivos> motivo = new ArrayList<Motivos>();

	public Regra() {
		super();
	}

	public Regra(String regra, ArrayList<Motivos> motivo) {
		super();
		this.regra = regra;
		this.motivo = motivo;
	}

	public String getRegra() {
		return regra;
	}

	public void setRegra(String regra) {
		this.regra = regra;
	}

	public ArrayList<Motivos> getMotivo() {
		return motivo;
	}

	public void setMotivo(ArrayList<Motivos> motivo) {
		this.motivo = motivo;
	}

}
