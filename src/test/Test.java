package test;
import modelo.Punto;
import modelo.Circulo;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(1,1);

		
		double resultado=p2.calcularDistancia(p1);
		System.out.println(resultado);
		
		Circulo c1=new Circulo(p1,4);
		c1.setRadio(p1);
		System.out.println(c1.getRadio());
	}

}
