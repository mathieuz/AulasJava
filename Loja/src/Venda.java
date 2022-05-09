
public class Venda {

	public static void main(String[] args) {
		double prod1 = 23.90;
		double prod2 = 12.75;
		double vtotal = prod1+prod2;
		double vdesc;
		
		vdesc = (vtotal*15)/100;
		vtotal = vtotal - vdesc;
		
		System.out.println("Valor do Produto 1: R$"+prod1);
		System.out.println("Valor do Produto 2: R$"+prod2);
		System.out.println("Valor do Desconto: R$"+vdesc);
		System.out.println("Valor Total: R$"+vtotal);

	}

}
