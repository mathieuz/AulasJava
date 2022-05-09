import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Matematica matematica = new Matematica();
		
		System.out.println("Digite o primeiro número:");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int y = scanner.nextInt();
		
		int soma = matematica.somar(x, y);
		System.out.println(soma);
		
		//double soma2 = matematica.somar(2.4, 2.7);
		//System.out.println(soma);

	}

}
