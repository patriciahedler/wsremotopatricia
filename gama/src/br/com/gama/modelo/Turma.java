package br.com.gama.modelo;

public class Turma {

	private String sigla;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	
	
	
	public Turma() {
		super();
	}

	public Turma(String sigla, String periodo, Curso curso, Aluno aluno, Professor professor) {
		super();
		this.sigla = sigla;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}

	public String getResumo() {
		return "Turma [nome aluno=" + aluno.getNome() + ", nome professor=" + professor.getNome() + ", descrição=" + curso.getDescricao() + ", sigla turma=" + sigla +"]";

				
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	
}
