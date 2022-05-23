
public class Endereco {
	
	private String rua;
	private int num;
	private String bairro;
	
	public String getRua() {
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
	public String toString() {
		return "\n[Endereco] Rua: " + rua + ", Número:" + num + ", Bairro:" + bairro + ".";
	}
	
}
