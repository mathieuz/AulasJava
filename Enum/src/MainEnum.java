
public class MainEnum {
	
	public static final double PI = 3.14; //Vari�vel Constante.
	
	public enum Sexo{ //� poss�vel criar Enums dentro a classe principal.
		MASCULINO, FEMININO;
	}

	public static void main(String[] args) {	

		double pi = MainEnum.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //Armazenar constantes de Enum numa vari�vel � feita atrav�s de acessos da classe Enum.
		
		int num = DiaDaSemana.SEGUNDA.getNumSemana();
		System.out.println(num);
		
		String s = "TER�A";
		
		hoje = DiaDaSemana.valueOf(s);
		
		System.out.println(hoje.getNumSemana());
		
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
		
	}

}