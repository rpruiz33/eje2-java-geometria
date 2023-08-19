package modelo;

public class Circulo {


	private Punto origen;
	private double radio;

	 public void setRadio(Punto nuevoRadio) {
	        this.radio = origen.calcularDistancia(nuevoRadio);
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