package interfaces;

public class Circulo implements AreaCalculavel{

	private double raio;

	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}
	
}
