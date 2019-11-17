package poo.trab.ufc.model;
import java.util.ArrayList;
import java.util.Scanner;

public class Financeiro extends Padrinho {
	
	
	public Financeiro() {}
	
	public Financeiro(int id, String nome, String sobrenome, String cpf, int idade, double historicoDeValorDoado, CarteiraVirtual carteira, ArrayList<Apadrinhado> ListApadrinhados,  double valorDoacao) {
		super(id, nome, sobrenome, cpf, idade, historicoDeValorDoado, carteira, ListApadrinhados, valorDoacao);
	}
	Scanner ler = new Scanner(System.in);
	
	public void realizaDoacao() {
		
		
		
		
	}
	
	

}
