
public class Retangulo implements AreaCalculavel {
	double lado = 8.5;
	double altura = 10.5;
	
	@Override
	public void calcularArea() {
		System.out.println(lado * altura);
	}
	
}
