package projpoo;

public class Pessoa {
	
	String nome;
	int numFig;
	
	void receberFig(int numFig) {
		this.numFig += numFig;
	}
	boolean darFig(int numFig, Pessoa pessoa) {
		if (this.numFig < numFig) {
			System.out.println("Número de figurinhas insuficiente.");
			return false;
		}else {
			this.numFig -= numFig;
			pessoa.receberFig(numFig);
			return true;
		}
	}
}
