
public enum DiaDaSemana { //Enum � um tipo de classe especial que trabalha com constantes.
	
	//Os valores dentro de um Enum s�o alocados na mem�ria Heap, uma vez declarados.
	
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int numSemana;

	private DiaDaSemana(int numSemana) {
		this.numSemana = numSemana;
	}

	public int getNumSemana() {
		return numSemana;
	}

}
