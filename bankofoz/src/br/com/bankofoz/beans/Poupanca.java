package br.com.bankofoz.beans;

public class Poupanca extends Conta{

	private float rendimento;

	
	
	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	public void creditarRendimentos() {
		setSaldo( (rendimento*getSaldo()/100)+ getSaldo());
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", Conta=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
