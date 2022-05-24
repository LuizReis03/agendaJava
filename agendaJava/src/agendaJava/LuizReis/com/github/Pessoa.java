package agendaJava.LuizReis.com.github;

import java.util.List;

public class Pessoa {

	private List<Contatos> contato;
	private String nome;
	
	public Pessoa(List<Contatos> contato, String nome) {
		this.contato = contato;
		this.nome = nome;
	}

	public List<Contatos> getContato() {
		return contato;
	}

	public void setContato(List<Contatos> contato) {
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [contato=" + contato + ", nome=" + nome + "]";
	}
	
	
	
}
