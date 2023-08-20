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
	
	public boolean equals(Circulo c) {
		 return (origen.equals(c.origen)) && (radio == c.radio);
		
	}
	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}
	public double perimetro(Circulo c) {
	
		return (c.getRadio()*2*(Math.PI));
	}
	public double area(Circulo c) {
		return (Math.pow((c.radio),2)*Math.PI);
	}
	
	public double distanciaEntreCirculo(Circulo c) {
		return (c.radio-this.radio);
	}
}
