package proj2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
//		int idadep = 19;
//		
//		if(idadep < 18) {
//			System.out.println("Você não tem idade para dirigir.");
//		}else if(idadep < 60){
//			System.out.println("Você tem idade para dirigir.");
//		}else {
//			System.out.println("Quanto é a sua aposentadoria?");
//		}
//		
//		System.out.println("Você tem "+idadep+" anos de idade.");
		
//		int n1 = 8;
//		
//		switch (n1) {
//		case 1:
//			System.out.println("Segunda");
//			break;
//		case 2:
//			System.out.println("Terça");
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
//			System.out.println("Sábado");
//			break;
//		case 7:
//			System.out.println("Domingo");
//			break;
//		default:
//			System.out.println("Este número não corresponde a um dia da semana.");
//		}
		
//		char caractere = 'a';
//		
//		switch(caractere) {
//		case 'a':
//			System.out.println("Seu caractere é 'a'.");
//			break;
//		case 'b':
//			System.out.println("Seu caractere é 'b'");
//		default:
//			System.out.println("Valor inválido.");
//	}
		
//		String farol = "amarelo";
//		
//		switch(farol) {
//		case "verde":
//			System.out.println("Avance.");
//			break;
//		case "amarelo":
//			System.out.println("Atenção!");
//			break;
//		case "vermelho":
//			System.out.println("Pare!!!");
//			break;
//		default:
//			System.out.println("Cor de farol inválida.");
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
		
		System.out.println("Digite um número para multiplicar:");
		int n1 = scanner.nextInt();
		
		for (int x = 0; x < 11; x++) {
			System.out.println(n1+" x "+x+" = "+x*n1);
		}
	}
}
