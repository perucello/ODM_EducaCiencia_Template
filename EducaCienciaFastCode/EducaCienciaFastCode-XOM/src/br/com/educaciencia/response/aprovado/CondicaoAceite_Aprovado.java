package br.com.educaciencia.response.aprovado;

import java.util.ArrayList;
import java.util.List;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class CondicaoAceite_Aprovado {
	
	private String regra = "";
	private List<Motivos_Aprovado> motivos_Aprovado;

	public CondicaoAceite_Aprovado() {
		super();
	}

	public CondicaoAceite_Aprovado(String regra, List<Motivos_Aprovado> motivos_Aprovado) {
		super();
		this.regra = regra;
		this.motivos_Aprovado = motivos_Aprovado;
	}

	public String getRegra() {
		return regra;
	}

	public void setRegra(String regra) {
		this.regra = regra;
	}

	public List<Motivos_Aprovado> getMotivos_Aprovado() {
		return motivos_Aprovado;
	}

	public void setMotivos_Aprovado(List<Motivos_Aprovado> motivos_Aprovado) {
		this.motivos_Aprovado = motivos_Aprovado;
	}

	/** Método para adicionar um novo motivo à lista de motivos */
	public void adicionarMotivos_Aprovado(Motivos_Aprovado novoMotivo) {
		if (motivos_Aprovado == null || motivos_Aprovado.equals("")) {
			motivos_Aprovado = new ArrayList<>();
		}
		motivos_Aprovado.add(novoMotivo);
	}

}