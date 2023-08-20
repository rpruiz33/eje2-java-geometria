package modelo;

import modelo.Punto;

public class Circulo {

	private Punto origen;
	private double radio;

	public void setRadio(Punto radio) {
		this.radio = origen.calcularDistancia(radio);
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public Circulo(Punto origen, double radio) {
		this.origen = origen;
		this.radio = radio;
	}
}