package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
 public static void main(String[] args) {
	String nomeproduto = JOptionPane.showInputDialog("Digite o nome do produto");
	int quantidade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
	float imposto =  Float.parseFloat(JOptionPane.showInputDialog("Digite o imposto relativo ao produto"));
	double valor =  Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
	
	double valorcomimposto = ((imposto/100) * valor) + valor;
	double valorimposto = (imposto/100) * valor;
	double valortotalimp = (((imposto/100) * valor) + valor) * quantidade;
	double valortotsemimp = valor * quantidade;
	
	System.out.printf("O valor unit�rio considerando o imposto � %.2f;", valorcomimposto);
	System.out.printf("O valor de imposto por unidade � %.2f;", valorimposto);
	System.out.printf("O valor total da compra � %.2f;", valortotalimp);
	System.out.printf("O valor total da compra sem imposto � %.2f", valortotsemimp);
	
	
	
	 
	 
	 
	 
}
}
