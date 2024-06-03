package br.com.educaciencia.request;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Prazos {

	int prazoCurto; 
	int prazoMinimo; 
	int prazoOpCredito; 
	int prazoTitulo;

	public Prazos() {
		super();
	}

	public Prazos(int prazoCurto, int prazoMinimo, int prazoOpCredito, int prazoTitulo) {
		super();
		this.prazoCurto = prazoCurto;
		this.prazoMinimo = prazoMinimo;
		this.prazoOpCredito = prazoOpCredito;
		this.prazoTitulo = prazoTitulo;
	}

	public int getPrazoCurto() {
		return prazoCurto;
	}

	public void setPrazoCurto(int prazoCurto) {
		this.prazoCurto = prazoCurto;
	}

	public int getPrazoMinimo() {
		return prazoMinimo;
	}

	public void setPrazoMinimo(int prazoMinimo) {
		this.prazoMinimo = prazoMinimo;
	}

	public int getPrazoOpCredito() {
		return prazoOpCredito;
	}

	public void setPrazoOpCredito(int prazoOpCredito) {
		this.prazoOpCredito = prazoOpCredito;
	}

	public int getPrazoTitulo() {
		return prazoTitulo;
	}

	public void setPrazoTitulo(int prazoTitulo) {
		this.prazoTitulo = prazoTitulo;
	}

}
