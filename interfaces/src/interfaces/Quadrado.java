package interfaces;

public class Quadrado implements AreaCalculavel{
	
	private int lado;

	public double calculaArea() {
		return this.lado * this.lado;
	}
}
