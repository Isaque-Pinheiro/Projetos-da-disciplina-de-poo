package poo.trab.ufc.model;

import poo.trab.ufc.impl.*;
import java.util.List;
import java.util.ArrayList;

public class Administrador extends Usuario{
	
	ArrayList<SecretariaImpl> ListaSecretaria;
	
	public Administrador() {
		ListaSecretaria = new ArrayList();
	}

	public Administrador(int id, String nome, String sobrenome, String cpf, int idade, ArrayList<SecretariaImpl> listaSecretaria) {
		super(id, nome, sobrenome, cpf, idade);
		ListaSecretaria = new ArrayList();
	}

	public ArrayList<SecretariaImpl> getListaSecretaria() {
		return ListaSecretaria;
	}

	public void setListaSecretaria(ArrayList<SecretariaImpl> listaSecretaria) {
		this.ListaSecretaria = listaSecretaria;
	}

}
