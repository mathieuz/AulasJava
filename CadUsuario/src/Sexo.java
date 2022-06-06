
public enum Sexo { //enum é um "tipo de classe especial" que define valores finitos possíveis em constantes.
	
	MASCULINO(1), //cada constante de um enum deve ser identificada com um valor numérico
	FEMININO(2);
	
	private int sexo;
	
	private Sexo(int sexo) {
		this.sexo = sexo;
	}
	
	public int getSexo() {
		return sexo;
	}
}
