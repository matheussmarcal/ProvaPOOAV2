package Prova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String data = JOptionPane.showInputDialog("Data Criacao: ");
		String Usuario= JOptionPane.showInputDialog("Nome usuario");
		String Nascimento = JOptionPane.showInputDialog("Data Nascimento ");
		String senha = JOptionPane.showInputDialog("Senha ");
		
		RedeSocial rede = new RedeSocial(data, Usuario, Nascimento, senha);
		
		String dataPublicacao= JOptionPane.showInputDialog("Data Publicao ");
		String textoPublicacao = JOptionPane.showInputDialog("texto Publicao ");
		String linkMidia = JOptionPane.showInputDialog("Link Midia ");
		
		Publicacao publi01 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
		rede.inserePublicacao(publi01);
		
		dataPublicacao= JOptionPane.showInputDialog("Data Publicao 2");
		textoPublicacao = JOptionPane.showInputDialog("texto Publicao  ");
		linkMidia = JOptionPane.showInputDialog("Link Midia ");
		
		Publicacao publi02 = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
		rede.inserePublicacao(publi02);
		
		rede.imprimePublicacao();
		
		
	
		

		
		
	}

}
