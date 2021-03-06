package br.com.caicai;

public class Elevador {

	private String nome;
	private byte maxPessoas;
	private byte andarMax;
	private byte andarMin;
	private byte andarAtual;
	private byte qtePessoas;
	
	public void preencherInicializar (String pNome, byte pMaxPessoas, byte pAndarMax, byte pAndarMin ) {
		nome = pNome;
		maxPessoas = pMaxPessoas;
		andarMax = pAndarMax;
		andarMin = pAndarMin;
	}
	
	public String toString() {
		return nome + ","+ maxPessoas + "," + andarMax +","+ andarMin;
		
		}
	public void entrar(byte entrarPessoas) {
		if ((qtePessoas+entrarPessoas)<= maxPessoas){
		qtePessoas+=entrarPessoas;
		}
	}
	
	public void sair(byte sairPessoas) {
		if ((qtePessoas-sairPessoas)> 0){
		qtePessoas-=sairPessoas;
		}
	}
		public byte quantidadePessoas() {
			return qtePessoas;
		}

		
	
	
	
}
