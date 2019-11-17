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
	
	public void realizaPasseio(Passeio p) {
		Scanner ler = new Scanner(System.in);
		
		 p.setDataDeSaida(ler.nextLine());
		 p.setDataDeRetorno(ler.nextLine());
		 p.setHorarioDeSaida(ler.nextLine());
		 p.setHorarioDeRetorno(ler.nextLine());
		 p.setHorarioDeRetorno(ler.nextLine());
		 
		 ler.close();
	}

}
