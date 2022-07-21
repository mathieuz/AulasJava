package Fundamentos;

public class CalculadoraDesconto {
	double num;
	double numdesc;
	double desconto;
	double totaldesc;
	
	public double calcularDesconto() {
		desconto = (num * numdesc) / 100;
		totaldesc = num - desconto;
		return totaldesc;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public double getNumDesc() {
		return numdesc;
	}

	public void setNumDesc(double numdesc) {
		this.numdesc = numdesc;
	}
	
}
