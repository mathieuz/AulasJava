package Fundamentos;

public class Funcionario {
	String nome;
	Double sal;
	
	public Funcionario(String nome, Double sal) {
		this.nome = nome;
		this.sal = sal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "[Empresa de Alimentos] Funcionário: " + this.nome + ", Salario: " + this.sal + ".";
	}
	
}
