package poo.trab.ufc.model;
import java.util.Date;

public class Passeio {
	
	private String dataDeSaida;
	private String dataDeRetorno;
	private String horarioDeSaida;
	private String horarioDeRetorno;
	private String enderecoDoLocalVisitado;
	
	public Passeio() {}
	
	public Passeio(String dataDeSaida, String dataDeRetorno, String horarioDeSaida, String horarioDeRetorno,
			String enderecoDoLocalVisitado) {
		super();
		this.dataDeSaida = dataDeSaida;
		this.dataDeRetorno = dataDeRetorno;
		this.horarioDeSaida = horarioDeSaida;
		this.horarioDeRetorno = horarioDeRetorno;
		this.enderecoDoLocalVisitado = enderecoDoLocalVisitado;
	}

	public String getDataDeSaida() {
		return dataDeSaida;
	}

	public void setDataDeSaida(String dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}

	public String getDataDeRetorno() {
		return dataDeRetorno;
	}

	public void setDataDeRetorno(String dataDeRetorno) {
		this.dataDeRetorno = dataDeRetorno;
	}

	public String getHorarioDeSaida() {
		return horarioDeSaida;
	}

	public void setHorarioDeSaida(String horarioDeSaida) {
		this.horarioDeSaida = horarioDeSaida;
	}

	public String getHorarioDeRetorno() {
		return horarioDeRetorno;
	}

	public void setHorarioDeRetorno(String horarioDeRetorno) {
		this.horarioDeRetorno = horarioDeRetorno;
	}

	public String getEnderecoDoLocalVisitado() {
		return enderecoDoLocalVisitado;
	}

	public void setEnderecoDoLocalVisitado(String enderecoDoLocalVisitado) {
		this.enderecoDoLocalVisitado = enderecoDoLocalVisitado;
	}

	@Override
	public String toString() {
		return "Passeio [dataDeSaida=" + dataDeSaida + ", dataDeRetorno=" + dataDeRetorno + ", horarioDeSaida="
				+ horarioDeSaida + ", horarioDeRetorno=" + horarioDeRetorno + ", enderecoDoLocalVisitado="
				+ enderecoDoLocalVisitado + "]";
	}
	
}
