
public class Sabonete {
	String cheiro;
	String cor;
	
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Sabonete [cheiro=" + cheiro + ", cor=" + cor + "]";
	}
	
}
