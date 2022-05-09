
public class main {

	public static void main(String[] args) {
		
//		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
		
//		conta1.receber(100.85);
//		conta1.dar(110);
//		System.out.println(conta1.verSaldo());
//		
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.verSaldo());
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Matheus");
		cliente1.setCpf(123456);
		cliente1.setNumConta(99999);
		
//		System.out.println(cliente1.getNome());
//		System.out.println(cliente1.getCpf());
//		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1.toString());
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("André");
		cliente2.setCpf(765392);
		cliente2.setNumConta(33333);
		
		System.out.println(cliente2);
		
	}

}
