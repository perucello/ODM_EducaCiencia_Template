package br.com.educaciencia.response;

import java.util.ArrayList;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Situacao {

	private String situacao = "";
	private ArrayList<CondicaoAceite> condicoesAceite;

	public Situacao() {
		super();
	}

	public Situacao(String situacao, ArrayList<CondicaoAceite> condicoesAceite) {
		this.situacao = situacao;
		this.condicoesAceite = condicoesAceite;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public ArrayList<CondicaoAceite> getCondicoesAceite() {
		return condicoesAceite;
	}

	public void setCondicoesAceite(ArrayList<CondicaoAceite> condicoesAceite) {
		this.condicoesAceite = condicoesAceite;
	}

	@Override
	public String toString() {
		return "Situacao{" + "situacao='" + situacao + '\'' + ", condicoesAceite=" + condicoesAceite + '}';
	}
}
