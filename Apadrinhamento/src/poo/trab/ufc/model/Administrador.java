package poo.trab.ufc.model;

import poo.trab.ufc.impl.*;
import java.util.List;
import java.util.ArrayList;

public class Administrador extends Usuario{
	
	ArrayList<SecretariaImpl> ListaSecretaria;
	
	public Administrador() {
		ListaSecretaria = new ArrayList();
	}

	public Administrador(ArrayList<SecretariaImpl> listaSecretaria) {
		super();
		ListaSecretaria = new ArrayList();
	}

	public ArrayList<SecretariaImpl> getListaSecretaria() {
		return ListaSecretaria;
	}

	public void setListaSecretaria(ArrayList<SecretariaImpl> listaSecretaria) {
		this.ListaSecretaria = listaSecretaria;
	}
	
	public void addSecretaria(SecretariaImpl s) {
		this.ListaSecretaria.add(s);
	}
	
	
	
	

}
