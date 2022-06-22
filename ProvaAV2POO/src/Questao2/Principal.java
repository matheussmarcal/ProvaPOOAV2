package Questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		AlunoEnem a1 = new AlunoEnem (null, 0, 0);
		
		System.out.println("Digite o nome do aluno");
		a1.setNome(ler.next());
		System.out.println("Digite o id do aluno");
		a1.setId_aluno(ler.nextInt());
		System.out.println("Digite o ano do aluno");
		a1.setAno(ler.nextInt());
		
		ArrayList<ProvaEnem> provas = new ArrayList<>();
		
		double notaFinal = 0;
		
		for (int i=0; i<5; i++) {
			
		System.out.println("Digite o ID da prova: ");
		int id_prova = ler.nextInt();
		System.out.println("Digite a nota da prova: ");
		int nota =ler.nextInt();
		System.out.println("Digite o titulo da prova: ");
		String titulo = ler.next();
		
		ProvaEnem prova = new ProvaEnem (id_prova, nota, titulo);
		
		provas.add(prova);
		notaFinal += prova.getNota();
		}
		System.out.println("Nota final: " + notaFinal);
	

	}

}
