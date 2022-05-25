import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainProjeto {

	public static void main(String[] args) throws IOException {
		
		String str;
		
		Sabonete s1 = new Sabonete("Neutro", "Branco");
		Sabonete s2 = new Sabonete("Lavanda", "Roxo");
		
		List <Sabonete> sabonete = new ArrayList<Sabonete>();
		
		sabonete.add(s1);
		sabonete.add(s2);

		try(BufferedWriter esc = new BufferedWriter(new FileWriter("arraysabonete.txt"))){
			
			for(Sabonete arraySabonete : sabonete) {
				str = arraySabonete.toString() + "\n";
				esc.write(str);
				
			}
		}
		
		try(BufferedReader sai = new BufferedReader(new FileReader("arraysabonete"))){
			
			while((str = sai.readLine()) != null) {

			}
		}
	}

}
