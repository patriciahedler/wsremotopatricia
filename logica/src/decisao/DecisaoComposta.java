package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main (String[] args) {
		
		String disciplina =JOptionPane.showInputDialog("Digite o nome da disciplina").toUpperCase();
		float nota1 =  Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da primeira prova"));
		float nota2 =  Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da segunda prova"));
		float media = (nota1+nota2)/2;
		
		System.out.println("M?dia:" + media);
		if(media>= 6) {
					System.out.println("Parab?ns, voc? passou!");
	//se a primeira condi??o ? verdadeira, s? ? necess?rio um ?nico processamento
		} else if(media< 4) {
			System.out.println("Reprovado");
			
		} else {
			System.out.println("Exame");
 // no pior dos casos, agora s?o so 2 processamentos (antes eram 4)

}
	
	
}
}
