package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao2 {
	//exerc�cio 3 leia o valor de dois n�meros inteiros e a opera��o aritm�tica desejada
public static void main(String[] args) {
	int numero1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
	int numero2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro "));
	String operacao =  JOptionPane.showInputDialog("Digite a opera��o desejada");
	
	
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
