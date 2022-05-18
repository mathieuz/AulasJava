import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//List é uma classe oriunda dos pacotes de recursos do próprio Java que possui uma série de
		//métodos com caraterísticas para criação de Arrays.
		
		List lista = new ArrayList();
		
		lista.add("abc");
		lista.add(12);
		lista.add(true);
		
//		System.out.println(lista.get(2));
//		
		for (int aux = 0; aux < lista.size(); aux++) {
			System.out.println(lista.get(aux));
		}
		
//		for (Object valor : lista) { //Enhanced-for: este laço de repetição incrementa na variável do loop o conteúdo da lista.
//			System.out.println(valor);
//		}
//		
//		System.out.println("");
//		
//		lista.remove(0); //Retira um item da lista
//		
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println("");
//		
//		lista.add(0, "def"); //O método add possui várias sobrecargas do mesmo método com diferentes assinaturas
//							 //este add subscreve o que tem em um dos índices da lista indicado logo em seguida dentro dos parênteses
//							 //e reorganiza a lista automaticamente.
//		
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println("");
//		
//		lista.set(0, "ghi"); //Set subscreve o conteúdo de um índice
//
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println("");
		
//		lista.clear(); //.clear apaga todos os conteúdos de uma list
//		if (lista.isEmpty()) {
//			System.out.println("Sua lista está vazia!");
//		}
		
		Conta conta1 = new Conta("Água", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);
		
		List<Conta> conta = new ArrayList<Conta>();  //<Conta>: generics define um tipo específico para a lista "Conta", onde só objetos com o mesmo
													 //tipo da lista conseguem ser relacionados
		
		conta.add(conta1);
		conta.add(conta2);
		
		for (Conta listaDeContas : conta) {
			System.out.println(listaDeContas);
		}
		
		
	}

}
