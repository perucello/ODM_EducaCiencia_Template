package br.com.educaciencia.request;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Classificacao {

	String segmento = "";
	String subSegmento = "";

	public Classificacao() {
		super();
	}

	public Classificacao(String segmento, String subSegmento) {
		super();
		this.segmento = segmento;
		this.subSegmento = subSegmento;
	}

	public Classificacao(String segmento) {
		super();
		this.segmento = segmento;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getSubSegmento() {
		return subSegmento;
	}

	public void setSubSegmento(String subSegmento) {
		this.subSegmento = subSegmento;
	}

}
