package br.com.educaciencia.request;

import java.math.BigDecimal;

/* ************************************************************** 
*************** EDUCACIENCIA FAST CODE **************************
*****************************************************************
****** Data: 27/04/2024
****** Projeto: Demo
****** Versão: 1.0
*****************************************************************/
public class Solicitacao_ODM {

	/** Boleto */
	Classificacao segmento;
	Prazos prazo_Curto;
	Emissao emissao;

	String produto;
	String destinoAutomaticoTitulo;
	double valorTitulo;
	int qtdDiasProrrogarTitulo;

	/** Cliente */
	String clientecnpjCpf;
	String clienteTipoPessoa;
	boolean clienteImpedido;
	boolean clientePermitido;
	int clienteTempoRelacionamento;
	String clienteScore;
	Double liquidezClienteAteVencto = null;
	Double liquidezClienteAposVencto = null;

	/** Fiador */
	String fiadorCnpjCpf;
	String fiadorTipoPessoa;
	boolean fiadorImpedido;
	boolean fiadorPermitido;
	int fiadorTempoRelacionamento;
	String fiadorScore;
	Double liquidezFiadorAteVencto = null;
	Double liquidezFiadorAposVencto = null;

	public Solicitacao_ODM() {
		super();
	}

	public Classificacao getSegmento() {
		return segmento;
	}

	public void setSegmento(Classificacao segmento) {
		this.segmento = segmento;
	}

	public Prazos getPrazo_Curto() {
		return prazo_Curto;
	}

	public void setPrazo_Curto(Prazos prazo_Curto) {
		this.prazo_Curto = prazo_Curto;
	}

	public Emissao getEmissao() {
		return emissao;
	}

