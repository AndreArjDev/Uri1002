package circulo;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		Scanner teclado = new Scanner(System.in);
		double r = teclado.nextDouble();
		circulo.setRaio(r);
		
		System.out.printf("Raio = %.3f\n", circulo.getArea());

	}

}
