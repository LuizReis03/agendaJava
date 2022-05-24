package agendaJava.LuizReis.com.github;

public class Agenda {
	
	private Pessoa pessoa;
	
	public Agenda(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Agenda [pessoa=" + pessoa + "]";
	}
	
	
	
}
