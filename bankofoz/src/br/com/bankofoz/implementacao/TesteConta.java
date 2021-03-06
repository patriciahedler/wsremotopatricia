package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magica;

public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				2,
				"Maria",
				"05809323",
				"99453222"
				);
		
		
		Conta conta = new Conta();
		
		System.out.println(conta.toString());
		if (Magica.b("Abrir conta corrente?")==true) {
			conta = new Corrente(
					(short)12,
					(byte)4,
					(short)52,
					300,
					cliente,
					1000,
					10
					);
		} else {
			conta = new Poupanca(
					(short) Magica.i("Numero"),
					(byte) Magica.i("digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("rendimento")
					);
		}
		
		System.out.println(conta);
		conta.sacar(1000);
		System.out.println(conta.verificarSaldo());
		System.out.println(conta.depositar(1500));
		System.out.println(conta.verificarSaldo());

		if (conta instanceof Corrente) {
			((Corrente)conta).aumentarLimite(15);
		}else if (conta instanceof Poupanca) {
			((Poupanca)conta).creditarRendimentos();
			conta.verificarSaldo();
		}
		
	}
	
	
	
	
	
	
	
}
