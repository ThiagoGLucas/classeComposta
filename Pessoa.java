public class Pessoa {
	private String nome;
	private int idade;
	private String cpf;
	private String sexo;
	
	public Pessoa(String n, int i, String c, String s) {
		this.nome = n;
		this.idade = i;
		this.cpf = c;
		this.sexo = s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return this.nome + "\n" + this.idade + "\n" + this.cpf + "\n" + this.sexo + "\n\n";
	}
}
