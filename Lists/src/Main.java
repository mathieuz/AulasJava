import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//List � uma classe oriunda dos pacotes de recursos do pr�prio Java que possui uma s�rie de
		//m�todos com carater�sticas para cria��o de Arrays.
		
		List lista = new ArrayList();
		
		lista.add("abc");
		lista.add(12);
		lista.add(true);
		
//		System.out.println(lista.get(2));
//		
		for (int aux = 0; aux < lista.size(); aux++) {
			System.out.println(lista.get(aux));
		}
		
//		for (Object valor : lista) { //Enhanced-for: este la�o de repeti��o incrementa na vari�vel do loop o conte�do da lista.
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
//		lista.add(0, "def"); //O m�todo add possui v�rias sobrecargas do mesmo m�todo com diferentes assinaturas
//							 //este add subscreve o que tem em um dos �ndices da lista indicado logo em seguida dentro dos par�nteses
//							 //e reorganiza a lista automaticamente.
//		
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println("");
//		
//		lista.set(0, "ghi"); //Set subscreve o conte�do de um �ndice
//
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println("");
		
//		lista.clear(); //.clear apaga todos os conte�dos de uma list
//		if (lista.isEmpty()) {
//			System.out.println("Sua lista est� vazia!");
//		}
		
		Conta conta1 = new Conta("�gua", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);
		
		List<Conta> conta = new ArrayList<Conta>();  //<Conta>: generics define um tipo espec�fico para a lista "Conta", onde s� objetos com o mesmo
													 //tipo da lista conseguem ser relacionados
		
		conta.add(conta1);
		conta.add(conta2);
		
		for (Conta listaDeContas : conta) {
			System.out.println(listaDeContas);
		}
		
		
	}

}
