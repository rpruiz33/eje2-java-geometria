package test;
import modelo.Punto;
import modelo.Circulo;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(1,3);
		Punto p2=new Punto(1,5);
		Punto p3=new Punto(1,9);
//		System.out.println("distancia p3,p1");
//		System.out.println(p3.calcularDistancia(p1));
//		double radio=p1.calcularDistancia(p2);
//		System.out.println(radio);
//		
		Circulo c1=new Circulo(p1,25);
		Circulo c2=new Circulo(p2,20);
		c2.setRadio(p3);
		c1.setRadio(p2);
		c2.setOrigen(p2);
		c1.setOrigen(p3);
		System.out.println("radio c1"+c1.getRadio());
		System.out.println(c2.getRadio());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(p1.equals(p2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println("perimetro c1");
		System.out.println(c1.perimetro(c1));
		System.out.println("perimetro");
		System.out.println(c2.perimetro(c2));
		System.out.println("area del sirculo c1");
		System.out.println(c1.area(c1));
		System.out.println(c2.distanciaEntreCirculo(c1));
	}

}
