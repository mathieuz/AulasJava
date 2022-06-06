import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//int x = 100;
		//double y = 200;
		//int a = 0;
		//double b = 0;
		//short z = (short) 10000;
		//System.out.println(z);
		
		//a = (int)y;
		//b = x;
		//System.out.println(a);
		//System.out.println(b);
		
		//int idadePessoa = 17;
		
		//if(idadePessoa < 18) {
			//System.out.println("Você não pode beber");
		//}
		
		//else if(idadePessoa < 60) {
			//System.out.println("Bora tomar uma");
		//}
		
		//else {
			//System.out.println("Você está na terceira idade");
		//}
		
		//System.out.println("Você tem " + idadePessoa + " anos");
			
		//valores constantes usa-se o switch case
		//o break determina um limite para o seu codigo
		
//		int num = 8;
//		switch (num) {
//		
//			case 1:
//				System.out.println("Hoje é Domingo");
//					break; 
//			case 2:
//				System.out.println("Hoje é Segunda-feira");
//					break;
//			case 3:
//				System.out.println("Hoje é Terça-fera");
//					break;
//			case 4:
//				System.out.println("Hoje é Quarta-feira");
//					break;
//			case 5:
//				System.out.println("Hoje é Quinta-feira");
//					break;
//			case 6:
//				System.out.println("Hoje é Sexta-feira");
//					break;
//			case 7: 
//				System.out.println("Hoje é Sabado");
//					break;
//			default:
//				System.out.println("Esse número não representa um dia da semana");
//		}
//		
//		char caractere = 'a';
//		
//		switch (caractere) {
//		case 'a':
//			System.out.println("Seu caractere é a");
//			break;
//		case 'b':
//			System.out.println("Seu caractere é b");
//			break;
//		default:
//			System.out.println("valor inválido");
//			
//	}
		
//			String farol = "verde";
//				
//			switch (farol) {
//			
//			case "vermelho":
//				System.out.println("Pare");
//				break;
//			case "amarelo":
//				System.out.println("Atenção");
//				break;
//			case "verde":
//				System.out.println("Prossiga");
//				break;
//				
//			default: 
//				System.out.println("Valor inválido");
//				
//			}
		
		//ele obtém a resposta de um teste condicional, ele ocorre meio que preso dentro daquela condição
//		int x = 0;
//		while(x < 10) { 
//		
//			System.out.println(x);
//			x = x+1;
// }

//	int x=0;
//	while(x<10) {
//		System.out.println(x);
//		x=x+1;
//	}
//	
//	x=0;
//	//ele executa apenas quando a condição é verdadeira, se não ele apenas sai
//	do {
//		System.out.println(x);
//		x=x+1;
//	} while (x<10);
	
		//
//		for(int x=0; x<=10; x++) {
//			System.out.println("9 x " + x + " = " + x*9);
//		}
		
//		double x[] = {3, 5, 3, 5};
//		
//		for (int aux = 0; aux < x.length; aux++) {
//			System.out.println("Valor do índice " + aux + " = "  + x[aux]);
//		}
		
		
		
//		String nome[] = {"Rafael", "Gislene", "Lara"};
//		
//		for (int aux1 = 0; aux1 < nome.length; aux1++) {
//			System.out.println(nome[aux1]);
//			
//			if (nome[aux1] == "Gislene") {
//				System.out.println("O nome Gislene está no índice " + aux1);
//			}
//		}
		
		
		
		
//		int[] arrayInt = new int[5];
//		String[] arrayStr = new String[4];
//		double[] arrayDouble = new double[4];
		
//		arrayInt[3] = 4;
		
//		int[] num = new int[6];
//		
//		Scanner scanner = new Scanner(System.in);
		
//		for (int aux2 = 0; aux2 < num.length; aux2++) {
//			System.out.println("Digite um número qualquer:");
//			num[aux2] = scanner.nextInt();
//		}
		
//		for (int aux2 = 0; aux2 < num.length; aux2++) {
//			System.out.println("Índice " + aux2 + " = " + num[aux2]);
//		}
		
//		int[] arrayQualquer = new int[3]; //Criando array do tipo inteiro
//		
//		Object[] arrayObject = new Object[5]; //Criando array do tipo Object
		
//		arrayObject[0] = 12;
//		arrayObject[1] = "Rafael";
//		arrayObject[2] = 3.4;
//		arrayObject[3] = true;
//		arrayObject[4] = arrayQualquer;
		
//		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
//			System.out.println("Índice: " +aux2+ " = " +arrayObject[aux2]);
//		}
		
		
		//Criando uma tabela com matrizes
		
		int[][] arrayBidirecional = new int[4][3]; //Criando duas arrays para um mesmo objeto
		
		arrayBidirecional[0][0] = 8;
		arrayBidirecional[2][1] = 7;
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print("Índice [" +linha+ "][" +coluna+ "] = " + arrayBidirecional[linha][coluna]+ " ");
			}
			System.out.println("");
		}
	}	
}
