public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	private InformacoesProduto sobre;
	private Tempo fabricacaoEValidade;
	
	public Produto(String n, double p, int q, InformacoesProduto s, Tempo t) {
		this.nome = n;
		this.preco = p;
		this.quantidade = q;
		this.sobre = s;
		this.fabricacaoEValidade = t;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	public void setSobre(InformacoesProduto novoSobre) {
		this.sobre = novoSobre;
	}
	
	public void setFabricacaoEValidade(Tempo novoFabricacaoEValidade) {
		this.fabricacaoEValidade = novoFabricacaoEValidade;
	}
	
	public double calcularTotal() {
		return preco * quantidade;
	}
	
	public String toString() {
		return  this.nome + "\n" + this.preco + "\n" + this.quantidade + "\n" + sobre.toString() + "\n" + sobre.toString() + fabricacaoEValidade.toString();
	}

}           
