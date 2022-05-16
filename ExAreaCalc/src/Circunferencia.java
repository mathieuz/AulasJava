
public class Circunferencia implements AreaCalculavel {
	double raio = 18.3;

	@Override
	public void calcularArea() {
		System.out.println(2 * Math.PI * raio);
	}
}
