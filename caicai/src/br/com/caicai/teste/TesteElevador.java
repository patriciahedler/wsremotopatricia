package br.com.caicai.teste;

import br.com.caicai.Elevador;

public class TesteElevador {
 public static void main(String[] args) {
	
		Elevador elevador = new Elevador();
	
		elevador.preencherInicializar("Ana",(byte)10, (byte)15, (byte) 2);
		
		System.out.println(elevador.toString());
		
		elevador.entrar((byte)6);
		System.out.println(elevador.quantidadePessoas());
		elevador.entrar((byte)2);
		System.out.println(elevador.quantidadePessoas());
		
		elevador.sair((byte)3);
		System.out.println(elevador.quantidadePessoas());
	
}
}