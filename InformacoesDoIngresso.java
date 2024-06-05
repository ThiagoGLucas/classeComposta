public class InformacoesDoIngresso {
	private String nomeCinema;
	private Filme nomeFilme;
	private Pessoa proprietario;
	private Data dataDoFilme;
	private Hora horarioFilme;
	
	public InformacoesDoIngresso(String n, Filme nf, Pessoa p, Data d, Hora h) {
		this.nomeCinema = n;
		this.nomeFilme = nf;
		this.proprietario = p;
		this.dataDoFilme = d;
		this.horarioFilme = h;
	}

	public String getNomeCinema() {
		return nomeCinema;
	}

	public void setNomeCinema(String nomeCinema) {
		this.nomeCinema = nomeCinema;
	}
	
	public void setNomeFilme(Filme nomeFilme) {
		this.nomeFilme = nomeFilme;
	}


	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	public void setDataDoFilme(Data dataDoFilme) {
		this.dataDoFilme = dataDoFilme;
	}

	public void setHorarioFilme(Hora horarioFilme) {
		this.horarioFilme = horarioFilme;
	}
	
	public String toString() {
		return this.nomeCinema + "\n" + this.nomeFilme + "\n" + proprietario.toString() + "\n" + dataDoFilme.toString() + "\n" + horarioFilme.toString();
	}
}
