package br.caelum.jdbc.teste;

import java.util.Calendar;

import br.caelum.jdbc.dao.ContatoDAO;
import br.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());

		ContatoDAO dao = new ContatoDAO();

		dao.adiciona(contato);
		System.out.println("Gravado");

	}
}
