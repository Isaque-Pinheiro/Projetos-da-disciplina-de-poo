package poo.trab.ufc.model;

public class Conta {
	
	private String titular;
	private int agencia;
	private String numeroDaConta;
	private int digito;
	private String tipoDeConta;
	private String nomeDoBanco;
	
	public Conta() {}
	
	public Conta(String titular, int agencia, String numeroDaConta, int digito, String tipoDeConta,
			String nomeDoBanco) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
		this.digito = digito;
		this.tipoDeConta = tipoDeConta;
		this.nomeDoBanco = nomeDoBanco;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}

	public String getNomeDoBanco() {
		return nomeDoBanco;
	}

	public void setNomeDoBanco(String nomeDoBanco) {
		this.nomeDoBanco = nomeDoBanco;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", agencia=" + agencia + ", numeroDaConta=" + numeroDaConta + ", digito="
				+ digito + ", tipoDeConta=" + tipoDeConta + ", nomeDoBanco=" + nomeDoBanco + "]";
	}
	
}
