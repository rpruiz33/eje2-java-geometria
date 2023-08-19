package modelo;

public class Punto {

//atributos	
	private double x;
	private double y;

//constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

//m�todos getter y setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

//re-definicion de metodos de la clase Object
// sobrecarga
	public boolean equals(Punto p) {
		return ((x == p.getX()) && (y == p.getY()));
	}

// re-definicion
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public float calcularDistancia(Punto p1 , Punto p2) {
		
		return (float) Math.sqrt(Math.pow(((p1.getX()-p2.getX())),2)+Math.pow(((p1.getY()-p2.getY())),2));
		
	}
}
