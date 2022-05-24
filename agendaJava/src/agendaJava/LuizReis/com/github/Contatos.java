package agendaJava.LuizReis.com.github;

import java.util.List;

public class Contatos {

	private List<Telefone> telefone;
	private List<Email> email;
	
	public Contatos(List<Telefone> telefone, List<Email> email) {
		this.telefone = telefone;
		this.email = email;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contatos [telefone=" + telefone + ", email=" + email + "]";
	}
	
	
	
}
