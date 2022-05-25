import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainEscTxt {

	public static void main(String[] args) throws IOException {
		
//		String s = "Texto para ser gravado.";
//		
//		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
//			escrever.write(s);
//		}
		
		Sabonete sabonete1 = new Sabonete("Côco", "Branco");
		Sabonete sabonete2 = new Sabonete("Lavanda", "Roxo");
		
		List <Sabonete> sabonete = new ArrayList<Sabonete>(); 
		
		sabonete.add(sabonete1);
		sabonete.add(sabonete2);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("sabonete.txt"))){
			
			for (Sabonete listaSab : sabonete) {
				escrever.write(listaSab.toString());
			}
		}

	}
	
}
