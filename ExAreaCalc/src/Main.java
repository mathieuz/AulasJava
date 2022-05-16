
public class Main {

	public static void main(String[] args) {
		
		AreaCalculavel quad = new Quadrado();
		AreaCalculavel circ = new Circunferencia();
		AreaCalculavel ret = new Retangulo();
		
		quad.calcularArea();
		circ.calcularArea();
		ret.calcularArea();
		
	}

}
