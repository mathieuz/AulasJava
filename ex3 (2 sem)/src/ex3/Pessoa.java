package ex3;

public class Pessoa {
	String nome;
	int figurinhas;
	
	public Pessoa(String nome, int figurinhas) {
		this.nome = nome;
		this.figurinhas = figurinhas;
	}
	
	public void receberFig(int numFig) {
		this.figurinhas += numFig;
	}
	
	public boolean darFig(Pessoa pessoa, int numFig) {
		if(numFig <= this.figurinhas && numFig > 0) {
			
			System.out.println(nome + " deu " + numFig + " figurinha(s) para " + pessoa.nome);
			pessoa.figurinhas += numFig;
			this.figurinhas -= numFig;
			return true;
			
		} else {
			System.out.println("Número de figurinhas inválido! Insira um outro valor e tente novamente.");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", figurinhas=" + figurinhas + "]";
	}
	
}
