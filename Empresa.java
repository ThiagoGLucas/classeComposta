public class Empresa {
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private Data dataDeCriacao;
	
	public Empresa(String n, String c, Endereco e, Data d) {
		this.nome = n;
		this.cnpj = c;
		this.endereco = e;
		this.dataDeCriacao = d;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setCpnj(String novoCnpj) {
		this.cnpj = novoCnpj;
	}
	
	public void setEndereco(Endereco novoEndereco) {
		this.endereco = novoEndereco;
	}
	
	public void setDataDeCriacao(Data novaData) {
		this.dataDeCriacao = novaData;
	}
	
	public String toString() {
		return this.nome + "\n" + this.cnpj + "\n\n" + endereco.toString() + "\n\n" + dataDeCriacao.toString();
	}
}
