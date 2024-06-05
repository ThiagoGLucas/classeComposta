public class Filme {
	private String nomeFilme;
	private String genero;
	private String classificacao;
	private String duracao;
	
	public Filme(String n, String g, String c, String d) {
		this.nomeFilme = n;
		this.genero = g;
		this.classificacao = c;
		this.duracao =d;
	}

	public String getNome() {
		return nomeFilme;
	}

	public void setNome(String nome) {
		this.nomeFilme = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public String toString() {
		return this.nomeFilme + "\n" + this.genero + "\n" + this.classificacao + "\n" + this.duracao + "\n\n";
	}
}
