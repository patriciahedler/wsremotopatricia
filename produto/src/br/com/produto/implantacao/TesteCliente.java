package br.com.produto.implantacao;

import javax.swing.JOptionPane;

import br.com.produto.modelo.Cliente;
import br.com.produto.modelo.PessoaFisica;
import br.com.produto.modelo.PessoaJuridica;

public class TesteCliente {
	public static void main(String[] args) {
		
		//criei pela sub e instanciei pela sub
		//PessoaFisica pf = new PessoaFisica();
		
		//criei pela super e instanciei pela sub
		// Cliente cli = new PessoaFisica();
		
		Cliente cliente = new Cliente();
		
		if(JOptionPane.showInputDialog("Digite <F> para fisica ou qualquer coisa para juridica").toUpperCase().equals("F")) {
		cliente = new PessoaFisica(
				"nome pf",
				"email@pf.com.br",
				"1234354",
				"12344-x"
				);
		
		}else {
			cliente = new PessoaJuridica(
					"nome pj",
					"email@pj,com.br",
					"123434343/33",
					"contato",
					"123.123.123"
					);
			
		}
		
		System.out.println(cliente.toString());
		System.out.println(cliente.getDocumentos());
		
	}
	
	
	
	
}
