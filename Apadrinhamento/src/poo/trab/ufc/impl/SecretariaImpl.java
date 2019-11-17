package poo.trab.ufc.impl;

import poo.trab.ufc.interfaces.*;
import poo.trab.ufc.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SecretariaImpl extends Usuario implements Secretaria {
	
	ArrayList<Apadrinhado> ListApadrinhados;
	ArrayList<Padrinho> ListPadrinhos;
	
	public SecretariaImpl() {
		ListApadrinhados = new ArrayList();
		ListPadrinhos = new ArrayList();
	}

	public SecretariaImpl(int id, String nome, String sobrenome, String cpf, int idade, ArrayList<Apadrinhado> listApadrinhados) {
		super(id, nome, sobrenome, cpf, idade);
		ListApadrinhados = new ArrayList();
		ListPadrinhos = new ArrayList();
	}

	public ArrayList<Apadrinhado> getListApadrinhados() {
		return ListApadrinhados;
	}

	public void setListApadrinhado(ArrayList<Apadrinhado> listApadrinhados) {
		this.ListApadrinhados = listApadrinhados;
	}

	public ArrayList<Padrinho> getListPadrinhos() {
		return ListPadrinhos;
	}

	public void setListPadrinhos(ArrayList<Padrinho> listPadrinhos) {
		ListPadrinhos = listPadrinhos;
	}

}
