package test;
import modelo.Punto;
import modelo.Circulo;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(1,1);
		Punto p2=new Punto(1,1);
		
//		double radio=p1.calcularDistancia(p2);
//		System.out.println(radio);
//		
		Circulo c1=new Circulo(p1,25);
		Circulo c2=new Circulo(p2,25);
		c2.setRadio(p2);
		c1.setRadio(p2);
		c2.setOrigen(p2);
		c1.setOrigen(p2);
		System.out.println(c1.getRadio());
		System.out.println(c1.getRadio());
		System.out.println(c1.equals(c2));
		System.out.println(p1.equals(p2));
	}

}
