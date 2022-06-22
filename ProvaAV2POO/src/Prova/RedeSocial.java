package Prova;

import java.util.ArrayList;

public class RedeSocial {

	String dataCriacao;
	String nomeUsuario;
	String dataNascimento;
	String senha;

	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;

	}

	ArrayList<Publicacao> publicacoes = new ArrayList<>();

	public void inserePublicacao(Publicacao publi) {
		publicacoes.add(publi);
	}

	public void imprimePublicacao() {
		System.out.println("Contador " + Publicacao.getContadorPublicacao());

		for (int i = 0; i < publicacoes.size(); i++) {
			System.out.println("texto: " + publicacoes.get(i).getTextoPublicacao() + "   " + "Data: "
					+ publicacoes.get(i).getDataPublicacao() + "   " + "Link: " + publicacoes.get(i).getLinkMidia());

		}
	}
}