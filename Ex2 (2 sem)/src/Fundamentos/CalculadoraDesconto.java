package Fundamentos;

public class CalculadoraDesconto {
	double num;
	double desc;
	double desconto;
	double totaldesc;
	
	public double calcularDesconto() {
		desconto = num * desc;
		totaldesc = desconto - num;
		return totaldesc;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public double getDesc() {
		return desc;
	}

	public void setDesc(double desc) {
		this.desc = desc;
	}
	
}
