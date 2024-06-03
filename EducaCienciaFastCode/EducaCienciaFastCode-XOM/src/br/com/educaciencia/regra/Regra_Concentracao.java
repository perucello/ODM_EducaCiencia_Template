package br.com.educaciencia.regra;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Regra_Concentracao {

	int concentracaoPolitica;
	int bonus;
	int concentracao;
	
	public Regra_Concentracao() {
		super();
	}

	
	
	

	public boolean calculo_ConcentracaoPolitica_Bonus(int concentracaoPolitica, int bonus, int concentracaoSacadoCed) {

		System.out.println("******** Dados de Validacao do Método ******** ");
		concentracaoPolitica = this.concentracaoPolitica;
		bonus = this.bonus;

		int soma = concentracaoPolitica + bonus;

		System.out.println("--- concentracaoPolitica: " + concentracaoPolitica);
		System.out.println("--- bonus: " + bonus);
		System.out.println("--- soma: " + soma);
		System.out.println("--- concentracaoSacadoCed: " + concentracaoSacadoCed);

		boolean retorno;
		if (soma >= concentracaoSacadoCed) {
			System.out
					.println("--- valida que soma " + soma + " >= " + concentracaoSacadoCed + " concentracaoSacadoCed");
			retorno = true;
			System.out.println("--- IF - retorno: " + retorno);
		} else {
			System.out
					.println("--- valida que soma " + soma + " < " + concentracaoSacadoCed + " concentracaoSacadoCed");
			retorno = false;
			System.out.println("--- ELSE - retorno: " + retorno);
		}
		System.out.println("***********************************************");
		return retorno;

	}

	public boolean calculo_ConcentracaoPCD_ConcentracaoSacadoCedente(int concentracaoPCD,  int bonus, int concentracaoSacadoCed) {

		System.out.println("******** Dados de Validacao do Método ******** ");
		boolean retorno;
		int soma = concentracaoPCD + bonus;

		System.out.println("--- concentracaoPCD: " + concentracaoPCD);
		System.out.println("--- bonus: " + bonus);
		System.out.println("--- soma: " + soma);
		System.out.println("--- concentracaoSacadoCed: " + concentracaoSacadoCed);


		if (soma >= concentracaoSacadoCed) {
			System.out.println("IF valida que concentracaoPCD " + concentracaoPCD + " >= " + concentracaoSacadoCed
					+ " concentracaoSacadoCed");
			System.out
					.println("--- valida que soma " + soma + " >= " + concentracaoSacadoCed + " concentracaoSacadoCed");
			retorno = true;
		} else {
			System.out.println("IF valida que concentracaoPCD " + concentracaoPCD + " < " + concentracaoSacadoCed
					+ " concentracaoSacadoCed");
			System.out
					.println("--- valida que soma " + soma + " < " + concentracaoSacadoCed + " concentracaoSacadoCed");
			retorno = false;
		}
		return retorno;

	}

}
