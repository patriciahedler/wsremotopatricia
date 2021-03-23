package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteAluno {
public static void main(String[] args) {
	Endereco endereco = new Endereco();
	endereco.setLogradouro("Avenida Itaquera");
	endereco.setNumero("34-fundos");
	endereco.setComplemento ("apt1");
	endereco.setBairro("itaquera");
	endereco.setCidade("são paulo");
	endereco.setUf("sp");
	endereco.setCep("1234432");
	
	Aluno aluno = new Aluno();
	aluno.setEndereco(endereco);
	aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
	aluno.setFone(JOptionPane.showInputDialog("Fone"));	
	aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
	aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula")));
	
	System.out.println(aluno.toString());
	System.out.println("Bairro  " + aluno.getEndereco().getBairro());
	
	Aluno aluno2 = new Aluno();
	
	aluno2.setAll(
			endereco,
			JOptionPane.showInputDialog("Nome 2").toUpperCase(),
			Integer.parseInt(JOptionPane.showInputDialog("Matricula2")),
			JOptionPane.showInputDialog("Email 2").toLowerCase(),
			JOptionPane.showInputDialog("Telefone 2")
			);
	
	
	System.out.println(aluno2.toString());
}
}
