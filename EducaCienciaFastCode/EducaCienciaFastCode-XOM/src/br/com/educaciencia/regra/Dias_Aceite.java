package br.com.educaciencia.regra;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import br.com.educaciencia.request.Emissao;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Dias_Aceite {

	String data_request_Emissao = new Emissao().getDataEmissao();
	int regra_dias_aceite;
	boolean result_odm;

	public Dias_Aceite() {
		super();
	}

	public Dias_Aceite(String data_request_Emissao, int regra_dias_aceite, boolean result_odm) {
		super();
		this.data_request_Emissao = data_request_Emissao;
		this.regra_dias_aceite = regra_dias_aceite;
		this.result_odm = result_odm;
	}

	public String getData_request_Emissao() {
		return data_request_Emissao;
	}

	public void setData_request_Emissao(String data_request_Emissao) {
		this.data_request_Emissao = data_request_Emissao;
	}

	public int getRegra_dias_aceite() {
		return regra_dias_aceite;
	}

	public void setRegra_dias_aceite(int regra_dias_aceite) {
		this.regra_dias_aceite = regra_dias_aceite;
	}

	public boolean isResult_odm() {
		return result_odm;
	}

	public void setResult_odm(boolean result_odm) {
		this.result_odm = result_odm;
	}

	public boolean valida_regra_dias_aceite(String dataInicioRelacionamentoCedente, int regra_dias_aceite) {
		
		/************** DATA RECEBIDA ************************/
		String data_request_calculo = dataInicioRelacionamentoCedente;

		DateTimeFormatter converter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate data_convertida = LocalDate.parse(data_request_calculo, converter);

		/************** DATA ATUAL ***************************/
		LocalDate data_hoje = LocalDate.now();

		System.out.println("Data recebida: " + data_convertida);
		System.out.println("Data ODM: " + data_hoje);

		/************** CALCULO DE DIAS **********************/
		long diferencaEmDias = ChronoUnit.DAYS.between(data_convertida, data_hoje);
		int conversaoResult = (int) diferencaEmDias;

		int regra = regra_dias_aceite;

		if (conversaoResult >= 0 && conversaoResult <= regra) {
			System.out.println("Regra dias: " + regra);
			System.out.println("Diferença - dias: " + conversaoResult);
			result_odm = true;
		} else {
			result_odm = false;
		}
		System.out.println("Resultaod ODM: " + result_odm);

		/************** RESULTADO ***************************/
		return result_odm;
	}

	public boolean resultado_dias_odm_boolean_regra(String dataInicioRelacionamentoCedente, int regra) {
		valida_regra_dias_aceite(dataInicioRelacionamentoCedente, regra);
		/************** RESULTADO ***************************/
		return true;
	}

}
