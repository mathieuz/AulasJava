package orientacaoobjeto;

public class Calculadora {

	public static void main(String[] args) {
		double n1 = 5;
		double n2 = 2;
		double rsoma;
		double rsub;
		double rmult;
		double rdiv;
		
		rsoma = n1 + n2;
		rsub = n1 - n2;
		rmult = n1 * n2;
		rdiv = n1 / n2;
		
		System.out.println(n1+" + "+n2+" = "+rsoma);
		System.out.println(n1+" - "+n2+" = "+rsub);
		System.out.println(n1+" * "+n2+" = "+rmult);
		System.out.println(n1+" / "+n2+" = "+rdiv);
	}

}
