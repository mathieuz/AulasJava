package Fundamentos;

public class MainEx1 {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Francisco", 4550.25);
		Funcionario func2 = new Funcionario("Júlia", 2350.72);
		
		System.out.println(func1);
		System.out.println(func2);
		
		System.out.println("A diferença salarial entre " + func1.nome + " e " + func2.nome + " é de R$" + (func1.getSal() - func2.getSal()) + ".");
	}
}