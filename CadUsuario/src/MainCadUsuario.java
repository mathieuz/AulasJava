import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class MainCadUsuario {

		public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);	

		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		
	
		for (Pessoa cad : listaPessoa) {
			
			Pessoa listaPessoa = new Pessoa();	
			
			System.out.println("Digite seu nome:");
			listaPessoa.nome = scanner.nextLine();
			
			System.out.println("Digite sua idade:");
			listaPessoa.idade = scanner.nextInt();
			
			System.out.println("Digite seu endereço:");
			System.out.print("Rua: ");
			listaPessoa.rua = scanner.nextLine();
			
			System.out.print("\nBairro: ");
			listaPessoa.bairro = scanner.nextLine();
			
			System.out.print("\nNúmero: ");
			listaPessoa.num = scanner.nextInt();
	
		}

	}
}
