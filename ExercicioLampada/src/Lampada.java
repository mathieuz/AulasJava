
public class Lampada {
	
	private boolean estaLigada;
	
	public Lampada(boolean estaLigada) {
		this.estaLigada = true;
	}
	
	
	public void imprimir() {
		if (estaLigada == true) {
			System.out.println("A lâmpada está ligada.");
		}else {
			System.out.println("A lâmpada está desligada.");
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
