
public class Contador {
	
	public static int valor;
	
//	public Contador() {
//		this.valor = 1;
//	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public static int getValor() {
		return valor;
	}
	
	public static void incrementar() {
		valor ++;
	}
	
	static {
		valor = 1;
	}
}
