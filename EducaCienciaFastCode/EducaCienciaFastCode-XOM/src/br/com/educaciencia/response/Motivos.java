package br.com.educaciencia.response;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Motivos {
	private String status = "";
	private String codigo = "";
	private String motivo = "";

	public Motivos() {
		super();
	}

	public Motivos(String status, String codigo, String motivo) {
		super();
		this.status = status;
		this.codigo = codigo;
		this.motivo = motivo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

}