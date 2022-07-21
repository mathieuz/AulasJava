package ex3;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Júlia", 10);
		Pessoa p2 = new Pessoa("João", 2);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.darFig(p2, 3);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
