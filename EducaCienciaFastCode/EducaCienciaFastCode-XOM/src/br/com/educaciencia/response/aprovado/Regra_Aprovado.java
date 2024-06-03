package br.com.educaciencia.response.aprovado;

import java.util.ArrayList;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Regra_Aprovado {

	String regra;
	ArrayList<Motivos_Aprovado> motivo_regra_Aprovado = new ArrayList<Motivos_Aprovado>();

	public Regra_Aprovado() {
		super();
	}

	public Regra_Aprovado(String regra, ArrayList<Motivos_Aprovado> motivo_regra_Aprovado) {
		super();
		this.regra = regra;
		this.motivo_regra_Aprovado = motivo_regra_Aprovado;
	}

	public String getRegra() {
		return regra;
	}

	public void setRegra(String regra) {
		this.regra = regra;
	}

	public ArrayList<Motivos_Aprovado> getMotivo_regra_Aprovado() {
		return motivo_regra_Aprovado;
	}

	public void setMotivo_regra_Aprovado(ArrayList<Motivos_Aprovado> motivo_regra_Aprovado) {
		this.motivo_regra_Aprovado = motivo_regra_Aprovado;
	}

}
