package br.com.rubinhocar.modelo;

public class Veiculo {

	//n?o tem m?todo main, s? uma arquitetura
	
	private String montadora;
	private float valor;
	private short velocidadeAtual;
	private boolean status;
	private short velocidadeMaxima;
	private String modelo;
	// private pq tem o (-) antes do atributo no uml.
	
	
	//sintaxe dos metodos
	//<modificador> <tipo do retorno> <nome do metodo>( <tipo do param> <nome do param>...)
	
	public String retornarMontadora() {
		return montadora;
	}
	
	
	public void preencherMontadora(String param) {
		montadora = param;
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	
	public void preencherModelo(String param) {
		modelo = param;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	
	public void preencherValor(float param) {
		valor = param;
	}
 
		
	public void preencherBasico(boolean pStatus, short pvelocidadeMaxima) {
		status = pStatus;
		velocidadeMaxima = pvelocidadeMaxima;
		
	}
	
	public String retornarTudo() {
		return
				"Montadora" + montadora + "\n"+
				"Valor" + valor + "\n"+
				"Velocidade Atual" + velocidadeAtual + "\n"+
				"Status" + status + "\n"+
				"Modelo" + modelo + "\n"+
				"Velocidade Maxima" + velocidadeMaxima;
	}
	
	public float retornarDesconto() {
		return valor*(float)0.9;
		
	}
	
	public String ligar() {
		status = true;
		return "ligado";
	}
	public String desligar() {
		status = false;
		velocidadeAtual = 0;
		return "desligado";
	}
	
	public void acelerar(short velocidade) {
		if (status==true && (velocidadeAtual+velocidade)<=velocidadeMaxima){
		velocidadeAtual+=velocidade;}
	}
		public void desacelerar(short velocidade) {
			if (status==true && (velocidadeAtual-velocidade)>0){
			velocidadeAtual-=velocidade;
			}
	}
	
	
	
	
}
