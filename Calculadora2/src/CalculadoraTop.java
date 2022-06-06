import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		int n1;
		int n2;
		String op = ""; //Vari�vel de escolha
		int control = 0; //Vari�vel de Controle
		
		Scanner entrada = new Scanner(System.in); //O método construtor Scanner cria um objeto para entrada de informações. 'java.util.Scanner' � necess�rio.
		
		System.out.println("Digite a opera��o desejada (+, -, *, /):");
		op = entrada.nextLine(); //'next.Line' tratar� de absorver a informa��o, tipicamente do tipo 'String'
		
		System.out.println("Digite um valor:");
		n1 = Integer.parseInt(entrada.nextLine()); //parseInt converte informa��o em string para um tipo num�rico.
		
		System.out.println("Digite outro valor:");
		n2 = Integer.parseInt(entrada.nextLine());
		
		if(op.equals("+")) {
			System.out.println("O resultado da soma � "+(n1+n2));
			control++; //Incremento
		}
		
		if(op.equals("-")) {
			System.out.println("O resultado da subtra��o � "+(n1-n2));
			control++; //Incremento
		}
		
		if(op.equals("*")) {
			System.out.println("O resultado da multiplica��o � "+(n1*n2));
			control++; //Incremento
		}
		
		if(op.equals("/")) {
			System.out.println("O resultado da divis�o � "+(n1/n2));
			control++; //Incremento
		}
		
		if(control == 0) { //
			System.out.println("Opera��o inv�lida, tente novamente.");
		}
	}

}
