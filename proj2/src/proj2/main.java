package proj2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
//		int idadep = 19;
//		
//		if(idadep < 18) {
//			System.out.println("Voc� n�o tem idade para dirigir.");
//		}else if(idadep < 60){
//			System.out.println("Voc� tem idade para dirigir.");
//		}else {
//			System.out.println("Quanto � a sua aposentadoria?");
//		}
//		
//		System.out.println("Voc� tem "+idadep+" anos de idade.");
		
//		int n1 = 8;
//		
//		switch (n1) {
//		case 1:
//			System.out.println("Segunda");
//			break;
//		case 2:
//			System.out.println("Ter�a");
//			break;
//		case 3:
//			System.out.println("Quarta");
//			break;
//		case 4:
//			System.out.println("Quinta");
//			break;
//		case 5:
//			System.out.println("Sexta");
//			break;
//		case 6:
//			System.out.println("S�bado");
//			break;
//		case 7:
//			System.out.println("Domingo");
//			break;
//		default:
//			System.out.println("Este n�mero n�o corresponde a um dia da semana.");
//		}
		
//		char caractere = 'a';
//		
//		switch(caractere) {
//		case 'a':
//			System.out.println("Seu caractere � 'a'.");
//			break;
//		case 'b':
//			System.out.println("Seu caractere � 'b'");
//		default:
//			System.out.println("Valor inv�lido.");
//	}
		
//		String farol = "amarelo";
//		
//		switch(farol) {
//		case "verde":
//			System.out.println("Avance.");
//			break;
//		case "amarelo":
//			System.out.println("Aten��o!");
//			break;
//		case "vermelho":
//			System.out.println("Pare!!!");
//			break;
//		default:
//			System.out.println("Cor de farol inv�lida.");
//		}
		
//		int x = 0;
//		
//		while(x < 100) {
//			x += 1;
//			System.out.println(x);
//		}
		
//		int x1 = 0;
//		
//		do {
//			System.out.println(x1);
//			x1 += 1;
//		}while(x1 < 10);
		
//		for (int x = 0; x<10; x++) {
//			System.out.println(x);
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para multiplicar:");
		int n1 = scanner.nextInt();
		
		for (int x = 0; x < 11; x++) {
			System.out.println(n1+" x "+x+" = "+x*n1);
		}
	}
}
