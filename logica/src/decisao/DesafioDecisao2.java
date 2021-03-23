package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao2 {
	//exercício 3 leia o valor de dois números inteiros e a operação aritmética desejada
public static void main(String[] args) {
	int numero1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
	int numero2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro "));
	String operacao =  JOptionPane.showInputDialog("Digite a operação desejada");
	
	
	if(operacao.contentEquals("+")) {
		System.out.println(numero1+numero2);
	}else if(operacao.contentEquals("-")) {
		System.out.println(numero1-numero2);
	}else if(operacao.contentEquals("*")) {
		System.out.println(numero1*numero2);
	}else if(operacao.contentEquals("/")) {
		System.out.println(numero1/numero2);
	}
		
}
}
