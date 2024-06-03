package br.com.educaciencia.response;

import java.util.ArrayList;
import java.util.List;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class CondicaoAceite {
	private String regra = "";
	private List<Motivos> motivos;

	public CondicaoAceite() {
		super();
	}

	public CondicaoAceite(String regra, List<Motivos> motivos) {
		super();
		this.regra = regra;
		this.motivos = motivos;
	}

	public String getRegra() {
		return regra;
	}

	public void setRegra(String regra) {
		this.regra = regra;
	}

	public List<Motivos> getMotivos() {
		return motivos;
	}

	public void setMotivos(List<Motivos> motivos) {
		this.motivos = motivos;
	}

	/** Método para adicionar um novo motivo à lista de motivos */
	public void adicionarMotivo(Motivos novoMotivo) {
		if (motivos == null || motivos.equals("")) {
			motivos = new ArrayList<>();
		}
		motivos.add(novoMotivo);
	}

}