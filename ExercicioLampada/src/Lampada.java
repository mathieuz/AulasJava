
public class Lampada {
	
	private boolean estaLigada;
	
	public Lampada(boolean estaLigada) { //Método com parâmetro de valor booleano, atribui a 'estaLigada' se o valor for 'true'
		this.estaLigada = true;
	}
	
	
	public void imprimir() {
		if (estaLigada == true) {
			System.out.println("A l�mpada est� ligada.");
		}else {
			System.out.println("A l�mpada est� desligada.");
		}
	}
	
	public void ligar(boolean ligar){
		estaLigada = true;
		imprimir();
		
	}
	
	public void desligar(boolean desligar) {
		estaLigada = false;
		imprimir();
	}
}
