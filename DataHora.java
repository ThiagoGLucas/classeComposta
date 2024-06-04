public class DataHora {
	private Data data;
	private Hora hora;
	
	public DataHora(Data d, Hora h) {
		this.data = d;
		this.hora = h;
	}

	public void setData(Data novaData) {
		this.data = novaData;
	}
	public void setHora(Hora novaHora) {
		this.hora = novaHora;
	}
	
	public String toString() {
		return data.toString() + "\n" + hora.toString();
	}
	
}
