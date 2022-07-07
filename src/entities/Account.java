package entities;

import excecoes.ExcecaoDeNegocios;

public class Account {

	private Integer numeroDaConta;
	private String titular;
	private Double saldo;
	private Double limiteDeSaque;

	public Account() {
		super();
	}

	public Account(Integer numeroDaConta, String titular, Double saldo, Double limiteDeSaque) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {

		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void sacar(Double valor) {
		validarsaque(valor);
		saldo -= valor;
	}

	public void validarsaque(double valor) {

		if (valor > getLimiteDeSaque()) {
			throw new ExcecaoDeNegocios("Erro de saque : a quantia excede o limite de saque");
		}
		if (valor > getSaldo()) {
			throw new ExcecaoDeNegocios("Erro de saque : saldo insuficiente");
		}

	}

}
