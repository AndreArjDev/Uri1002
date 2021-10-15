package circulo;

public class Circulo {

	private double raio;
	private static double pi = 3.14159;
	private double area; 
	public void setRaio(double raio) {
		this.raio = raio;
		calculaArea(raio);
	}

	public void calculaArea(double raio) {
		this.area = pi * Math.pow(this.raio, 2);
	}
	
	public double getArea() {
		return area;
	}
	
	
}
