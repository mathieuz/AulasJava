import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		int n1;
		int n2;
		String op = ""; //Variável de escolha
		int control = 0; //Variável de Controle
		
		Scanner entrada = new Scanner(System.in); //O método Scanner cria um objeto para entrada de informações. 'java.util.Scanner' é necessário.
		
		System.out.println("Digite a operação desejada (+, -, *, /):");
		op = entrada.nextLine(); //'next.Line' tratará de absorver a informação, tipicamente do tipo 'String'
		
		System.out.println("Digite um valor:");
		n1 = Integer.parseInt(entrada.nextLine()); //parseInt converte informação em string para um tipo numérico.
		
		System.out.println("Digite outro valor:");
		n2 = Integer.parseInt(entrada.nextLine());
		
		if(op.equals("+")) {
			System.out.println("O resultado da soma é "+(n1+n2));
			control++; //Incremento
		}
		
		if(op.equals("-")) {
			System.out.println("O resultado da subtração é "+(n1-n2));
			control++; //Incremento
		}
		
		if(op.equals("*")) {
			System.out.println("O resultado da multiplicação é "+(n1*n2));
			control++; //Incremento
		}
		
		if(op.equals("/")) {
			System.out.println("O resultado da divisão é "+(n1/n2));
			control++; //Incremento
		}
		
		if(control == 0) { //
			System.out.println("Operação inválida, tente novamente.");
		}
	}

}
