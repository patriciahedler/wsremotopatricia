package repeticao;

import javax.swing.JOptionPane;
/*
 * Exercicio 2
Monte um programa que solicite a idade e o nome das pessoas. A aplica��o continuar� perguntando nome e idade enquanto o usu�rio afirmar que deseja continuar.
Ao terminar, a aplica��o dever� exibir:
- a quantidade de pessoas maiores de idade e 
- a m�dia entre todas as idades que foram digitadas. 
- a pessoa mais experiente (nome e idade)
- a pessoa mais jovem (nome e idade)
 */
public class ExercicioRepeticao {
public static void main(String[] args) {
	int idade = 0;
	String nome = "";
	
	int maiorid = 0;
	short totalIdades = 0;
	short qtePessoas = 0;
	String nomeMaisExp = "";
	int idadeMaisExp = 0;
	String nomeMaisJovem = "";
	int idadeMaisJovem = 0;
	//vc pode colocar = 999 pq qualquer idade inputada � maior que zero
	
	do {
		nome = JOptionPane.showInputDialog("Digite o nome");
		idade= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		if(idade>idadeMaisExp) {
			idadeMaisExp = idade;
			nomeMaisExp = nome;
		} // grava sempre o mais velho at� o momento
		
		if(idade<idadeMaisJovem || qtePessoas ==0) {
			idadeMaisJovem = idade;
			nomeMaisJovem = nome;
		} 
		
		
		qtePessoas+=1;
		totalIdades+=idade;
		
		if (idade>=18) {
			maiorid = maiorid +1;
		}
		
		
		}while(JOptionPane.showConfirmDialog(null, "Continuar?","Exerc�cio2", JOptionPane.YES_NO_OPTION)==0);
	//showConfirmDialog retorna um inteiro, o bot�o que vc selecionar. showInputDialog retorna uma String.
	
	System.out.println("Quantidade de pessoas maiores de idade:" + maiorid);
	JOptionPane.showMessageDialog(null, "Maiores de idade:" + maiorid);
	
	JOptionPane.showMessageDialog(null, "M�dia de idade:" + (totalIdades/qtePessoas));	

	JOptionPane.showMessageDialog(null, "nome mais experiente:" + nomeMaisExp +"n idade mais experiente" + "idadeMaisExp");	
	JOptionPane.showMessageDialog(null, "nome mais jovem:" + nomeMaisJovem +"n idade mais jovem" + "idadeMaisJovem");	
}
}



