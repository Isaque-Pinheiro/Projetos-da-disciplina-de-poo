package poo.trab.ufc.interfaces;
import poo.trab.ufc.model.*;

public interface Secretaria {
	
	public void cadastraApadrinhado(Apadrinhado ap);
	public void removeApadrinhado();
	public void editaApadrinhado();
	public boolean buscaApadrinhado(String cpf);
	public void liberaPasseio();

}
