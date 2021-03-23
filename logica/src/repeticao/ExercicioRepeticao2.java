package repeticao;

import javax.swing.JOptionPane;
/* Exerc�cio 1
 * O jogador 1 ir� digitar um n�mero, o jogador 2
 * ter� que advinhar o n�mero digitado pelo jogador 1.
 * Somente quando ele acertar vai dar a mensagem de "Parab�ns"
 * 
 * Missao1:
 * - d� dicas ao Jogador 2, se ele est� chutando alto ou baixo.
 * 
 * Missao2:
 * - acrescentar na mensagem de Parab�ns, quantas tentativas 
 * foram utilizadas at� que o jogador 2 acertasse.
 * Dica: vai ter que utilizar uma vari�vel pra contar.
 */
public class ExercicioRepeticao2 {
public static void main(String[] args) {
	int jogador1 = 0;
	int jogador2 = 0;
	int tentativas = 0;
	
	jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));	
	
	do {
		jogador2= Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que voc� acha que o jogador1 inseriu"));
		tentativas+= 1;
		//incrementa a vari�vel, igual a colocar tentativa = tentativa + 1 ou tentativa++;
		
		if (jogador1 > jogador2) {
			System.out.println("Chute um n�mero maior");
		}else if (jogador1<jogador2) {
			System.out.println("Chute um n�mero menor");
				
		}
	
	} while(jogador1 !=jogador2);
	System.out.println("Parab�ns,voc� acertou ap�s " + tentativas +" vezes");
}
}
