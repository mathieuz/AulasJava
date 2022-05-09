package projpoo;

public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Matheus";
		pessoa1.numFig = 1;
		
		pessoa1.receberFig(3);
		
		System.out.println(pessoa1.nome+" tem "+pessoa1.numFig+" figurinha(s).");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "ABCD";
		pessoa2.numFig = 0;
		
		pessoa1.darFig(2, pessoa2);
		
		System.out.println(pessoa1.nome+" tem "+pessoa1.numFig+" figurinha(s).");
		System.out.println(pessoa2.nome+" tem "+pessoa2.numFig+" figurinha(s).");
		
		boolean retorno = pessoa1.darFig(4, pessoa2);
		
		if (retorno == true) {
			System.out.println("Depois");
			System.out.println(pessoa1.nome);
			System.out.println(pessoa2.numFig);
		}
	
	}
	
}