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
public class Status {

	String status_final = "";
	List<CondicaoAceite> condicaoAceite = new ArrayList<CondicaoAceite>();

	public Status() {
		this.condicaoAceite = new ArrayList<>();
	}

	public Status(String status_final, List<CondicaoAceite> condicaoAceite) {
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

	public List<CondicaoAceite> getCondicaoAceite() {
		return condicaoAceite;
	}

	public void setCondicaoAceite(List<CondicaoAceite> condicaoAceite) {
		this.condicaoAceite = condicaoAceite;
	}

	/** Método para adicionar uma nova condição de aceite à lista */
	public void adicionarCondicaoAceite_2(String regra, String status, String codigo, String motivo) {
		CondicaoAceite novaCondicao = new CondicaoAceite();
		novaCondicao.setRegra(regra);

		Motivos novoMotivo = new Motivos();
		novoMotivo.setStatus(status);
		novoMotivo.setCodigo(codigo);
		novoMotivo.setMotivo(motivo);

		novaCondicao.adicionarMotivo(novoMotivo);
		condicaoAceite.add(novaCondicao);

		System.out.println("Status: " + novoMotivo.getStatus() + ", \nCódigo: " + novoMotivo.getCodigo()
				+ ", \nMotivo: " + novoMotivo.getMotivo());
	}

	public void mostrarLista_ODM() {
		// List<CondicaoAceite> listaCompleta = getListaCompletaCondicoesAceite();
		List<CondicaoAceite> listaCompleta = condicaoAceite;

		for (CondicaoAceite condicao : listaCompleta) {
			System.out.println("Regra: " + condicao.getRegra());

			List<Motivos> motivos = condicao.getMotivos();

			for (Motivos motivo1 : motivos) {
				System.out.println("Status: " + motivo1.getStatus() + ", \nCódigo: " + motivo1.getCodigo()
						+ ", \nMotivo: " + motivo1.getMotivo());
			}
			System.out.println("******************");
		}
	}
}
