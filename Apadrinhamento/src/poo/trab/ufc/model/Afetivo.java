package poo.trab.ufc.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Afetivo extends Padrinho{
	
public Afetivo() {}
	
	public Afetivo(int id, String nome, String sobrenome, String cpf, int idade, double historicoDeValorDoado, CarteiraVirtual carteira, ArrayList<Apadrinhado> ListApadrinhados,  double valorDoacao) {
		super(id, nome, sobrenome, cpf, idade, historicoDeValorDoado, carteira, ListApadrinhados, valorDoacao);
	}
	
	public void realizaDoacao() {
		
	}

}
