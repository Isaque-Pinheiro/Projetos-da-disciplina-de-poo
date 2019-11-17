package poo.trab.ufc.model;
import poo.trab.ufc.impl.*;

import java.util.ArrayList;
import java.util.ArrayList;

public abstract class Padrinho extends Usuario {
	
	protected double historicoDeValorDoado;
	protected CarteiraVirtual carteira;
	protected ArrayList<Apadrinhado> ListApadrinhados;
	protected double valorDoacao;

	public Padrinho() {
		ListApadrinhados = new ArrayList();
	}
	
	public Padrinho(int id, String nome, String sobrenome, String cpf, int idade, double historicoDeValorDoado, CarteiraVirtual carteira, ArrayList<Apadrinhado> ListApadrinhados, double valorDoacao) {
		super(id, nome, sobrenome, cpf, idade);
		this.historicoDeValorDoado = historicoDeValorDoado;
		this.carteira = carteira;
		ListApadrinhados = new ArrayList();
		this.valorDoacao = valorDoacao;
	}

	public double getHistoricoDeValorDoado() {
		return historicoDeValorDoado;
	}

	public void setHistoricoDeValorDoado(double historicoDeValorDoado) {
		this.historicoDeValorDoado = historicoDeValorDoado;
	}

	public CarteiraVirtual getCarteira() {
		return carteira;
	}

	public void setCarteira(CarteiraVirtual carteira) {
		this.carteira = carteira;
	}

	public ArrayList<Apadrinhado> getListApadrinhados() {
		return ListApadrinhados;
	}

	public void setListApadrinhados(ArrayList<Apadrinhado> listApadrinhados) {
		this.ListApadrinhados = listApadrinhados;
	}

	public double getValorDoacao() {
		return valorDoacao;
	}

	public void setValorDoacao(double valorDoacao) {
		this.valorDoacao = valorDoacao;
	}

	@Override
	public String toString() {
		return "Padrinho [historicoDeValorDoado=" + historicoDeValorDoado + ", carteira=" + carteira
				+ ", ListApadrinhados=" + ListApadrinhados + ", valorDoacao=" + valorDoacao + "]";
	}

	public abstract void realizaDoacao();
	
}
