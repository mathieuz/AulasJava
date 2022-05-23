
public enum Sexo {
	
	MASCULINO(1),
	FEMININO(2);
	
	private int sexo;
	
	private Sexo(int sexo) {
		this.sexo = sexo;
	}
	
	public int getSexo() {
		return sexo;
	}
}
