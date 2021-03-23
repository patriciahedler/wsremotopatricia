package br.com.rubinhocar.teste;

import br.com.rubinhocar.modelo.Veiculo;
// ctrl shift O para importar o modelo

public class TesteVeiculo {
	
	public static void main(String[] args) {
	
		//instanciando um objeto
		Veiculo carro = new Veiculo();
		// os dois "veiculos" precisam estar com V ma�scuilo.
		carro.preencherMontadora("fiat");
		System.out.println(carro.retornarMontadora());
		
		carro.preencherModelo("mobi");
		System.out.println(carro.retornarModelo());
		
		carro.preencherValor(50000);
		System.out.println(carro.retornarValor());
		
		carro.preencherBasico(true, (short)120);
		
		System.out.println(carro.retornarTudo());
		System.out.println(carro.retornarDesconto());
		
		carro.ligar();
		carro.acelerar((short)30);
		System.out.println("Depois de acelerar: " + carro.retornarTudo());
	
		
		
	}
	
}
