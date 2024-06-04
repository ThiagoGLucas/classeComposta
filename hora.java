public class Hora {
	private String hora;
	private String minutos;

	public Hora(String h, String m) {
		this.hora = h;
		this.minutos = m;
}
	
	public String getHora() {
		return hora;
	}
	
	public String getMinutos() {
		return minutos;
	}
	
	public void setHora(String novaHora) {
		this.hora = novaHora;
	}
	
	public void setMinutos(String novosMinutos) {
		this.minutos = novosMinutos;
	}
	
	public String toString() {
		return this.hora + ":" + this.minutos;
	}
}
