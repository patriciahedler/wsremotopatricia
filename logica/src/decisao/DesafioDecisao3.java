package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao3 {
	//exerc�cio 4 Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente
public static void main(String[] args) {
	int numero1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));
	int numero2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero inteiro e diferente do primeiro"));
	int numero3 =  Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero inteiro e diferente dos demais"));
	
	if (numero1 ==numero2 || numero2 ==numero3 ||numero3==numero1) {
		
	}
	else {
		if(numero1 > numero2 && numero2 > numero3) {
		System.out.println(numero1 +">"+ numero2 +">"+ numero3);
	}else if(numero3 > numero1 && numero2 > numero3) {
			System.out.println(numero2 +">"+ numero3 +">"+ numero1);
		}else if (numero1 > numero3 && numero3 > numero2) {
			System.out.println(numero1 +">"+ numero3 +">"+ numero2);
		}else if (numero1 > numero3 && numero3 > numero2) {
			System.out.println(numero1 +">"+ numero3 +">"+ numero2);
		}else if (numero2 > numero1 && numero1 > numero3) {
			System.out.println(numero2 +">"+ numero1 +">"+ numero3);
		}else if (numero3 > numero1 && numero1 > numero2) {
			System.out.println(numero3 +">"+ numero1 +">"+ numero2);
	} else
		System.out.println(numero3 +">"+ numero2 +">"+ numero1);
}
}
}
