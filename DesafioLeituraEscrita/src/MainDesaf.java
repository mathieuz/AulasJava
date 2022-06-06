import java.io.BufferedReader; //É necessário uma série de importações das dependências do Java para realizar as saídas/leituras de arquivos de texto.
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainDesaf {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		try(BufferedWriter esc = new BufferedWriter(new FileWriter("entrada.txt"))){	//BufferedWriter cria um arquivo onde tudo o que for digitado no scanner será escrito... 'try' garante que o processo seja garantido para caso haja a possibilidade de perda ou corrupção do arquivo especificado.	
			System.out.print("Digite alguma coisa: ");			
			str = scan.nextLine();
			esc.write(str);
		}
		
		try(BufferedReader ler = new BufferedReader(new FileReader("entrada.txt"))){	//BufferedReader lê as informações do arquivo criado com BufferedWriter, e exibe essas infromações no console.
			System.out.println(ler.readLine());
		}
		
	}

}
