package br.com.fiap.beans;

import java.util.Date;

public class Valet {

	private int IDvalet;
	private Veiculo veiculo;
	private Date entrada;
	private Date saida;
	private float preco;

	public Valet(int iDvalet, Veiculo veiculo, Date entrada, Date saida, float preco) {
		super();
		IDvalet = iDvalet;
		this.veiculo = veiculo;
		this.entrada = entrada;
		this.saida = saida;
		this.preco = preco;
	}

	public Valet() {
		super();
	}

	public int getIDvalet() {
		return IDvalet;
	}

	public void setIDvalet(int iDvalet) {
		IDvalet = iDvalet;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
