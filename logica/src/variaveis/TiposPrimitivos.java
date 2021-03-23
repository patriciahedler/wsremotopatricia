package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	public static void main(String[] args) {
		String time1 =JOptionPane.showInputDialog("Digite o Time1");
		String time2 = JOptionPane.showInputDialog("Digite o Time2");
		double entrada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o público"));
		// Classes wrappers: são classes que apoiam os tipos primitivos
		// int = Integer
		// double = Double
		double total = entrada * publico;
		
		System.out.printf("No jogo entre %s x %s a arrecadação foi de: %.2f",
				time1, time2, total);
		
				
	}
}
