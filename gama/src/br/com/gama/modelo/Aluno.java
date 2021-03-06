package br.com.gama.modelo;

/*
 * Design Pattern => ? um conjunto com as melhores praticas para 
 * programa??o com orienta??o a objeto
 * DTO (Data Transfer OBjetct) => ? um pattern que descreve as melhores pr?ticas
 * para representar uma classe de um diagrama em programa??o
 * Regras:
 * 1 - TODOS os atributos devem ser privados;
 * 2 - CADA atributo deve possuir INDIVIDUALMENTE um m?todo pra input (set) e outro m?todo pra output(get);
 * 3 - TODA classe modelo deve possuir NO MINIMO dois construtores:
 * -um vazio (n?o faz absolutamente nada)
 * -um cheio (preenchendo todos so atributos)
 * 
 *  * modelo = model = beans = javabeans = to = dto (pacotes com classes originadas do diagrama)
 * teste = principal = implementacao (pacotes com a(s) classe(s) que contenha(m) o main())
 * 
  */
public class Aluno {

	private String nome;
	private int matricula;
	private String email;
	private String fone;
	private Endereco endereco;
	
	
	public Aluno() {
		super();
	}

	

	public Aluno(String nome, int matricula, String email, String fone, Endereco endereco) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}



	// nome do construtor ? sempre o nome da classe	
	
	
	
	public String getUsuario() {
		if(email.contains("@")==true) {
			return "Usu?rio:" + email.substring(0,email.indexOf("@"));
		
		} return "email incompleto";			
	} 
	


	public void setAll(Endereco endereco, String nome, int matricula, String email, String fone) {
		this.endereco = endereco;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		//preenche todos os atributos de uma vez
	}
	
	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", fone=" + fone
				+ ", endereco=" + endereco + "]";
	}



	// this ? pra for?ar que o "nome" na esquerda ? um atributo.
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

		
	
	
	
}
