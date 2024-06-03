package br.com.educaciencia.response;

import br.com.educaciencia.regra.Trata_nulo;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Valida_Solicitacao {

	boolean valida_objeto6_ateVencto = new Trata_nulo().isObjeto6_ateVencto();
	boolean valida_objeto1_ateVencto = new Trata_nulo().isObjeto1_ateVencto();
	boolean valida_objeto6_aposVencto = new Trata_nulo().isObjeto6_aposVencto();
	boolean valida_objeto1_aposVencto = new Trata_nulo().isObjeto1_aposVencto();

	public Valida_Solicitacao() {
		super();
	}

	public Valida_Solicitacao(boolean valida_objeto6_ateVencto, boolean valida_objeto1_ateVencto,
			boolean valida_objeto6_aposVencto, boolean valida_objeto1_aposVencto) {
		super();
		this.valida_objeto6_ateVencto = valida_objeto6_ateVencto;
		this.valida_objeto1_ateVencto = valida_objeto1_ateVencto;
		this.valida_objeto6_aposVencto = valida_objeto6_aposVencto;
		this.valida_objeto1_aposVencto = valida_objeto1_aposVencto;
	}

	public boolean isValida_objeto6_ateVencto() {
		return valida_objeto6_ateVencto;
	}

	public void setValida_objeto6_ateVencto(boolean valida_objeto6_ateVencto) {
		this.valida_objeto6_ateVencto = valida_objeto6_ateVencto;
	}

	public boolean isValida_objeto1_ateVencto() {
		return valida_objeto1_ateVencto;
	}

	public void setValida_objeto1_ateVencto(boolean valida_objeto1_ateVencto) {
		this.valida_objeto1_ateVencto = valida_objeto1_ateVencto;
	}

	public boolean isValida_objeto6_aposVencto() {
		return valida_objeto6_aposVencto;
	}

	public void setValida_objeto6_aposVencto(boolean valida_objeto6_aposVencto) {
		this.valida_objeto6_aposVencto = valida_objeto6_aposVencto;
	}

	public boolean isValida_objeto1_aposVencto() {
		return valida_objeto1_aposVencto;
	}

	public void setValida_objeto1_aposVencto(boolean valida_objeto1_aposVencto) {
		this.valida_objeto1_aposVencto = valida_objeto1_aposVencto;
	}

}
