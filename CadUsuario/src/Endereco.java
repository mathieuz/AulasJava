
public class Endereco {
	
	private String rua;
	private int num;
	private String bairro;
	
	public String getRua() { //get é o método de retorno do valor de uma variável, set é o método que atrbui informações as variáveis.
		return rua;
	}

	public int getNum() {
		return num;
	}

	public String getBairro() {
		return bairro;
	}
	
	
	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() { //override toString retorna informações de uma instância de objeto em um texto personalizado.
		return "\n[Endereco] Rua: " + rua + ", N�mero:" + num + ", Bairro:" + bairro + ".";
	}
	
}
