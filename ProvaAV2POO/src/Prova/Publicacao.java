package Prova;

public class Publicacao {

	String dataPublicacao;
	String textoPublicacao;
	String linkMidia;
	public static double ContadorPublicacao;

	public Publicacao(String dataCriacao, String nomeUsuario, String dataNascimento, String senha,
			String dataPublicacao, String textoPublicacao, String linkMidia, double contadorPublicacao) {

		this.dataPublicacao = dataPublicacao;
		this.textoPublicacao = textoPublicacao;
		this.linkMidia = linkMidia;
		ContadorPublicacao = contadorPublicacao;
	}

	public Publicacao(String dataPublicacao2, String textoPublicacao2, String linkMidia2) {
		// TODO Auto-generated constructor stub
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public String getTextoPublicacao() {
		return textoPublicacao;
	}

	public void setTextoPublicacao(String textoPublicacao) {
		this.textoPublicacao = textoPublicacao;
	}

	public String getLinkMidia() {
		return linkMidia;
	}

	public void setLinkMidia(String linkMidia) {
		this.linkMidia = linkMidia;
	}

	public static double getContadorPublicacao() {
		return ContadorPublicacao;
	}

}
