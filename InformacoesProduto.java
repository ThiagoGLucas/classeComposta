public class InformacoesProduto {
	private String tipo;
	private String categoria;
	
	public InformacoesProduto(String t, String c) {
		this.tipo = t;
		this.categoria = c;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String novoT) {
		this.tipo = novoT;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String novaC) {
		this.categoria = novaC;
	}
	
	public String toString() {
		return this.tipo + "\n" + this.categoria;
	}
}
