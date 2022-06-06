import java.util.Scanner;

public class VendaTop {

	public static void main(String[] args) {
		int opprod1;
		int opprod2;
		double prod1;
		double prod2;
		double vtotal;
		double vdesc;
		int control = 0;
		
		System.out.println("Escolha dois dos produtos abaixo:");
		System.out.println("1 - Cal�a (R$ 25.00) [+ 25% Desconto]");
		System.out.println("2 - Bon� (R$ 40.00)");
		System.out.println("3 - Camisa (R$ 35.50)");
		System.out.println("4 - Sapato (R$ 69.99)");
		
		Scanner escolha = new Scanner(System.in);
		
		System.out.println("Escolha o primeiro produto:");
		opprod1 = escolha.nextInt();
		
		if(opprod1 == 1) {
			prod1 = 25.00;
			control++;
		}
		
		if(opprod1 == 2) {
			prod1 = 40.00;
			control++;
		}
		
		if(opprod1 == 3) {
			prod1 = 35.50;
			control++;
		}
		
		if(opprod1 == 4) {
			prod1 = 69.99;
			control++;
		}
		
		System.out.println("Escolha o segundo produto:");
		opprod2 = escolha.nextInt();
		
		if(opprod2 == 1) {
			prod2 = 25.00;
			control++;
		}
		
		if(opprod2 == 2) {
			prod2 = 40.00;
			control++;
		}
		
		if(opprod2 == 3) {
			prod2 = 35.50;
			control++;
		}
		
		if(opprod2 == 4) {
			prod2 = 69.99;
			control++;
		}
		

		
	}

}
