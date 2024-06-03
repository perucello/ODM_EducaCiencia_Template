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
public class Dias_Relacionamento {

	String data_request_calcula = new Emissao().getDataEmissao();
	boolean result_odm;

	int regra_dias_relacionamento;

	public Dias_Relacionamento() {
		super();
	}

	public Dias_Relacionamento(String data_request_calcula, boolean result_odm) {
		super();
		this.data_request_calcula = data_request_calcula;
		this.result_odm = result_odm;
	}

	public String getData_request_calcula() {
		return data_request_calcula;
	}

	public void setData_request_calcula(String data_request_calcula) {
		this.data_request_calcula = data_request_calcula;
	}

	public boolean isResult_odm() {
		return result_odm;
	}

	public void setResult_odm(boolean result_odm) {
		this.result_odm = result_odm;
	}

	public int getRegra_dias_relacionamento() {
		return regra_dias_relacionamento;
	}

	public void setRegra_dias_relacionamento(int regra_dias_relacionamento) {
		this.regra_dias_relacionamento = regra_dias_relacionamento;
	}

	public boolean result_dias_odm_boolean(String dataInicioRelacionamentoCedente, int regra_dias_relacionamento) {
		/************** DATA RECEBIDA ************************/
		String data_request_calculo = dataInicioRelacionamentoCedente;
		System.out.println("data_request_calculo: " + data_request_calculo);

		DateTimeFormatter converter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate data_convertida = LocalDate.parse(data_request_calculo, converter);

		/************** DATA ATUAL ***************************/
		LocalDate data_hoje = LocalDate.now();
		System.out.println("data_hoje: " + data_hoje);

		/************** CALCULO DE DIAS **********************/
		long diferencaEmDias = ChronoUnit.DAYS.between(data_convertida, data_hoje);
		int conversaoResult = (int) diferencaEmDias;
		System.out.println("Diferença de dias: " + conversaoResult);

		int regra = regra_dias_relacionamento;

		if (conversaoResult >= 0 && conversaoResult <= regra) {
			System.out.println("dias >= regra: true");
			result_odm = true;
		} else {
			result_odm = false;
			System.out.println("dias <= regra: false");
		}

		/************** RESULTADO ***************************/
		return result_odm;
	}

	public boolean result_dias_odm_boolean_regra(String dataInicioRelacionamentoCedente, int regra) {
		result_dias_odm_boolean(dataInicioRelacionamentoCedente, regra);
		/************** RESULTADO ***************************/
		return true;
	}

}
