package br.com.gama.implementacao;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;
import br.com.gama.util.Magica;

public class TesteTurma2 {
	

	
	
	public static void main(String[] args) {
		Turma turma = new Turma(
				Magica.s("Sigla turma") ,
				Magica.s("Período"),
				new Curso(
						Magica.s("Sigla curso"),
						"JAVA GAMA",
						true,
						Magica.f("valor do curso"),
						(byte) 6,
						0
						),
											
				new Aluno(
						"REGINA",
						Magica.i("matricula"),
						"bruna@gama.academy",
						"1234-567",
						new Endereco()
						),
				new Professor (
						"CLEBER",
						"engenheiro",
						"exatas",
						new Endereco()
						)
				);
		
		System.out.println(turma.toString());
		// operacionalmente falando esse método demanda menos processamento
		// esse método usou 2 linhas só
				
				
				
				
				
				
	}
	
	
}
