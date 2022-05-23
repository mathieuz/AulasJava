
public class MainEnum {
	
	public static final double PI = 3.14; //Variável Constante.
	
	public enum Sexo{ //É possível criar Enums dentro a classe principal.
		MASCULINO, FEMININO;
	}

	public static void main(String[] args) {	

		double pi = MainEnum.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA; //Armazenar constantes de Enum numa variável é feita através de acessos da classe Enum.
		
		int num = DiaDaSemana.SEGUNDA.getNumSemana();
		System.out.println(num);
		
		String s = "TERÇA";
		
		hoje = DiaDaSemana.valueOf(s);
		
		System.out.println(hoje.getNumSemana());
		
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
		
	}

}