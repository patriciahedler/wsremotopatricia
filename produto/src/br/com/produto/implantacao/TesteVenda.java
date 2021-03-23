package br.com.produto.implantacao;

import br.com.produto.modelo.Cliente;
import br.com.produto.modelo.Fabricante;
import br.com.produto.modelo.Produto;
import br.com.produto.modelo.Venda;

public class TesteVenda {

	public static void main(String[] args) {
		
		Venda venda = new Venda (
				123,
				1000,
				new Cliente(
						"Xpto",
						"vpto@xpto.com"
						),
				new Produto(
						1,
						"churros",
						new Fabricante(
								"1234565465",
								"churrolandia",
								"123-456"
								),
						10,
						5,
						1000
						)
				);
		
		System.out.println(venda.toString());
		System.out.println("Resumo" + venda.getResumo());
		System.out.println("Total Estoque Venda: " +venda.getProduto().totalEstoqueVenda());		
		System.out.println("Total Estoque Compra: " +venda.getProduto().totalEstoqueCompra());		
		
		
				
			
		
		}
	
	
	
	
	
	
	
}
