
public class ContaBancaria {
	
	private int numConta;
	private boolean ativo;
	private double saldo;
	
	public double verSaldo() {
		return saldo;
	}
	
	public void receber(double valor) {
		saldo += valor;
	}
	
	public void dar(double valor) {
		if(valor >= saldo) {
		  saldo -= valor;
		}
		
	}
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(boolean ativo, double saldo) {
		super();
		this.ativo = ativo;
		this.saldo = saldo;
	}
}
