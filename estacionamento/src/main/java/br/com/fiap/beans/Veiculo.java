package br.com.fiap.beans;

public class Veiculo {

	private int IDveiculo;
	private String placa;
	private String marca;
	private String modelo;

	public Veiculo(int iDveiculo, String placa, String marca, String modelo) {
		super();
		IDveiculo = iDveiculo;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Veiculo() {
		super();
	}

	public int getIDveiculo() {
		return IDveiculo;
	}

	public void setIDveiculo(int iDveiculo) {
		IDveiculo = iDveiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
