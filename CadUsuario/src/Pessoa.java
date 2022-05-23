
public class Pessoa {
	
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "[Pessoa] Nome:" + nome + ", Idade:" + idade + ", Endereco=" + endereco;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
