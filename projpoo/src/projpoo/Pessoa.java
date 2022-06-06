package projpoo;

public class Pessoa {
	
	String nome;
	int numFig;
	
	void receberFig(int numFig) { //Este método recebe uma variável local como parêmetro para definir um valor de figurinhas a ser recebidas.
		this.numFig += numFig; //this especifica o objeto instanciado que receberá a figurinha
	}
	boolean darFig(int numFig, Pessoa pessoa) { //Este método possui como parâmetros um valor inteiro de figurinhas a ser dado e para qual instância de objeto receberá este valor.
		if (this.numFig < numFig) { //"se o número de figurinhas da pessoa que for dar as figurinhas for menor que seu número de figurinhas total, retorna falso.
			System.out.println("N�mero de figurinhas insuficiente.");
			return false;
		}else {
			this.numFig -= numFig;
			pessoa.receberFig(numFig);
			return true;
		}
	}
}
