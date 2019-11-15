package poo.trab.ufc.model;

import poo.trab.ufc.impl.*;

import java.util.ArrayList;

public abstract class Padrinho extends Usuario {
	
	private double valorMensalDoado;
	private CarteiraVirtual carteira;
	ArrayList<Apadrinhado> ListApadrinhados;

	public Padrinho() {
		ListApadrinhados = new ArrayList();
	}
	
	public Padrinho(double valorMensalDoado, CarteiraVirtual carteira) {
		super();
		this.valorMensalDoado = valorMensalDoado;
		this.carteira = carteira;
		ListApadrinhados = new ArrayList();
	}

	public double getValorMensalDoado() {
		return valorMensalDoado;
	}

	public void setValorMensalDoado(double valorMensalDoado) {
		this.valorMensalDoado = valorMensalDoado;
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

	@Override
	public String toString() {
		return "Padrinho [valorMensalDoado=" + valorMensalDoado + ", carteira=" + carteira + ", ListApadrinhados="
				+ ListApadrinhados + "]";
	}

	public abstract void doaValor();
	
	public boolean realizaCadastro(Padrinho p) {
		
	}
	
}
