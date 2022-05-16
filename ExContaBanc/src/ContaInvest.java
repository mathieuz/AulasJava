
public class ContaInvest extends ContaBancaria {

	@Override
	public double calcularSaldo() {
		return saldo - (saldo * 0.1);
	}
}
