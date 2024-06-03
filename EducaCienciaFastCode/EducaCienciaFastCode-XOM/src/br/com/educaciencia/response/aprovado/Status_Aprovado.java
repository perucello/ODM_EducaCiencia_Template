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
public class Status_Aprovado {

	String status_final = "aprovado";
	List<CondicaoAceite_Aprovado> condicaoAceite = new ArrayList<CondicaoAceite_Aprovado>();

	public Status_Aprovado() {
		this.condicaoAceite = new ArrayList<>();
	}

	public Status_Aprovado(String status_final, List<CondicaoAceite_Aprovado> condicaoAceite) {
		super();
		this.status_final = status_final;
		this.condicaoAceite = condicaoAceite;
	}

	public String getStatus_final() {
		return status_final;
	}

	public void setStatus_final(String status_final) {
		this.status_final = status_final;
	}

	public List<CondicaoAceite_Aprovado> getCondicaoAceite() {
		return condicaoAceite;
	}

	public void setCondicaoAceite(List<CondicaoAceite_Aprovado> condicaoAceite) {
		this.condicaoAceite = condicaoAceite;
	}

	/** Método para adicionar uma nova condição de aceite à lista aprovado */
	public void adicionarCondicaoAceiteAprovado_2(String regraCondicao, String regra, String status) {
		CondicaoAceite_Aprovado novaCondicao = new CondicaoAceite_Aprovado();
		novaCondicao.setRegra(regraCondicao);

		Motivos_Aprovado novoMotivo = new Motivos_Aprovado();
		novoMotivo.setStatus(status);
		novoMotivo.setRegra(regra);

		novaCondicao.adicionarMotivos_Aprovado(novoMotivo);
		condicaoAceite.add(novaCondicao);

		System.out.println("Status: " + novoMotivo.getStatus() + ", \nRegra: " + novoMotivo.getRegra());

	}

	public void mostrarLista_ODM_aprovados() {

		List<CondicaoAceite_Aprovado> listaCompleta = condicaoAceite;

		for (CondicaoAceite_Aprovado condicaoAprovado : listaCompleta) {
			System.out.println("Regra: " + condicaoAprovado.getRegra());

			List<Motivos_Aprovado> motivos = condicaoAprovado.getMotivos_Aprovado();

			for (Motivos_Aprovado motivoAprovado : motivos) {
				System.out.println("Status: " + motivoAprovado.getStatus() + ", \nRegra: " + motivoAprovado.getRegra());

			}
			System.out.println("******************");
		}
	}

}
