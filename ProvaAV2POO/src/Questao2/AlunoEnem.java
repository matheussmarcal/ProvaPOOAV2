package Questao2;

public class AlunoEnem {

	String nome;
	int id_aluno;
	int ano;

	public AlunoEnem(String nome,int id_aluno, int ano) {
		super();

		this.nome = nome;
		this.id_aluno = id_aluno;
		this.ano = ano;

	}

	

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
