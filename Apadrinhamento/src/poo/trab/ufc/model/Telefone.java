package poo.trab.ufc.model;

public class Telefone {
	
	private int ddd;
	private String numeroDeTelefone;
	private int codigoDeDiscagem;
	
	public Telefone() {}
	
	public Telefone(int ddd, String numeroDeTelefone, int codigoDeDiscagem) {
		super();
		this.ddd = ddd;
		this.numeroDeTelefone = numeroDeTelefone;
		this.codigoDeDiscagem = codigoDeDiscagem;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumeroDeTelefone() {
		return numeroDeTelefone;
	}

	public void setNumeroDeTelefone(String numeroDeTelefone) {
		this.numeroDeTelefone = numeroDeTelefone;
	}

	public int getCodigoDeDiscagem() {
		return codigoDeDiscagem;
	}

	public void setCodigoDeDiscagem(int codigoDeDiscagem) {
		this.codigoDeDiscagem = codigoDeDiscagem;
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numeroDeTelefone=" + numeroDeTelefone + ", codigoDeDiscagem="
				+ codigoDeDiscagem + "]";
	}
	
}
