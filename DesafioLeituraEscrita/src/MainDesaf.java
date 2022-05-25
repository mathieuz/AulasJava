import java.io.BufferedReader;
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
		
		try(BufferedWriter esc = new BufferedWriter(new FileWriter("entrada.txt"))){		
			System.out.print("Digite alguma coisa: ");			
			str = scan.nextLine();
			esc.write(str);
		}
		
		try(BufferedReader ler = new BufferedReader(new FileReader("entrada.txt"))){
			System.out.println(ler.readLine());
		}
		
	}

}
