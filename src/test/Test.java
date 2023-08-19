package test;
import modelo.Punto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1=new Punto(1,1);
		Punto p2=new Punto(0,0);
		
		double resultado=p2.calcularDistancia(p1,p2);
		System.out.println(resultado);
	}

}
