package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main (String[] args) {
		
		String disciplina =JOptionPane.showInputDialog("Digite o nome da disciplina").toUpperCase();
		float nota1 =  Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da primeira prova"));
		float nota2 =  Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da segunda prova"));
		float media = (nota1+nota2)/2;
		
		System.out.println("M?dia:" + media);
		if(media>= 6) {
					System.out.println("Parab?ns, voc? passou!");
	
	}
		if(media>= 4 && media<6) {
			System.out.println("Exame");

}
		if(media< 4) {
			System.out.println("Reprovado");

}
	
	
}
}
