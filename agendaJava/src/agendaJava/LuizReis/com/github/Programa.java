package agendaJava.LuizReis.com.github;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		//Cria os objetos email e telefone
		Email email1 = new Email("email@gmail.com");
		Telefone telefone1 = new Telefone("41","998564516");
		
		//Cria lista com os valores de email e telefone
		List<Email> emailLista = new ArrayList<>();
		emailLista.add(email1);
		List<Telefone> telefoneLista = new ArrayList<>();
		telefoneLista.add(telefone1);
		
		//Cria um objeto contato com os valores das listas email e tel
		Contatos contato1 = new Contatos(telefoneLista, emailLista);
		List<Contatos> contatoLista = new ArrayList<>();
		contatoLista.add(contato1);
		
		
		Pessoa pessoa1 = new Pessoa(contatoLista, "Matheus Bonnet");
		Agenda agenda1 = new Agenda(pessoa1);
		
		System.out.println(agenda1);

	}

}
