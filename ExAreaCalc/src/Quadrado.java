
public class Quadrado implements AreaCalculavel {
	double lado = 6.8;

	@Override
	public void calcularArea() {
		System.out.println(Math.pow(lado, 2));
	}
	
}
