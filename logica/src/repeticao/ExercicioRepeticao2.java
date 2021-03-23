package repeticao;

import javax.swing.JOptionPane;
/* Exercício 1
 * O jogador 1 irá digitar um número, o jogador 2
 * terá que advinhar o número digitado pelo jogador 1.
 * Somente quando ele acertar vai dar a mensagem de "Parabéns"
 * 
 * Missao1:
 * - dê dicas ao Jogador 2, se ele está chutando alto ou baixo.
 * 
 * Missao2:
 * - acrescentar na mensagem de Parabéns, quantas tentativas 
 * foram utilizadas até que o jogador 2 acertasse.
 * Dica: vai ter que utilizar uma variável pra contar.
 */
public class ExercicioRepeticao2 {
public static void main(String[] args) {
	int jogador1 = 0;
	int jogador2 = 0;
	int tentativas = 0;
	
	jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));	
	
	do {
		jogador2= Integer.parseInt(JOptionPane.showInputDialog("Digite o número que você acha que o jogador1 inseriu"));
		tentativas+= 1;
		//incrementa a variável, igual a colocar tentativa = tentativa + 1 ou tentativa++;
		
		if (jogador1 > jogador2) {
			System.out.println("Chute um número maior");
		}else if (jogador1<jogador2) {
			System.out.println("Chute um número menor");
				
		}
	
	} while(jogador1 !=jogador2);
	System.out.println("Parabéns,você acertou após " + tentativas +" vezes");
}
}
