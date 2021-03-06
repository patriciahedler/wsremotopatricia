package br.com.gama.implementacao;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		Professor professor = new Professor();
		// Professor() ? um construtor
		
		professor.setFormacao("matematica");
		professor.setNome("luis");
		
		Endereco endereco = new Endereco();
		professor.setEndereco(endereco);
		endereco.setBairro("belem");
		
		System.out.println(professor.getResumo());
		
		Curso curso = new Curso();
		curso.setPorcentagem(10);
		curso.setValor(200);
		curso.setDescricao("Calculo 1");
		System.out.println(curso.atualizarValor());
		
		Turma turma = new Turma ();
		turma.setProfessor(professor);
		turma.setCurso(curso);
		turma.setSigla("calc1");
		
		Aluno aluno = new Aluno();
		turma.setAluno(aluno);
		aluno.setNome("joao");
		aluno.setEmail("joaodasilva@gmail.com");
		
		
		
		System.out.println(turma.getResumo());
		System.out.println(aluno.getUsuario());
				
	
	
	
	
	
	
	
	
	
	}	
}
