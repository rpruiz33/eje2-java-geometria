package test;
import modelo.Punto;
import modelo.Circulo;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(2,3);
		Punto p2=new Punto(1,1);
		
//		double radio=p1.calcularDistancia(p2);
//		System.out.println(radio);
//		
		Circulo c1=new Circulo(p1,25);
		c1.setRadio(p1);
		System.out.println(c1.getRadio());
	}

}