	public void setEmissao(Emissao emissao) {
		this.emissao = emissao;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDestinoAutomaticoTitulo() {
		return destinoAutomaticoTitulo;
	}

	public void setDestinoAutomaticoTitulo(String destinoAutomaticoTitulo) {
		this.destinoAutomaticoTitulo = destinoAutomaticoTitulo;
	}

	public double getValorTitulo() {
		return valorTitulo;
	}

	public void setValorTitulo(double valorTitulo) {
		this.valorTitulo = valorTitulo;
	}

	public int getQtdDiasProrrogarTitulo() {
		return qtdDiasProrrogarTitulo;
	}

	public void setQtdDiasProrrogarTitulo(int qtdDiasProrrogarTitulo) {
		this.qtdDiasProrrogarTitulo = qtdDiasProrrogarTitulo;
	}

	public String getClientecnpjCpf() {
		return clientecnpjCpf;
	}

	public void setClientecnpjCpf(String clientecnpjCpf) {
		this.clientecnpjCpf = clientecnpjCpf;
	}

	public String getClienteTipoPessoa() {
		return clienteTipoPessoa;
	}

	public void setClienteTipoPessoa(String clienteTipoPessoa) {
		this.clienteTipoPessoa = clienteTipoPessoa;
	}

	public boolean isClienteImpedido() {
		return clienteImpedido;
	}

	public void setClienteImpedido(boolean clienteImpedido) {
		this.clienteImpedido = clienteImpedido;
	}

	public boolean isClientePermitido() {
		return clientePermitido;
	}

	public void setClientePermitido(boolean clientePermitido) {
		this.clientePermitido = clientePermitido;
	}

	public int getClienteTempoRelacionamento() {
		return clienteTempoRelacionamento;
	}

	public void setClienteTempoRelacionamento(int clienteTempoRelacionamento) {
		this.clienteTempoRelacionamento = clienteTempoRelacionamento;
	}

	public String getClienteScore() {
		return clienteScore;
	}

	public void setClienteScore(String clienteScore) {
		this.clienteScore = clienteScore;
	}

	public Double getLiquidezClienteAteVencto() {
		return liquidezClienteAteVencto;
	}

	public void setLiquidezClienteAteVencto(Double liquidezClienteAteVencto) {
		this.liquidezClienteAteVencto = liquidezClienteAteVencto;
	}

	public Double getLiquidezClienteAposVencto() {
		return liquidezClienteAposVencto;
	}

	public void setLiquidezClienteAposVencto(Double liquidezClienteAposVencto) {
		this.liquidezClienteAposVencto = liquidezClienteAposVencto;
	}

	public String getFiadorCnpjCpf() {
		return fiadorCnpjCpf;
	}

	public void setFiadorCnpjCpf(String fiadorCnpjCpf) {
		this.fiadorCnpjCpf = fiadorCnpjCpf;
	}

	public String getFiadorTipoPessoa() {
		return fiadorTipoPessoa;
	}

	public void setFiadorTipoPessoa(String fiadorTipoPessoa) {
		this.fiadorTipoPessoa = fiadorTipoPessoa;
	}

	public boolean isFiadorImpedido() {
		return fiadorImpedido;
	}

	public void setFiadorImpedido(boolean fiadorImpedido) {
		this.fiadorImpedido = fiadorImpedido;
	}

	public boolean isFiadorPermitido() {
		return fiadorPermitido;
	}

	public void setFiadorPermitido(boolean fiadorPermitido) {
		this.fiadorPermitido = fiadorPermitido;
	}

	public int getFiadorTempoRelacionamento() {
		return fiadorTempoRelacionamento;
	}

	public void setFiadorTempoRelacionamento(int fiadorTempoRelacionamento) {
		this.fiadorTempoRelacionamento = fiadorTempoRelacionamento;
	}

	public String getFiadorScore() {
		return fiadorScore;
	}

	public void setFiadorScore(String fiadorScore) {
		this.fiadorScore = fiadorScore;
	}

	public Double getLiquidezFiadorAteVencto() {
		return liquidezFiadorAteVencto;
	}

	public void setLiquidezFiadorAteVencto(Double liquidezFiadorAteVencto) {
		this.liquidezFiadorAteVencto = liquidezFiadorAteVencto;
	}

	public Double getLiquidezFiadorAposVencto() {
		return liquidezFiadorAposVencto;
	}

	public void setLiquidezFiadorAposVencto(Double liquidezFiadorAposVencto) {
		this.liquidezFiadorAposVencto = liquidezFiadorAposVencto;
	}

	public Solicitacao_ODM(Classificacao segmento, Prazos prazo_Curto, Emissao emissao, String produto,
			String destinoAutomaticoTitulo, double valorTitulo, int qtdDiasProrrogarTitulo, String clientecnpjCpf,
			String clienteTipoPessoa, boolean clienteImpedido, boolean clientePermitido, int clienteTempoRelacionamento,
			String clienteScore, Double liquidezClienteAteVencto, Double liquidezClienteAposVencto,
			String fiadorCnpjCpf, String fiadorTipoPessoa, boolean fiadorImpedido, boolean fiadorPermitido,
			int fiadorTempoRelacionamento, String fiadorScore, Double liquidezFiadorAteVencto,
			Double liquidezFiadorAposVencto) {
		super();
		this.segmento = segmento;
		this.prazo_Curto = prazo_Curto;
		this.emissao = emissao;
		this.produto = produto;
		this.destinoAutomaticoTitulo = destinoAutomaticoTitulo;
		this.valorTitulo = valorTitulo;
		this.qtdDiasProrrogarTitulo = qtdDiasProrrogarTitulo;
		this.clientecnpjCpf = clientecnpjCpf;
		this.clienteTipoPessoa = clienteTipoPessoa;
		this.clienteImpedido = clienteImpedido;
		this.clientePermitido = clientePermitido;
		this.clienteTempoRelacionamento = clienteTempoRelacionamento;
		this.clienteScore = clienteScore;
		this.liquidezClienteAteVencto = liquidezClienteAteVencto;
		this.liquidezClienteAposVencto = liquidezClienteAposVencto;
		this.fiadorCnpjCpf = fiadorCnpjCpf;
		this.fiadorTipoPessoa = fiadorTipoPessoa;
		this.fiadorImpedido = fiadorImpedido;
		this.fiadorPermitido = fiadorPermitido;
		this.fiadorTempoRelacionamento = fiadorTempoRelacionamento;
		this.fiadorScore = fiadorScore;
		this.liquidezFiadorAteVencto = liquidezFiadorAteVencto;
		this.liquidezFiadorAposVencto = liquidezFiadorAposVencto;
	}

	/** conversão de double para bigDecimal devido erro de calculos */
	public void converter(double c) {
		new BigDecimal(c);
	}

}
