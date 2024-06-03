package br.com.educaciencia.regra;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Trata_nulo {

	Double valor; // liquidezSacadoCedente_D0

	boolean objeto6_ateVencto = false; 
	boolean objeto1_ateVencto = false;
	
	boolean objeto6_aposVencto = false; 
	boolean objeto1_aposVencto = false;

	boolean resultado = false;

	public Trata_nulo() {
		super();
	}

	public Trata_nulo(Double valor, boolean objeto6_ateVencto, boolean objeto1_ateVencto, boolean objeto6_aposVencto,
			boolean objeto1_aposVencto, boolean resultado) {
		super();
		this.valor = valor;
		this.objeto6_ateVencto = objeto6_ateVencto;
		this.objeto1_ateVencto = objeto1_ateVencto;
		this.objeto6_aposVencto = objeto6_aposVencto;
		this.objeto1_aposVencto = objeto1_aposVencto;
		this.resultado = resultado;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isObjeto6_ateVencto() {
		return objeto6_ateVencto;
	}

	public void setObjeto6_ateVencto(boolean objeto6_ateVencto) {
		this.objeto6_ateVencto = objeto6_ateVencto;
	}

	public boolean isObjeto1_ateVencto() {
		return objeto1_ateVencto;
	}

	public void setObjeto1_ateVencto(boolean objeto1_ateVencto) {
		this.objeto1_ateVencto = objeto1_ateVencto;
	}

	public boolean isObjeto6_aposVencto() {
		return objeto6_aposVencto;
	}

	public void setObjeto6_aposVencto(boolean objeto6_aposVencto) {
		this.objeto6_aposVencto = objeto6_aposVencto;
	}

	public boolean isObjeto1_aposVencto() {
		return objeto1_aposVencto;
	}

	public void setObjeto1_aposVencto(boolean objeto1_aposVencto) {
		this.objeto1_aposVencto = objeto1_aposVencto;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	/** METODOS PARA TRATAMENTO DE DADOS */

	public boolean checagem_mesesVencimento(boolean checagem) {
		System.out.println("********* checagem_mesesVencimento *********");
		if (checagem == true) {
			resultado = true;
		}
		System.out.println("checagem_mesesVencimento: " + resultado);
		return resultado;
	}

	public boolean checagem_Nulo(Double valor) {
		// System.out.println("********* checagem_Nulo *********");
		try {
			if (valor == null) {
				resultado = true;
				// System.out.println("resultado valor == nulo -> " + resultado);
			} else {
				resultado = false;
				// System.out.println("resultado valor não é nulo -> " + resultado);
			}
		} catch (Exception e) {
			resultado = true;
			System.out.println("exception (valida true - nulo) -> " + resultado);
		}
		return resultado;
	}
}
