package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		String nome =JOptionPane.showInputDialog("Digite seu nome");
		int idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		
		
		if(idade< 16) {
					System.out.println("Não pode votar");
	
	}
		if(idade>= 16 && idade<18 || idade>=70) {
			System.out.println("Voto facultativo");

}
		if(idade>=18 && idade<70) {
			System.out.println("Voto Obrigatório");

}
		
		
		
		
	}
}
